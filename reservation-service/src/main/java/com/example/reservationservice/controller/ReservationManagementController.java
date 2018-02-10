package com.example.reservationservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by KwangHan on 2018. 2. 9..
 */
@Controller("/reservation/management")
public class ReservationManagementController {

	@GetMapping("/history")
	public ModelAndView history() {
//		예약 history 를 제공한다.
		return null;
	}
	
	@GetMapping("/group")
	public ModelAndView group() {
//		예약 시 사용할 모임명 을 관리한다.
		return null;
	}
	
	@GetMapping("/group/{groupNameId}")
	public ModelAndView groupDelete(@PathVariable(value = "groupNameId") long groupNameId) {
//		삭제할 대상의 id 정보가 필요하다. 
		return null;
	}

}
