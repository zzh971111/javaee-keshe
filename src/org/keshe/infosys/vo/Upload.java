package org.keshe.infosys.vo;

/**
 * Upload entity. @author MyEclipse Persistence Tools
 */

public class Upload implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String url;

	// Constructors

	/** default constructor */
	public Upload() {
	}

	/** full constructor */
	public Upload(String name, String url) {
		this.name = name;
		this.url = url;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}