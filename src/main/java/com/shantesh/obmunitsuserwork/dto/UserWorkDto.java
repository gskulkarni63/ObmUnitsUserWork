package com.shantesh.obmunitsuserwork.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserWorkDto {
	String personId; 
	
	String firstName;
	
	String teamName;
	
	Integer weekNo;
	
	Integer unitsOfWork;
}
