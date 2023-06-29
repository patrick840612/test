package com.example.domain;

import lombok.Data;

@Data
// 정보게시판 > 마켓정보 테이블 
public class MarketVO {
	
	private 	Integer 	marketId;			// 마켓 번호 ( 마켓정보 테이블 PK / Auto-Increase )
	private 	String 		marketName;			// 마켓 이름
	private 	String 		marketTel;			// 마켓 전화번호
	private 	String 		marketInfo;			// 마켓 정보 ( 주요 판매목록 )
	private 	String 		marketAddr;			// 마켓 주소
	private 	String 		marketLat;			// 마켓 위도
	private 	String 		marketLng;			// 마켓 경도
	private 	String 		marketOpen;			// 마켓 오픈시간
	private 	String 		marketClose;		// 마켓 마감시간
	
	private 	String 		id;					// 글쓴이 ( 회원 테이블에서 FK )

}
