package servlets;
import java.util.List;

import model.AbstractService;
import model.EncodingType;
import model.ProtocolType;
import model.ServiceQuality;

public interface IServiceRegistryAPI {
	/**
	 * Registers user and saves him in Database of system.
	 * 
	 * @param name
	 *            - the login name of the user (unique)
	 * @param password
	 *            - the password of the user
	 * @param eMail
	 *            - an optional E-Mail of the user (can be null or empty)
	 * @return true if the registration was successful, false otherwise
	 */
	public boolean registerUser(String name, String password, String eMail);

	/**
	 * Authorizes the user in the system, by sending him an Authentication-Token
	 * (as UUID), valid for a certain amount of time.
	 * 
	 * @param name
	 *            - the name of the user to login
	 * @param password
	 *            - the password of the user provided in registration
	 * @return a Token as String to send for further requests, proving his
	 *         authentication or null if something failed
	 */
	public String loginUser(String name, String password);

	/**
	 * Creates a provisioned Service in the ServiceRegistry.
	 * 
	 * @param Name
	 *            - the name for the Service
	 * @param wsdlAddress
	 *            - an address or link to an uploaded wsdl file
	 * @param encType
	 *            - the message Format determining the Type of Encoding, e.g.
	 *            SOAP
	 * @param protocolType
	 *            - the used protocol for Communication, e.g. HTTP
	 * @param endPoint
	 *            - the Endpoint Address for communication with the provisioned
	 *            Service
	 * @param authenticationToken
	 *            - the Token used to authenticate a user in the system
	 * @return a non-negative long for the ServiceID or "-1" if the
	 *         Registration/Creation failed
	 */
	public long createProvisionedService(String Name, String wsdlAddress,
			EncodingType encType, ProtocolType protocolType,
			String endPoint, String authenticationToken);

	/**
	 * 
	 * @param Name
	 *            - the name for the Service
	 * @param wsdlAddress
	 *            - an address or link to an uploaded wsdl file
	 * @param encType
	 *            - the message Format determining the Type of Encoding, e.g.
	 *            SOAP
	 * @param protocolType
	 *            - the used protocol for Communication, e.g. HTTP
	 * @param packageAddress
	 *            - the Address/Link to the Provisioning Package in the Service
	 *            Package Repository to setup the Service
	 * @param authenticationToken
	 *            - the Token used to authenticate a user in the system
	 * @return a non-negative long for the ServiceID or "-1" if the
	 *         Registration/Creation failed
	 */
	public long createNotProvisionedService(String Name, String wsdlAddress,
			EncodingType encType, ProtocolType protocolType,
			String packageAddress, String authenticationToken);

	/**
	 * Edit a provisioned Service, by providing non-null and non-empty
	 * information. Any information, that is not provided, wont be changed for
	 * the service.
	 * 
	 * @param serviceID
	 *            - the id of the service to edit
	 * @param newName
	 *            - a new name for the service
	 * @param newWsdlAddress
	 *            - a new wsdl Address/Link for the service
	 * @param newEncType
	 *            - a new Encoding/Message Format Type for the Service, e.g.
	 *            SOAP
	 * @param newProtocolType
	 *            - a new Protocol Type for Communication, e.g. HTTP
	 * @param newEndPoint
	 *            - a new Endpoint for the Service
	 * @param authenticationToken
	 *            - the Token used to authenticate a user in the system
	 * @return true, if editing the provisioned Service was successful, false
	 *         otherwise
	 */
	public boolean editProvisionedService(long serviceID, String newName,
			String newWsdlAddress, EncodingType newEncType,
			ProtocolType newProtocolType, String newEndPoint,
			String authenticationToken);

	/**
	 * Edit a NotProvisionedService, by providing non-null and non-empty
	 * information. Any information, that is not provided, wont be changed for
	 * the service.
	 * 
	 * @param serviceID
	 *            - the id of the service to edit
	 * @param newName
	 *            - a new name for the service
	 * @param newWsdlAddress
	 *            - a new wsdl Address/Link for the service
	 * @param newEncType
	 *            - a new Encoding/Message Format Type for the Service, e.g.
	 *            SOAP
	 * @param newProtocolType
	 *            - a new Protocol Type for Communication, e.g. HTTP
	 * @param newPackageAdress
	 *            - a new Address / Link to the Service Package for setup
	 * @param authenticationToken
	 *            - the Token used to authenticate a user in the system
	 * @return true, if editing the NotProvisioned Service was successful,
	 *         false otherwise
	 */
	public boolean editNotProvisionedService(long serviceID, String newName,
			String newWsdlAddress, EncodingType newEncType,
			ProtocolType newProtocolType, String newPackageAdress,
			String authenticationToken);

	/**
	 * Deletes the specified service.
	 * 
	 * @param serviceID
	 *            - the ID of the service to delete
	 * @return true, if the service was successfully deleted, false if it failed
	 *         or there was no service with serviceID to delete
	 */
	public boolean deleteService(long serviceID);

	/**
	 * Creates a ServiceConfiguration. A ServiceConfiguration is the combination
	 * of functional requirements, stated in a portType and non-functional
	 * requirements defined in the ServiceQuality Object.
	 * 
	 * @param name - the name of the ServiceConfiguration
	 * @param wsdlAddress - the Address of the abstract wsdl part, defining the functional requirements of a Service.
	 * @param portTypeName - the name (namespace or qualified name) of the portType
	 * @param quality - a ServiceQuality Pbject, that defines non-functional requirements for a Service in form of a Map
	 * @return ServiceConfigurationID non-negative, or -1 if creation failed
	 */
	public long createServiceConfiguration(String name, String wsdlAddress,
			String portTypeName, ServiceQuality quality);

	/* SERVICE DISCOVERY METHODS (doing internal Service Discovery and Selection) */
	
	/**
	 * Searches for Services from a Provider.
	 * 
	 * @param providerName - the name of the provider to search for.
	 * @return a list of Services matching the criteria
	 */
	public List<AbstractService> searchByProvider(String providerName);
	
	/**
	 * Searches for Services by functionality provided in the name of a ServiceConfiguration.
	 * 
	 * @param serviceConfigurationName - the functionality name of a ServiceConfiguration
	 * @return a list of Services matching the criteria
	 */
	public List<AbstractService> searchByServiceConfiguration(String serviceConfigurationName);
	
	/**
	 * Searches for Services by an exact qualified portType-Name, which is unique.
	 * 
	 * @param qualifiedPortTypeName - the qualified PortType Name to search for
	 * @return a list of Services matching the criteria
	 */
	public List<AbstractService> searchByQualifiedPortTypeName(String qualifiedPortTypeName);
	
	
}
