package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping(path = "/hello")
	public String getMsg() {
		return "Hello Java";
	}

	/*
	 * @GetMapping(path = "/getemp") public Employee getEmp() {
	 * 
	 * return new Employee("Sagar", 123, "Java Devloper"); }
	 */

}
