package org.defined;

import java.util.*;

public class Company {
public static void main(String[] args) {
	Set<Userdfnd> li=new LinkedHashSet<>();
	Userdfnd e1=new Userdfnd();
	e1.setId(30);
	e1.setName("jitha");
	e1.setPhno(9876543245l);
	Userdfnd e2=new Userdfnd();
	e2.setId(45);
	e2.setName("shyju");
	e2.setPhno(7654389767l);
	li.add(e1);
	li.add(e2);
	for (Userdfnd e : li) {
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getPhno());
	}
	
}
}
