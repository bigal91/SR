package model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class NotProvisionedService extends ServiceOffer {
	/**
	 * Type of the installation packet (can be from multiple standards, like
	 * TOSCA, CHEF, PUPPET, ...)
	 */
	private String RepositoryType;

	/**
	 * The PackageAdress is a unique adress link TODO
	 */
	private String packageAddress;

	public String getPackageAddress() {
		return packageAddress;
	}

	public void setPackageAddress(String packageAddress) {
		this.packageAddress = packageAddress;
	}

	public String getRepositoryType() {
		return RepositoryType;
	}

	public void setRepositoryType(String repositoryType) {
		RepositoryType = repositoryType;
	}
}
