package com.example.service;

import java.util.List;

import com.example.domain.QnaVO;

public interface QnaService {
	void saveQna(QnaVO vo);
	List<QnaVO> listQna();
	QnaVO getQna(QnaVO vo);
	void answerQna(QnaVO  vo);

}
