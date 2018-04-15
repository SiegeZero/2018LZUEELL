package com.gsb.BasicObject.Beans;

import java.io.Serializable;

import com.gsb.BasicObject.MBGPOJO.Sympathy;

public class SympathyWithName extends Sympathy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	private String person_name;

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	

}
