package com.samples.services.entity;

public class ServiceEntity {

	private Long id;
	private String code;
	private String name;	
	private String associatedKeywords;

	public ServiceEntity() {}
	
	public ServiceEntity(Long id, String code, String name, String associatedKeywords) {
		
		this.id = id;
		this.code = code;
		this.name = name;
		this.associatedKeywords = associatedKeywords;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssociatedKeywords() {
		return associatedKeywords;
	}

	public void setAssociatedKeywords(String associatedKeywords) {
		this.associatedKeywords = associatedKeywords;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
