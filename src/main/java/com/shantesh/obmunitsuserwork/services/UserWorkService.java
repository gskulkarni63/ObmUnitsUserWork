package com.shantesh.obmunitsuserwork.services;

import java.util.List;

import com.shantesh.obmunitsuserwork.dto.UserWorkDto;

public interface UserWorkService {
	public List<UserWorkDto> findAllUserWorkByPersonId(String personId);
}
