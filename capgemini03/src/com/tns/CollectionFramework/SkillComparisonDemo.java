package com.tns.CollectionFramework;

import java.util.HashSet;

public class SkillComparisonDemo {

public static void main(String[] args) {
	HashSet<String> Javateam= new HashSet<>();
	
	Javateam.add("Java");
	Javateam.add("Sql");
	Javateam.add("GIT");
	Javateam.add("Spring");
	Javateam.add("docker");
	System.out.println(Javateam);
	
	
	HashSet<String> PythonTeam = new HashSet<>();
	
	PythonTeam.add("python");
	PythonTeam.add("sql");
	PythonTeam.add("git");
	PythonTeam.add("AWS");
	System.out.println(PythonTeam);
	
	// create a copy of java team skills

	HashSet<String> Common =  new HashSet<>();
	System.out.println(Common);
	
	//keep only skills available in both team 
	
	Common.retainAll(PythonTeam);
	System.out.println("common skills: "+Common);
	
	HashSet<String> onlyJava =(HashSet<String>)Javateam.clone();
	System.out.println(onlyJava);
	
	onlyJava.remove(PythonTeam);
	System.out.println("only java team: "+onlyJava);

}
}
