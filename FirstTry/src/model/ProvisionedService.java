package model;

import javax.persistence.Entity;

@Entity
public class ProvisionedService extends ServiceOffer{
	private String endPoint;

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
}
