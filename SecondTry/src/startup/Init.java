package startup;

import model.User;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import constants.EnvConfiguration;
import util.AuthorizationUtil;
import util.HibernateUtil;
import util.Logger;

public class Init {
	public static void initialize(){
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		try{
			// create admin user
			// test if user exists, before inserting
			boolean userExistsOrError = false;
			try{
				Criteria crit = s.createCriteria(User.class);
				crit.add(Restrictions.eq("userName", EnvConfiguration.getDefaultUsername()));
				crit.add(Restrictions.eq("userPassword", AuthorizationUtil.scramblePassword(EnvConfiguration.getDefaultUserPassword())));
				User dbUser = (User) crit.uniqueResult();
				if (dbUser != null){
					userExistsOrError = true;
				}
			} catch (Exception e){
				e.printStackTrace();
				userExistsOrError = true;
			}
			if (!userExistsOrError){
				User user = new User(EnvConfiguration.getDefaultUsername(), AuthorizationUtil.scramblePassword(EnvConfiguration.getDefaultUserPassword()), EnvConfiguration.getDefaultUserMail());
				s.save(user);
				tx.commit();				
			}
		} catch (Exception e){
			e.printStackTrace();
			Logger.err("Es ist etwas beim Initialisieren schiefgegangen");
		} finally {
			s.close();
		}
	}
}
