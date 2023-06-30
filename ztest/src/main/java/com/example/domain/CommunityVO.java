package com.example.domain;

import java.util.Date;

import lombok.Data;

@Data
// 커뮤니티 테이블
public class CommunityVO {
	
	private		String		commNo;			// 글 번호 ( 커뮤니티 테이블 PK / Auto-Increase )
	private		String		commTitle;		// 글 제목
	private		String		commContant;	// 글 내용
	private		Date		connData;		// 글 작성일자
	private		String		commImage;		// 글 이미지1
	private 	String		commImage2;		// 글 이지지2
	private		String		commImage3;		// 글 이미지3
	private		Date		answerDate;		// 댓글 작성일자
	private		Integer		answerCount;	// 댓글 수
	
	private		String		id;				// 글쓴이 ( 회원정보 테이블에서 FK)

}
