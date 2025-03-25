package com.workspace.annual.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.workspace.annual.model.service.AnnualService;
import com.workspace.annual.model.vo.AnnualRequest;
import com.workspace.member.model.vo.Member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class AnnualController {
	
	private final AnnualService annualService;
	
	
	// 연차 전체(회사별) 조회
	@GetMapping("/annual/all")
	public String getAllAnnuals(HttpSession session, Model model) {
		
		Member loginUser = (Member) session.getAttribute("loginUser");
		
		String cmpyNo = loginUser.getCmpyNo();
		
		List<AnnualRequest> list = annualService.getAllAnnualsByCompany(cmpyNo);
		model.addAttribute("annualList", list);
		return "annual/all-list";
    }
	
	
	
	// 개인 연차 목록 조회
	@GetMapping("/my-list")
	public String getMyAnnualList(HttpSession session, Model model) {
		
		Member loginUser = (Member) session.getAttribute("loginUser");

		
		String cmpyNo = loginUser.getCmpyNo();
		Long userNo = loginUser.getUserNo();
		
		List<AnnualRequest> list = annualService.getUserAnnuals(cmpyNo, userNo);
		model.addAttribute("annualList", list);
		return "annual/my-list";
	}
	
	// 연차 신청 양식

	
	// 연차 등록
	
	// 연차 취소 신청 및 취소
	
}
