package com.example.domain;

import java.util.Date;

import lombok.Data;

@Data
// 통계 테이블
public class InfoVO {
	
	private 	Date 		loginDate;				// 방문 일자 ( 통계 테이블 PK )
	private 	Integer 	userCount;				// 방문 회원수
	private 	Integer 	clinicReadCount; 		// 병원 조회수
	private 	Integer		marketReadCount;		// 마켓 조회수
	private 	Integer		eduReadCount;			// 교육 조회수
	private 	Integer 	careReadCount;			// 케어 조회수
	
	
}
