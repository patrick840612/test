package com.example.domain;

import java.util.Date;

import lombok.Data;

@Data
// 커뮤니티 댓글 테이블
public class ReplyVO {
	
	private		Integer		replyNo;			// 댓글번호 
	private		String		replyCotent;		// 댓글내용
	
}
