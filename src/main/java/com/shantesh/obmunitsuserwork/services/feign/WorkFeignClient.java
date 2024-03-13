package com.shantesh.obmunitsuserwork.services.feign;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shantesh.obmunitsuserwork.dto.WorkDto;
import com.shantesh.obmunitsuserwork.dto.WorkDtoSave;

@FeignClient(name = "ObmUnitsWork")
public interface WorkFeignClient {
	public static final String API_URL = "/api/work";
	public static final String API_URL_ID = API_URL + "/{id}";
	public static final String API_URL_PERSON_ID = API_URL + "/person/{personId}";

	@PostMapping(API_URL)
	public ResponseEntity<String> saveWork(@RequestBody WorkDtoSave workDto);

	@GetMapping(API_URL_PERSON_ID)
	public ResponseEntity<List<WorkDto>> findWorkByPersonId(@PathVariable String personId);

	@PutMapping(API_URL_ID)
	public ResponseEntity<String> updateWorkById(@PathVariable String id,@RequestBody WorkDto workDto);

	@DeleteMapping(API_URL_ID)
	public ResponseEntity<String> deleteWorkById(@PathVariable String id);

	@GetMapping(API_URL_ID)
	public ResponseEntity<WorkDto> getWorkByWorkId(@PathVariable String id);
}


