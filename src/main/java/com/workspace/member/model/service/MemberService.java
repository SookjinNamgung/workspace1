package com.workspace.member.model.service;

import com.workspace.member.model.vo.Member;

public interface MemberService {
	
	Member login(String empNo, String password);

}
