/**
 * ServiceRegistryServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package de.stutt.ba.serviceregistry.serviceregistry;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.Binding;
import model.EncodingType;
import model.NotProvisionedService;
import model.ProtocolType;
import model.ProvisionedService;
import model.ServiceConfiguration;
import model.ServiceInterface;
import model.ServiceOffer;
import model.ServiceQuality;
import model.Token;
import model.User;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import constants.EnvConfiguration;
import util.AuthorizationUtil;
import util.HibernateUtil;
import util.Logger;

/**
 * ServiceRegistryServiceSkeleton java skeleton for the axisService
 */
public class ServiceRegistryServiceSkeleton {

	/**
	 * Converts the inner business logic model with the generated AXIS-Models
	 * used to communicate over SOAP Calls.
	 * 
	 * @param serviceProviderName
	 *            - the unique name of the user as a ServiceProvider
	 * @return abstractService
	 */

	public de.stutt.ba.serviceregistry.serviceregistry.AbstractService searchByProvider(
			java.lang.String serviceProviderName) {
		Session hibSess = HibernateUtil.getSessionFactory().openSession();
		try {
			User serviceProvider = (User) hibSess.load(User.class,
					serviceProviderName);
			if (serviceProvider != null) {
				return loadServicesByCriteria("serviceProvider",
						serviceProvider, hibSess);
			} else {
				return new AbstractService();
			}
		} catch (Exception e) {
			Logger.log("Could not search By Provider, something went wrong.");
			return new AbstractService(); // TODO or null? for failure?
		} finally {
			hibSess.close();
		}
		// throw new java.lang.UnsupportedOperationException("Please implement "
		// + this.getClass().getName() + "#searchByProvider");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param registerUserRequestResource
	 * @return booleanResource
	 */

	public de.stutt.ba.serviceregistry.serviceregistry.BooleanResource registerUser(
			de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource registerUserRequestResource) {
		Session hibSess = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = hibSess.beginTransaction();
		try {
			RegisterUserRequestResource rs = registerUserRequestResource;
			User user = new User(rs.localName, rs.localPassword, rs.localEMail);
			hibSess.save(user);
			tx.commit();
			return getBoolRes(true);
		} catch (Exception e) {
			Logger.log("Could not save User.");
			return getBoolRes(false);
		} finally {
			hibSess.close();
		}
		// throw new java.lang.UnsupportedOperationException("Please implement "
		// + this.getClass().getName() + "#registerUser");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param serviceConfigurationName
	 * @return abstractService1
	 */

	public de.stutt.ba.serviceregistry.serviceregistry.AbstractService searchByServiceConfiguration(
			java.lang.String serviceConfigurationName) {
		Session hibSess = HibernateUtil.getSessionFactory().openSession();
		try {
			Criteria configCriteria = hibSess
					.createCriteria(ServiceConfiguration.class);
			configCriteria.add(Restrictions
					.eq("name", serviceConfigurationName));
			// unique Result! Dont allow same names for different
			// ServiceConfigurations!
			ServiceConfiguration config = (ServiceConfiguration) configCriteria
					.uniqueResult();
			return loadServicesByCriteria("serviceConfiguration", config,
					hibSess);
		} catch (Exception e) {
			Logger.log("Could not search By ServiceConfiguration, something went wrong.");
			return new AbstractService(); // TODO or null?
		} finally {
			hibSess.close();
		}

		// throw new java.lang.UnsupportedOperationException("Please implement "
		// + this.getClass().getName() + "#searchByServiceConfiguration");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param createNotProvisionedServiceRequestResource
	 * @return longResource
	 */

	public de.stutt.ba.serviceregistry.serviceregistry.LongResource createNotProvisionedService(
			de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource createNotProvisionedServiceRequestResource) {
		// TODO UNTERSCHEIDUNG SHARED / DEDICATED
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#createNotProvisionedService");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param loginUserRequestResource
	 * @return token
	 */

	public java.lang.String loginUser(
			de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource loginUserRequestResource) {
		Session hibSess = HibernateUtil.getSessionFactory().openSession();
		try {
			Criteria criteria = hibSess.createCriteria(User.class);
			criteria.add(Restrictions.eq("userName",
					loginUserRequestResource.localName.toLowerCase()));
			criteria.add(Restrictions.eq("userPassword", AuthorizationUtil
					.scramblePassword(loginUserRequestResource.localPassword)));
			User user = (User) criteria.uniqueResult();
			if (user != null) {
				Token token = Token.createToken(
						Integer.parseInt(EnvConfiguration.getTokenLength()),
						null);
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.HOUR_OF_DAY, Integer.parseInt(EnvConfiguration
						.getTokenMinuteDuration()));
				token.setValidUntil(cal.getTimeInMillis());
				return token.getToken();
			} else {
				return ""; // TODO or null?
			}
		} catch (Exception e) {
			Logger.err("Could not login User, something went wrong.");
			return ""; // TODO or null?
		} finally {
			hibSess.close();
		}
		// throw new java.lang.UnsupportedOperationException("Please implement "
		// + this.getClass().getName() + "#loginUser");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param createServiceConfigurationRequestResource
	 * @return longResource3
	 */

	public de.stutt.ba.serviceregistry.serviceregistry.LongResource createServiceConfiguration(
			de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource createServiceConfigurationRequestResource) {
		Session hibSess = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = hibSess.beginTransaction();
		try {
			// first, check if ServiceInterface with the qualified name
			// provided, even exists
			Criteria crit = hibSess.createCriteria(ServiceInterface.class);
			crit.add(Restrictions
					.eq("portTypeName",
							createServiceConfigurationRequestResource.localPortTypeName));
			ServiceInterface sInterface = (ServiceInterface) crit
					.uniqueResult();
			// TODO needs another method "createServiceInterface"
			if (sInterface != null) {
				// it exists, keep going, get Qualities
				MapModel qualities = createServiceConfigurationRequestResource.localServiceQuality;
				// Entry_type0[] is an Array of Objects, that store a single
				// Quality in each index by two values (Strings):
				// Entry_type0.localKey is the name of the Quality,
				// Entry_type0.localValue is the value of the Quality
				Entry_type0[] arr = qualities.localEntry;
				ServiceConfiguration config = new ServiceConfiguration();
				config.setServiceInterface(sInterface);
				List<ServiceQuality> sQualities = new ArrayList<ServiceQuality>();
				for (int i = 0; i < arr.length; i++) {
					// check if Quality exists in database, if it does, take it
					// to avoid duplicates
					Criteria qualityCrit = hibSess
							.createCriteria(ServiceQuality.class);
					qualityCrit.add(Restrictions.eq("qualityKey",
							arr[i].localKey));
					qualityCrit.add(Restrictions.eq("qualityValue",
							arr[i].localValue));
					ServiceQuality quality = (ServiceQuality) qualityCrit
							.uniqueResult();
					if (quality == null) {
						// does not exist yet, create new one
						quality = new ServiceQuality(arr[i].localKey,
								arr[i].localValue);
					}
					sQualities.add(quality);
				}
				config.setServiceQualities(sQualities);
				Long configId = (Long) hibSess.save(config);
				tx.commit();
				return getLongRes(configId);
			} else {
				// interface doesnt exist, return -1 as long or "null"
				return getLongRes(-1L); // TODO or null?
			}
		} catch (Exception e) {
			Logger.err("Could not create ServiceConfiguration, something went wrong.");
			return getLongRes(-1L); // TODO or null?
		} finally {
			hibSess.close();
		}
		// throw new java.lang.UnsupportedOperationException("Please implement "
		// + this.getClass().getName() + "#createServiceConfiguration");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param createProvisionedServiceRequestResource
	 * @return longResource4
	 */

	public de.stutt.ba.serviceregistry.serviceregistry.LongResource createProvisionedService(
			de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource createProvisionedServiceRequestResource) {
		Session hibSess = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = hibSess.beginTransaction();
		try {
			// TODO NEEDS SERVICE CONFIGURATION! in here!
			CreateProvisionedServiceRequestResource cpr = createProvisionedServiceRequestResource;
			// load Service Provider per Token
			Token token = (Token) hibSess.load(Token.class, cpr.localAuthToken);
			if (token != null) {
				ProvisionedService service = new ProvisionedService();
				// legit action, since Token is equivalent of knowing User (Name
				// and Password)
				User user = (User) hibSess
						.load(User.class, token.getUserName());
				service.setServiceProvider(user);
				service.setWsdlAdress(cpr.localWsdlAddress);
				Binding binding = new Binding();
				binding.setEncType(EncodingType
						.valueOf(cpr.localEncodeType.localEncodeType));
				binding.setProtocolType(ProtocolType
						.valueOf(cpr.localProtocolType.localProtocolType));
				service.setBinding(binding);
				service.setEndPoint(cpr.localEndPoint);
				service.setName(cpr.localName);
				Long longNumber = (Long) hibSess.save(service);
				return getLongRes(longNumber);
			} else {
				return getLongRes(-1); // TODO or null?
			}
		} catch (Exception e) {
			Logger.err("Could not create ProvisionedService, something went wrong");
			return getLongRes(-1); // TODO or null?
		} finally {
			hibSess.close();
		}
		// throw new java.lang.UnsupportedOperationException("Please implement "
		// + this.getClass().getName() + "#createProvisionedService");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param qualifiedPortTypeName
	 * @return abstractService6
	 */

	public de.stutt.ba.serviceregistry.serviceregistry.AbstractService searchByQualifiedPortTypeName(
			java.lang.String qualifiedPortTypeName) {
		Session hibSess = HibernateUtil.getSessionFactory().openSession();
		try {
			Criteria interfaceCriteria = hibSess
					.createCriteria(ServiceInterface.class);
			interfaceCriteria.add(Restrictions
					.eq("name", qualifiedPortTypeName));
			ServiceInterface sInterface = (ServiceInterface) interfaceCriteria.uniqueResult();
			// next, get all ServiceConfigurations, using this interface
			Criteria configurationCriteria = hibSess
					.createCriteria(ServiceConfiguration.class);
			configurationCriteria.add(Restrictions.eq("serviceInterface",
					sInterface));
			List<ServiceConfiguration> configList = configurationCriteria
					.list();
			AbstractServiceSequence[] seq = new AbstractServiceSequence[0];
			for (ServiceConfiguration config : configList) {
				AbstractService sr = loadServicesByCriteria(
						"serviceConfiguration", config, hibSess);
				seq = concat(seq, sr.getAbstractServiceSequence());
			}
			AbstractService completeList = new AbstractService();
			completeList.setAbstractServiceSequence(seq);
			return completeList;
		} catch (Exception e) {
			Logger.log("Could not search by QualifiedPortName, something went wrong.");
			return new AbstractService();
		} finally {
			hibSess.close();
		}

		// throw new java.lang.UnsupportedOperationException("Please implement "
		// + this.getClass().getName() + "#searchByQualifiedPortTypeName");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param editNotProvisionedServiceRequestResource
	 * @return booleanResource7
	 */

	public de.stutt.ba.serviceregistry.serviceregistry.BooleanResource editNotProvisionedService(
			de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource editNotProvisionedServiceRequestResource) {
		// TODO NEED ANOTHER METHOD, TO KNOW WHETHER DEDICATED OR SHARED
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#editNotProvisionedService");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param serviceOfferId
	 * @return booleanResource9
	 */

	public de.stutt.ba.serviceregistry.serviceregistry.BooleanResource deleteService(
			de.stutt.ba.serviceregistry.serviceregistry.LongResource serviceOfferId) {
		Session hibSess = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = hibSess.beginTransaction();
		try {
			ServiceOffer service = (ServiceOffer) hibSess.load(
					ServiceOffer.class, serviceOfferId.localLongResource);
			if (service != null) {
				hibSess.delete(service);
				tx.commit();
				return getBoolRes(true);
			} else {
				return getBoolRes(false);
			}
		} catch (Exception e) {
			Logger.err("Could not delete ServiceOffer, something went wrong.");
			return getBoolRes(false);
		} finally {
			hibSess.close();
		}
		// throw new java.lang.UnsupportedOperationException("Please implement "
		// + this.getClass().getName() + "#deleteService");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param editProvisionedServiceRequestResource
	 * @return booleanResource10
	 */

	public de.stutt.ba.serviceregistry.serviceregistry.BooleanResource editProvisionedService(
			de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource editProvisionedServiceRequestResource) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#editProvisionedService");
	}

	private AbstractService loadServicesByCriteria(String fieldName,
			Object fieldValue, Session hibSess) {
		if (fieldValue != null) {
			Criteria crit = hibSess.createCriteria(ServiceOffer.class);
			crit.add(Restrictions.eq(fieldName, fieldValue));
			List<ServiceOffer> offerList = crit.list();
			// make sure this user is actually a ServiceProvider of any
			// ServiceOffer, he may be just a consumer as well
			if (offerList != null) {
				int serviceArraySize = offerList.size();
				AbstractServiceSequence[] seqArray = new AbstractServiceSequence[serviceArraySize];
				int serviceCounter = 0;
				for (ServiceOffer serviceOffer : offerList) {
					seqArray[serviceCounter].localName = serviceOffer.getName();
					seqArray[serviceCounter].localWsdlAddress = serviceOffer
							.getWsdlAdress();
					EncodeType_type1 encodeType = new EncodeType_type1(
							serviceOffer.getBinding().getEncType().toString(),
							true);
					seqArray[serviceCounter].localEncodeType = encodeType;
					ProtocolType_type1 protocolType = new ProtocolType_type1(
							serviceOffer.getBinding().getProtocolType()
									.toString(), true);
					seqArray[serviceCounter].localProtocolType = protocolType;
					if (serviceOffer instanceof ProvisionedService) {
						seqArray[serviceCounter].localEndPoint = ((ProvisionedService) serviceOffer)
								.getEndPoint();
					} else if (serviceOffer instanceof NotProvisionedService) {
						seqArray[serviceCounter].localPackageAddress = ((NotProvisionedService) serviceOffer)
								.getPackageAddress();
					}
				}
				AbstractService serviceList = new AbstractService();
				serviceList.localAbstractServiceSequence = seqArray;
				return serviceList;
			} else {
				return new AbstractService();
			}
		} else {
			return new AbstractService();
		}
	}

	private BooleanResource getBoolRes(boolean bool) {
		BooleanResource res = new BooleanResource();
		res.localBooleanResource = bool;
		return res;
	}

	private LongResource getLongRes(long longNumber) {
		LongResource res = new LongResource();
		res.localLongResource = longNumber;
		return res;
	}

	private AbstractServiceSequence[] concat(AbstractServiceSequence[] a,
			AbstractServiceSequence[] b) {
		int lengthA = a.length;
		int lengthB = b.length;
		AbstractServiceSequence[] c = new AbstractServiceSequence[lengthA
				+ lengthB];
		System.arraycopy(a, 0, c, 0, lengthA);
		System.arraycopy(b, 0, c, lengthA, lengthB);
		return c;
	}
}
