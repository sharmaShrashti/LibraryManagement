package com.librarymanagement.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagement.practice.entites.Library;
import com.librarymanagement.practice.services.LibraryService;

@RestController
public class LibraryController {
	
	@Autowired
	private LibraryService libService; 
	
	@GetMapping("/library/room")
	public int getRoom() {
		int room_number = libService.getRoom();
		System.out.println(room_number);
		return room_number;
	}
	
	@GetMapping("/library/staff/{subj}")
	public String getStaffName(@PathVariable String subj) {
		
		return libService.getStaffNameBySubject(subj);
		
	}
	
	@GetMapping("library/getAllSection")
	public List<Library> getAll(){
		return libService.getAllSections();
	}
	
	@PostMapping("library/addSection")
	public Library newSection(@RequestBody Library section)
	{
		Library section1 = this.libService.addLibrary(section);
		
		return section1;
		
	}

}
