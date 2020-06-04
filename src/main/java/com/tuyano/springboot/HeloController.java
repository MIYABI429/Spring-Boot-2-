package com.tuyano.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HeloController {
	String[] names = {"tuyano",
			"hanako","taro",
			"sachikok","iciro"};
	String[] mails = {"syoda@tuuyano.com",
			"hanako@flower","taro@yamda",
			"sachiko@happy","ichiro@baseball"};

	@RequestMapping("/{id}")
	public ModelAndView index(@PathVariable int id, ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("id",id);
		mav.addObject("check",id % 2 == 0);
		mav.addObject("trueVal","Even numver!");
		mav.addObject("falseVal","Odd numver...");


	}


class DataObject {
	private int id;
	private String name;
	private String value;

	public DataObject(int id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}
 public int getId() { return id;}

 public void setId(int id) { this.id = id; }

 public String getName() { return name; }

 public void setName(String name) {
	 this.name = name;
 }
 public String getValue() {
	 return value;
 }

 public void setValue(String value) {

 }
}
