package com.example.Model;


public class Student {

	private int id;
	private String name;
	private String address;
	private long mono;
	private long rollno;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String address, long mono, long rollno) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mono = mono;
		this.rollno = rollno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMono() {
		return mono;
	}

	public void setMono(long mono) {
		this.mono = mono;
	}

	public long getRollno() {
		return rollno;
	}

	public void setRollno(long rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", mono=" + mono + ", rollno=" + rollno
				+ "]";
	}

}
