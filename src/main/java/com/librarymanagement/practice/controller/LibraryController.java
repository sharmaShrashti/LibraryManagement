package com.librarymanagement.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/library/{subj}")
	public Library getStaffName(@PathVariable("subj") String subj) {
		
		Library staffName = this.libService.getStaffNameBySubject(subj);
		return staffName;
		
	}
	

}
