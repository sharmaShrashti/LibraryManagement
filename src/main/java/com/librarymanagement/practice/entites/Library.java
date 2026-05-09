package com.librarymanagement.practice.entites;

public class Library {

	private int room_no;
	private String section_name;
	private String staff_name;
	private String subject;
	
	public Library(int room_no, String section_name, String staff_name, String subject) {
		super();
		this.room_no = room_no;
		this.section_name = section_name;
		this.staff_name = staff_name;
		this.subject = subject;
	}

	public int getRoom_no() {
		return room_no;
	}

	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}

	public String getSection_name() {
		return section_name;
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Library [room_no=" + room_no + ", section_name=" + section_name + ", staff_name=" + staff_name
				+ ", subject=" + subject + "]";
	}
	
	
	
	
	
}
