package org.keshe.infosys.vo;

/**
 * Stuinfo entity. @author MyEclipse Persistence Tools
 */

public class Stuinfo implements java.io.Serializable {

	// Fields

	private String stuid;
	private String studpwd;
	private String stuname;
	private String class_;
	private String topicname;
	private Integer score;
	private String topstate;

	// Constructors

	/** default constructor */
	public Stuinfo() {
	}

	/** minimal constructor */
	public Stuinfo(String stuid) {
		this.stuid = stuid;
	}

	/** full constructor */
	public Stuinfo(String stuid, String studpwd, String stuname, String class_,
			String topicname, Integer score, String topstate) {
		this.stuid = stuid;
		this.studpwd = studpwd;
		this.stuname = stuname;
		this.class_ = class_;
		this.topicname = topicname;
		this.score = score;
		this.topstate = topstate;
	}

	// Property accessors

	public String getStuid() {
		return this.stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getStudpwd() {
		return this.studpwd;
	}

	public void setStudpwd(String studpwd) {
		this.studpwd = studpwd;
	}

	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getTopicname() {
		return this.topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getTopstate() {
		return this.topstate;
	}

	public void setTopstate(String topstate) {
		this.topstate = topstate;
	}

}