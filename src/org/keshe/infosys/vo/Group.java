package org.keshe.infosys.vo;

/**
 * Group entity. @author MyEclipse Persistence Tools
 */

public class Group implements java.io.Serializable {

	// Fields

	private String groupid;
	private String groupmeb;
	private String topicname;

	// Constructors

	/** default constructor */
	public Group() {
	}

	/** full constructor */
	public Group(String groupmeb, String topicname) {
		this.groupmeb = groupmeb;
		this.topicname = topicname;
	}

	// Property accessors

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getGroupmeb() {
		return this.groupmeb;
	}

	public void setGroupmeb(String groupmeb) {
		this.groupmeb = groupmeb;
	}

	public String getTopicname() {
		return this.topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

}