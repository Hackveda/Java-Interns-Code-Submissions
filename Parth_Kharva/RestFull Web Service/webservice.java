package com.java.springboot.test.springbootproject;

public class webservice {

	private String  name;
	private String  university;
	private String  Stream;
	private String  curren_stateus;
	
	public webservice(String name, String University,String Stream,String current_Stateus)
	{
		super();
		this.name = name;
		this.university = University;
		this.Stream = Stream;
		this.curren_stateus = current_Stateus;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	public String getCurren_stateus() {
		return curren_stateus;
	}

	public void setCurren_stateus(String curren_stateus) {
		this.curren_stateus = curren_stateus;
	}

}
