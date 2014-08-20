package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceQuality {
	// TODO maybe make Quality key unique String id?
	private String qualityKey;
	
	private String qualityValue;

	public ServiceQuality(String qualityKey, String qualityValue){
		this.qualityKey = qualityKey;
		this.qualityValue = qualityValue;
	}
	
	@Id
	public String getQualityKey() {
		return qualityKey;
	}

	public void setQualityKey(String qualityKey) {
		this.qualityKey = qualityKey;
	}

	public String getQualityValue() {
		return qualityValue;
	}

	public void setQualityValue(String qualityValue) {
		this.qualityValue = qualityValue;
	}
	
	
}
