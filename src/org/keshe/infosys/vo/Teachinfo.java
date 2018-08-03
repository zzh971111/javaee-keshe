package org.keshe.infosys.vo;

/**
 * Teachinfo entity. @author MyEclipse Persistence Tools
 */

public class Teachinfo implements java.io.Serializable {

	// Fields

	private String teachid;
	private String teachpwd;
	private String teachname;

	// Constructors

	/** default constructor */
	public Teachinfo() {
	}

	/** full constructor */
	public Teachinfo(String teachpwd, String teachname) {
		this.teachpwd = teachpwd;
		this.teachname = teachname;
	}

	// Property accessors

	public String getTeachid() {
		return this.teachid;
	}

	public void setTeachid(String teachid) {
		this.teachid = teachid;
	}

	public String getTeachpwd() {
		return this.teachpwd;
	}

	public void setTeachpwd(String teachpwd) {
		this.teachpwd = teachpwd;
	}

	public String getTeachname() {
		return this.teachname;
	}

	public void setTeachname(String teachname) {
		this.teachname = teachname;
	}

}