package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.QnaVO;
import com.example.service.QnaService;

@Controller
@RequestMapping("/qna")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void write() {
		
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String save(QnaVO vo) {
		qnaService.saveQna(vo);
		return "index";
	}
	
	@RequestMapping("/qnalist")
	public void qnalist(Model m) {
		List<QnaVO> result = qnaService.listQna();
		m.addAttribute("list", result);
	}
	
	@RequestMapping(value = "answer", method = RequestMethod.GET)
	public void answer(QnaVO vo, Model m) {
		QnaVO result = qnaService.getQna(vo);
		m.addAttribute("qna", result);
	}
	
	@RequestMapping(value = "answer", method = RequestMethod.POST)
	public void answerQna(QnaVO vo) {
		qnaService.answerQna(vo);
		
	}
}
