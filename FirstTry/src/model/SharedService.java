package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class SharedService extends NotProvisionedService{
	private List<SharedServiceInstance> instanceList;

	@OneToMany
	public List<SharedServiceInstance> getInstanceList() {
		return instanceList;
	}

	public void setInstanceList(List<SharedServiceInstance> instanceList) {
		this.instanceList = instanceList;
	}
}
