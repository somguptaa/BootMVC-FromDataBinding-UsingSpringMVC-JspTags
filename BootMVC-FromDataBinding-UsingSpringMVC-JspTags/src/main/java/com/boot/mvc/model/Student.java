package com.boot.mvc.model;

import lombok.Data;

@Data
public class Student {
	
	private Integer sno;
	private String sname;
	private String sadd="Hyd";   //this will show as default value in registration form
	private Double avg;

}

