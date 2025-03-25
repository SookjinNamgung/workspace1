package com.workspace.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.workspace.board.model.service.BoardService;
import com.workspace.board.model.vo.TcommBltBasModel;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
		
	
	
	/*
	 * 
	 * 
	 */
	@RequestMapping("/boardList")
	public String boardList(Model model, TcommBltBasModel vo) {
		
		List<TcommBltBasModel> list = boardService.list(vo);
		
	    model.addAttribute("list12333", list);
	    
	    return "boardList";
	}
	
	@RequestMapping("/boardListAjax")
	@ResponseBody
	public List<TcommBltBasModel> boardListAjax(Model model, TcommBltBasModel vo) {
		
		List<TcommBltBasModel> list = boardService.list(vo);
		
	    return list;
	}
	
	
	@RequestMapping("/registration")
	public String registration(Model model) {
	    
	    return "registration";
	}
	
}

