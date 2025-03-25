package com.workspace.annual.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workspace.annual.model.dao.AnnualRequestDao;
import com.workspace.annual.model.vo.AnnualRequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class AnnualServiceImpl implements AnnualService {

	
	private final AnnualRequestDao annualRequestDao;

	@Override
	public List<AnnualRequest> getAllAnnualsByCompany(String cmpyNo) {
		return annualRequestDao.findByCmpy(cmpyNo);
	}

	@Override
	public List<AnnualRequest> getUserAnnuals(String cmpyNo, Long userNo) {
		return annualRequestDao.findByCmpyAndUser(cmpyNo, userNo);
	}


	
}
