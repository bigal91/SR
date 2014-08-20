package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceInterface {
	private long interfaceId;
	private String portTypeName;
	
	/**
	 * Functional Description of Service
	 */
	private String wsdlAddress;
	
	/**
	 * Optional Functional Description of Service
	 */
	private String description;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getInterfaceId() {
		return interfaceId;
	}

	public void setInterfaceId(long interfaceId) {
		this.interfaceId = interfaceId;
	}

	public String getPortTypeName() {
		return portTypeName;
	}

	public void setPortTypeName(String portTypeName) {
		this.portTypeName = portTypeName;
	}

	public String getWsdlAddress() {
		return wsdlAddress;
	}

	public void setWsdlAddress(String wsdlAddress) {
		this.wsdlAddress = wsdlAddress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
