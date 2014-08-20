package model;

@Deprecated
public abstract class AbstractService {
	private String name;
	private String wsdlAdress;
	private EncodingType encType;
	private ProtocolType protocolType;

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

	public EncodingType getEncType() {
		return encType;
	}

	public void setEncType(EncodingType encType) {
		this.encType = encType;
	}

	public ProtocolType getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(ProtocolType protocolType) {
		this.protocolType = protocolType;
	}

}
