package com.shantesh.obmunitsuserwork.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkDtoSave {
	
    private String personId;
    
    private Integer weekNo;
    
    private Integer unitsOfWork;
    
    private String projectNo;
}
