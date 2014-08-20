package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Binding {
	
	private long bindingId;
	private EncodingType encType;
	private ProtocolType protocolType;

	public EncodingType getEncType() {
		return encType;
	}

	public void setEncType(EncodingType encType) {
		this.encType = encType;
	}

	public ProtocolType getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(ProtocolType protocolType) {
		this.protocolType = protocolType;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getBindingId() {
		return bindingId;
	}

	public void setBindingId(long bindingId) {
		this.bindingId = bindingId;
	}

}
