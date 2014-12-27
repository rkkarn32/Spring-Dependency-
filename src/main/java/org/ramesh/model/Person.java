package org.ramesh.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Person")
public class Person implements IPerson{
	String name;

	public Person() {
		System.out.println("Person Constructor");
	}
	public String getName() {
		return "Person: "+name;
	}

	public void setName(String name) {
		System.out.println("Name setter");
		this.name = name;
	}
	
	public void init(){
		System.out.println("Init Called");
	}
}
