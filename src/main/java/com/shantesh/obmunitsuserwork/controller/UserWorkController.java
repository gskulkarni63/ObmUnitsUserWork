package com.shantesh.obmunitsuserwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shantesh.obmunitsuserwork.dto.UserWorkDto;
import com.shantesh.obmunitsuserwork.services.UserWorkService;

@Controller
@RequestMapping("/api")
public class UserWorkController {
	
	@Autowired
	UserWorkService userWorkService;
	
	private static final String API_URL="/alldetails";
	
	private static final String API_URL_ID = API_URL + "/{personId}";
	
	@GetMapping(API_URL_ID)
	public ResponseEntity<List<UserWorkDto>> findAllUserWorkByPersonId(@PathVariable("personId") String personId){
		return new ResponseEntity<List<UserWorkDto>>(userWorkService.findAllUserWorkByPersonId(personId),HttpStatus.ACCEPTED);
	}
}
