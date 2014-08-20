package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class ServiceConfiguration {
	private long configurationId;
	
	private String name;
	
	private ServiceInterface serviceInterface;
	
	private List<ServiceQuality> serviceQualities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(long configurationId) {
		this.configurationId = configurationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne
	public ServiceInterface getServiceInterface() {
		return serviceInterface;
	}

	public void setServiceInterface(ServiceInterface serviceInterface) {
		this.serviceInterface = serviceInterface;
	}

	@ManyToMany
	public List<ServiceQuality> getServiceQualities() {
		return serviceQualities;
	}

	public void setServiceQualities(List<ServiceQuality> serviceQualities) {
		this.serviceQualities = serviceQualities;
	}
	
	
}
