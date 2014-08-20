package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SharedServiceInstance extends NotProvisionedServiceInstance{
	private long sharedId;
	private long callNumber = 0;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getSharedId() {
		return sharedId;
	}

	public void setSharedId(long sharedId) {
		this.sharedId = sharedId;
	}

	public long getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(long callNumber) {
		this.callNumber = callNumber;
	}

}
