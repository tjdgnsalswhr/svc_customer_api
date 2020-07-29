package com.example.demo.customer.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j //로그 기록을 위한 Annotation
@ToString //tostirng method 자동 생성
@NoArgsConstructor //파라미터가 없는 생성자 생성
@Getter //접근자 자동 생성
@Setter //설정자 자동 생성
@Table(name="TeamCustomer") //entity와 매핑할 테이블. 생략시 매핑한 엔티티 이름을 테이블 이름으로 사용.
@Entity //JPA를 사용해서 테이블과 매핑할 클래스. 이 Annotation이 붙으면 JPA가 관리하는 것

public class TeamCustomer {
	
	@Id 				//기본키 할당
	String id; 			//팀 아이디
	String password; 	//팀 비밀번호
	String teamName; 	//팀 이름
	String leaderName; 	//팀장 이름
	int balance; 		//남은 금액
	int totalCharge; 	//총 충전 금액
	int totalUse; 		//총 사용 금액
	
	@Builder //모델 객체를 생성할 때 간단하게 할 수 있게 만들어주는 Annotation. Getter와 Setter가 필요없음
	public TeamCustomer(String TeamCustomerId, String password, String teamName, String leaderName)
	{
		this.id = TeamCustomerId;
		this.password = password;
		this.teamName = teamName;
		this.leaderName = leaderName;
	}
}
