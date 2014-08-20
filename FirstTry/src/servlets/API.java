package servlets;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.AuthorizationUtil;
import util.HibernateUtil;
import util.Logger;
import model.AbstractService;
import model.EncodingType;
import model.ProtocolType;
import model.ServiceQuality;
import model.Token;
import model.Token.SaveTokenCallback;
import model.User;


public class API implements IServiceRegistryAPI{

	@Override
	public boolean registerUser(String name, String password, String eMail) {
		User user = new User(name, password, eMail);
		Session s = HibernateUtil.getSessionFactory().openSession();
		try{
			Transaction tx = s.beginTransaction();
			s.save(user);
			tx.commit();
			return true;
		} catch(Exception e){
			Logger.err("Could not save user");
		} finally {
			s.close();
		}
		return false;
	}

	@Override
	public String loginUser(String name, String password) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		try{
			Criteria crit = s.createCriteria(User.class);
			crit.add(Restrictions.eq("userName", name));
			crit.add(Restrictions.eq("userPassword", AuthorizationUtil.scramblePassword(password)));
			User user = (User) crit.uniqueResult();
			final String userName = user.getUserName();
			if (user != null){
				Token token = user.getToken();
					SaveTokenCallback cb = new SaveTokenCallback() {
						@Override
						public boolean save(final Token pToken, final Session session) {
							User usr = (User) session.load(User.class, userName);
							usr.setToken(pToken);
							session.save(usr);
							return true;
						}
					};
					token = Token.createToken(7, cb);
					user.setToken(token);
					s.save(user);
					return token.getToken();
			}
		} catch(Exception e){
			Logger.err("Could not load user, maybe wrong name/password combination.");
		}finally {
			s.close();
		}
		return null;
	}

	@Override
	public long createProvisionedService(String Name, String wsdlAddress,
			EncodingType encType, ProtocolType protocolType,
			String endPoint, String authenticationToken) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long createNotProvisionedService(String Name, String wsdlAddress,
			EncodingType encType, ProtocolType protocolType,
			String packageAddress, String authenticationToken) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean editProvisionedService(long serviceID, String newName,
			String newWsdlAddress, EncodingType newEncType,
			ProtocolType newProtocolType, String newEndPoint,
			String authenticationToken) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editNotProvisionedService(long serviceID, String newName,
			String newWsdlAddress, EncodingType newEncType,
			ProtocolType newProtocolType, String newPackageAdress,
			String authenticationToken) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteService(long serviceID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long createServiceConfiguration(String name, String wsdlAddress,
			String portTypeName, ServiceQuality quality) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AbstractService> searchByProvider(String providerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AbstractService> searchByServiceConfiguration(
			String serviceConfigurationName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AbstractService> searchByQualifiedPortTypeName(
			String qualifiedPortTypeName) {
		// TODO Auto-generated method stub
		return null;
	}


}
