package org.ramesh.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnotherPerson implements IPerson {
	String name;
	public String getName() {
		return "Another Person: "+name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
