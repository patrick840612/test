package com.example.domain;

import lombok.Data;

@Data
// 정보게시판 > 병원정보 테이블 
public class ClinicVO {
	
	private 	Integer 	clinicId;			// 병원 번호 ( 병원정보 테이블 PK  / Auto-Increase )
	private 	String 		clinicName;			// 병원 이름
	private 	String 		clinicTel;			// 병원 전화번호
	private 	String 		clinicMajor;		// 병원 주 진료과목
	private 	String 		clinicAddr;			// 병원 주소
	private 	String 		clinicLat;			// 병원 위도
	private 	String 		clincicLng;			// 병원 경도
	private 	String 		clinicOpen;			// 병원 오픈시간
	private 	String 		clinicClose;		// 병원 마감시간
	
	private 	String 		id;					// 글쓴이 ( 회원 테이블에서 FK )
	
}
