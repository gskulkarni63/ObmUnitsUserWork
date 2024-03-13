package com.shantesh.obmunitsuserwork.services.feign;


import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.shantesh.obmunitsuserwork.dto.ResponseDto;
import com.shantesh.obmunitsuserwork.dto.UpdateUserDto;
import com.shantesh.obmunitsuserwork.dto.UserDto;


@FeignClient(name = "ObmUnitsUser")
public interface UserFeignClient {
	public static final String API_URL="/api/user";
	public static final String API_URL_ID=API_URL+"/{userId}";
	
	@PostMapping(API_URL)
	public ResponseEntity<String> savePerson(@RequestBody UserDto user);
	
	@GetMapping(API_URL_ID)
	public ResponseEntity<UserDto> getPersonByPersonId(@PathVariable("userId") String userId);
	
	@PutMapping(API_URL_ID)
	public ResponseEntity<String> putPersonByPersonId(@PathVariable("userId") String userId,
			@RequestBody UpdateUserDto user);
	
	@PatchMapping(API_URL_ID)
	public ResponseEntity<String> patchPersonByPersonId(@PathVariable("userId") String userId,
			@RequestBody UpdateUserDto user);
	
	@DeleteMapping(API_URL_ID)
	public ResponseEntity<String> deletePersonByPersonId(@PathVariable("userId") String userId);
	
//	@GetMapping(API_URL)
//	public ResponseEntity<Page<UserDto>> findAllPerson( String teamName,String firstName,Integer pageNumber,Integer pageSize );
}


