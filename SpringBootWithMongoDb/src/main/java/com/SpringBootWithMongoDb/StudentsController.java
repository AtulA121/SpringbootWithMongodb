package com.SpringBootWithMongoDb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

//@Controller
@RestController
public class StudentsController
{
	@Autowired
	StudentInterface studentRep;

	@Autowired
	UsersRepository usersRep;
	
	public StudentsController(StudentInterface studentRep) {
		super();
		this.studentRep = studentRep;
	}
	
	@RequestMapping("/")
	public String homepage()
	{
		System.out.println("/ request...");
		return "index.jsp";
	}
	
	@CrossOrigin(origins="*")
	@GetMapping("/saveData")
	public void saveData()
	{
		Students student1=new Students("atul pisal","9970774553");
		Students student2=new Students("Sagar pisal","9970774553");
		Students student3=new Students("A121 pisal","9970774553");
		List<Students> list=Arrays.asList(student1,student2,student3);
		System.out.println("inserted successfully : "+list);
		this.studentRep.saveAll(list);
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/saveData")
	public Users saveData(@RequestBody Users users)
	{
		System.out.println("data is : "+users);
		return usersRep.save(users);
	}
	
	@CrossOrigin(origins="*")
	@GetMapping("/getData")
//	public void getData(HttpServletRequest req,HttpServletResponse resp) throws IOException
	public List<Students> getData(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		System.out.println("getAllData : "+studentRep.findAll());

//		send a json object
//		PrintWriter out=resp.getWriter();
//		Gson gson=new Gson();
//		String json=gson.toJson(studentRep.findAll());
//		System.out.println("Json is  :"+json);
//		out.println(json);
		
//		default springboot send a data as as json object
		return studentRep.findAll();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping("/getDataByName")
	public List<Students> getDataByName()
	{
		System.out.println("getDataByName : "+studentRep.findStudentsByName("atul pisal"));
		return studentRep.findStudentsByName("atul pisal");
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/getDataByName")
	public List<Students> getDataByName(@RequestBody String studentName)
	{
		System.out.println(studentName);
		System.out.println("getDataByName : "+studentRep.findStudentsByName(studentName));
		return studentRep.findStudentsByName(studentName);
	}
	
	@CrossOrigin(origins="*")
	@GetMapping("/getDataByMobile")
	public List<Students> getDataByMobile()
	{
		System.out.println("getDataByMobile : ");
		return studentRep.findStudentsByMobile("9970774553");
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/saveDataToDatabase")
	public void saveDataToDatabase(@RequestBody Students student)
	{
		studentRep.save(student);
		System.out.println("inserted successfully : "+student);
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/saveAllDataToDatabase")
	public void saveAllDataToDatabase(@RequestBody List<Students> students)
	{
		studentRep.saveAll(students);
		System.out.println("inserted successfully : "+students);
	}
}
