package com.SpringBootWithMongoDb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class StudentRunner implements CommandLineRunner
{
	@Autowired
	StudentInterface studentRep;
	
	public StudentRunner(StudentInterface studentRep) {
		super();
		this.studentRep = studentRep;
	}

	@Override
	public void run(String... args) throws Exception
	{
		Students student1=new Students("atul pisal","9970774553");
		Students student2=new Students("Sagar pisal","9970774553");
		Students student3=new Students("A121 pisal","9970774553");
		List<Students> list=Arrays.asList(student1,student2,student3);
		this.studentRep.saveAll(list);
	}

}
