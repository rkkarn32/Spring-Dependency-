package org.ramesh.service;

import org.ramesh.model.IPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	@Qualifier("Person")
	IPerson person;
	
	public PersonService(){
		System.out.println("Constructor called");
	}
	
	
	public IPerson getPerson() {
		return person;
	}

	public void setPerson(IPerson person) {
		System.out.println("Setting person");
		this.person = person;
	}

	public void showInfo(){
		System.out.println(person.getName());
	}
	
}
