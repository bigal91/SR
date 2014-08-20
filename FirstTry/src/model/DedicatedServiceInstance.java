package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DedicatedServiceInstance extends NotProvisionedServiceInstance{
	private long dedicatedId;
	private boolean idle;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getDedicatedId() {
		return dedicatedId;
	}

	public void setDedicatedId(long dedicatedId) {
		this.dedicatedId = dedicatedId;
	}

	public boolean isIdle() {
		return idle;
	}

	public void setIdle(boolean idle) {
		this.idle = idle;
	}

}
