package com.workspace.annual.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnualRequestDto {

	private Long annualNo;
	private String cmpyNo;
	private Long userNo;
	private String anCode;
	private String usageType;
	private String reason;
	private String status;
	private String enrollDate;
	private String approveDate;
	private String rejectDate;
	private String cancelDate;
}
