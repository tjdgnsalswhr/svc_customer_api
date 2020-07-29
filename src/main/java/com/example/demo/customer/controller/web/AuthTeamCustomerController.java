package com.example.demo.customer.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.core.service.AuthTeamCustomerService;

import io.swagger.annotations.ApiOperation;

@RestController
public class AuthTeamCustomerController {
	
	@Autowired //자동주입
	//고객 정보 인증 서비스
	AuthTeamCustomerService authTeamCustomerService;
	
	@ApiOperation(value = "팀 정보 인증", httpMethod="GET", notes = "팀 정보 인증 API.")
	@GetMapping(value="/teamcustomer/auth/{teamId}/{teamPassword}")
	public ResponseEntity<Object> authTeamCustomer(@PathVariable String teamId, @PathVariable String teamPassword)
	{
		return new ResponseEntity<>(authTeamCustomerService.authTeamCustomer(teamId, teamPassword), HttpStatus.OK);
	}

}
