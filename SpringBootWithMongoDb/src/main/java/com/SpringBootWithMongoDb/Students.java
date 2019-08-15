package com.SpringBootWithMongoDb;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Student")
public class Students
{
//	@Id
//	public int id;
	public String name;
	public String mobile;
	
	public Students(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", mobile=" + mobile + "]";
	}
}
