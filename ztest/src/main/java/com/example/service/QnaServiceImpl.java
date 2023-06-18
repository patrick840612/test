package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.QnaDAO;
import com.example.domain.QnaVO;

@Service("qnaService")
public class QnaServiceImpl implements QnaService {

	@Autowired
	private QnaDAO qnaDAO;
	
	@Override
	public void saveQna(QnaVO vo) {
		qnaDAO.saveQna(vo);
	}

	@Override
	public List<QnaVO> listQna() {

		return qnaDAO.listQna();
	}

	@Override
	public QnaVO getQna(QnaVO vo) {
		
		return qnaDAO.getQna(vo);
	}

	@Override
	public void answerQna(QnaVO vo) {
		qnaDAO.answerQna(vo);
	}

}
