package org.keshe.infosys.vo;

/**
 * Score entity. @author MyEclipse Persistence Tools
 */

public class Score implements java.io.Serializable {

	// Fields

	private Integer scoeid;
	private String stuid;
	private String stuname;
	private String topicname;
	private Integer score;
	private String teachname;

	// Constructors

	/** default constructor */
	public Score() {
	}

	/** full constructor */
	public Score(String stuid, String stuname, String topicname, Integer score,
			String teachname) {
		this.stuid = stuid;
		this.stuname = stuname;
		this.topicname = topicname;
		this.score = score;
		this.teachname = teachname;
	}

	// Property accessors

	public Integer getScoeid() {
		return this.scoeid;
	}

	public void setScoeid(Integer scoeid) {
		this.scoeid = scoeid;
	}

	public String getStuid() {
		return this.stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
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

	public String getTeachname() {
		return this.teachname;
	}

	public void setTeachname(String teachname) {
		this.teachname = teachname;
	}

}