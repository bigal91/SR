package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ServiceOffer {
	private long offerId;
	private ServiceConfiguration serviceConfiguration;
	private Binding binding;
	private User serviceProvider;
	private String name;
	private String wsdlAdress;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getOfferId() {
		return offerId;
	}

	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}

	@ManyToOne
	public ServiceConfiguration getServiceConfiguration() {
		return serviceConfiguration;
	}

	public void setServiceConfiguration(
			ServiceConfiguration serviceConfiguration) {
		this.serviceConfiguration = serviceConfiguration;
	}

	public Binding getBinding() {
		return binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}

	public User getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(User serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

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

}
