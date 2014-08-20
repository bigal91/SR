package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class DedicatedService extends NotProvisionedService {
	private List<DedicatedServiceInstance> instanceList;

	@OneToMany
	public List<DedicatedServiceInstance> getInstanceList() {
		return instanceList;
	}

	public void setInstanceList(List<DedicatedServiceInstance> instanceList) {
		this.instanceList = instanceList;
	}
}
