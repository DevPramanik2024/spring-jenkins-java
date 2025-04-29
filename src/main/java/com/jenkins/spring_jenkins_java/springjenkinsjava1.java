package com.jenkins.spring_jenkins_java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springjenkinsjava1
{
@RequestMapping("/test")
	public String test()
	{
	return "welcome to test";
	}

@RequestMapping("/jenkins")
public String jenkins()
{
return "welcome to jenkins";
}
}
