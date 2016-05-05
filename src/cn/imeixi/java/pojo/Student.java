package cn.imeixi.java.pojo;

import java.util.Date;

public class Student {
	private Integer stuId;
	private String stuName;
	private String sex;
	private Date birth;
	private Integer score;
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Student(Integer stuId, String stuName, String sex, Date birth, Integer score) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.sex = sex;
		this.birth = birth;
		this.score = score;
	}
	
	public Student(){
		
	}
	
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", sex=" + sex + ", birth=" + birth + ", score="
				+ score + "]";
	}
	
	
	
}
