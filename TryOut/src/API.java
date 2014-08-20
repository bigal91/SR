import java.util.List;


public class API implements IServiceRegistryAPI{

	@Override
	public boolean registerUser(String name, String password, String eMail) {
		
		return false;
	}

	@Override
	public String loginUser(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long createProvisionedService(String Name, String wsdlAddress,
			BindingEncodingType encType, BindingProtocolType protocolType,
			String endPoint, String authenticationToken) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long createNotProvisionedService(String Name, String wsdlAddress,
			BindingEncodingType encType, BindingProtocolType protocolType,
			String packageAddress, String authenticationToken) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean editProvisionedService(long serviceID, String newName,
			String newWsdlAddress, BindingEncodingType newEncType,
			BindingProtocolType newProtocolType, String newEndPoint,
			String authenticationToken) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editNotProvisionedService(long serviceID, String newName,
			String newWsdlAddress, BindingEncodingType newEncType,
			BindingProtocolType newProtocolType, String newPackageAdress,
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
