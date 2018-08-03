package org.keshe.infosys.vo;

/**
 * Topicinfo entity. @author MyEclipse Persistence Tools
 */

public class Topicinfo implements java.io.Serializable {

	// Fields

	private String topicid;
	private String topicname;
	private String detail;

	// Constructors

	/** default constructor */
	public Topicinfo() {
	}

	/** full constructor */
	public Topicinfo(String topicname, String detail) {
		this.topicname = topicname;
		this.detail = detail;
	}

	// Property accessors

	public String getTopicid() {
		return this.topicid;
	}

	public void setTopicid(String topicid) {
		this.topicid = topicid;
	}

	public String getTopicname() {
		return this.topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}