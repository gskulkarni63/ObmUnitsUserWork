package com.shantesh.obmunitsuserwork.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.shantesh.obmunitsuserwork.dto.UserDto;
import com.shantesh.obmunitsuserwork.dto.UserWorkDto;
import com.shantesh.obmunitsuserwork.dto.WorkDto;
import com.shantesh.obmunitsuserwork.services.feign.UserFeignClient;
import com.shantesh.obmunitsuserwork.services.feign.WorkFeignClient;

@Service
public class UserWorkServiceImpl implements UserWorkService {

	@Autowired
	UserFeignClient userFeignClient;
	@Autowired
	WorkFeignClient workFeignClient;
	
	@Override
	public List<UserWorkDto> findAllUserWorkByPersonId(String personId) {
		// TODO Auto-generated method stub
//		UserDto userDto=userFeignClient.getPersonByPersonId(personId).getBody();
		ResponseEntity<UserDto> userDto=userFeignClient.getPersonByPersonId(personId);
		ResponseEntity<List<WorkDto>> workDtoList=workFeignClient.findWorkByPersonId(personId);
		List<UserWorkDto> listOfWorkByPerson = workDtoList.getBody().stream().map((workDto)->{
			return UserWorkDto.builder()
					.personId(personId)
					.firstName(userDto.getBody().getFirstName())
					.teamName(userDto.getBody().getTeam().getTeamName())
					.unitsOfWork(workDto.getUnitsOfWork())
					.weekNo(workDto.getWeekNo())
					.build();
		}).toList();
		
		return listOfWorkByPerson;
	}

}
