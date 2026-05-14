package com.librarymanagement.practice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.librarymanagement.practice.entites.Library;

@Service
public class LibraryService {

	public int getRoom() {
		
		return 313;
	}
	
	private static List<Library> list = new ArrayList<>();
	static {
		list.add(new Library(313, "A", "Gajendra Verma", "Mathematics"));
		list.add(new Library(313, "B", "Rajesh Jagadam", "CS"));
		list.add(new Library(313, "C", "Guru Prasad", "English"));
		list.add(new Library(313, "D", "Dhivya", "Communication"));
	}
	
	
	public String getStaffNameBySubject(String sub) {
		Library lib = null;
		try {
			lib = list.stream().filter(e-> e.getSubject().equalsIgnoreCase(sub)).findFirst().get();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(lib==null)
			return "Subject not found";
		
		return lib.getStaff_name();
	}


	public Library addLibrary(Library section) {
		list.add(section);
		return section;
	}


	public List<Library> getAllSections() {
		
		return list;
	}


}
