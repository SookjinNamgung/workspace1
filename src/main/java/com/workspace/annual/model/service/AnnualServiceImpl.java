package com.workspace.annual.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workspace.annual.model.dao.AnnualMapper;
import com.workspace.annual.model.vo.AnnualRequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class AnnualServiceImpl implements AnnualService {

	
	private final AnnualMapper annualMapper;

	@Override
	public List<AnnualRequest> getAllAnnualsByCompany(String cmpyNo) {
		return annualMapper.findByCmpy(cmpyNo);
	}

	@Override
	public List<AnnualRequest> getUserAnnuals(String cmpyNo, Long userNo) {
		return annualMapper.findByCmpyAndUser(cmpyNo, userNo);
	}

	@Override
	public int insertAnnualRequest(AnnualRequest annualRequest) {
		 return annualMapper.insertAnnualRequest(annualRequest);
	}


	
}
