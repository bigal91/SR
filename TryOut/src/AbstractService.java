public abstract class AbstractService {
	private String name;
	private String wsdlAdress;
	private BindingEncodingType encType;
	private BindingProtocolType protocolType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWsdlAdress() {
		return wsdlAdress;
	}

	public void setWsdlAdress(String wsdlAdress) {
		this.wsdlAdress = wsdlAdress;
	}

	public BindingEncodingType getEncType() {
		return encType;
	}

	public void setEncType(BindingEncodingType encType) {
		this.encType = encType;
	}

	public BindingProtocolType getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(BindingProtocolType protocolType) {
		this.protocolType = protocolType;
	}

}
