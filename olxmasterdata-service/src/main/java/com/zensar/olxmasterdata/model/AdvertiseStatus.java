package com.zensar.olxmasterdata.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adv_status")
public class AdvertiseStatus {
	
	@Id
	private int id;
	private String status;

	public AdvertiseStatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public AdvertiseStatus() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
