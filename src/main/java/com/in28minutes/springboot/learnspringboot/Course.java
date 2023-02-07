package com.in28minutes.springboot.learnspringboot;

public class Course {
	
	private long id;
	private String name;
	private String author;
	
	
	public Course(long i, String name, String author) {
		super();
		this.id = i;
		this.name = name;
		this.author = author;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Course(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
