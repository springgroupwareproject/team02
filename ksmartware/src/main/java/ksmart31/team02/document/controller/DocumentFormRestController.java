package ksmart31.team02.document.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentFormRestController {
	// 휴가신청서 작성폼
	//@GetMapping("/leaveApplicationForm")
	public String getLeaveApplicationForm(String documentFormCode) {
		System.out.println("(C) getLeaveApplicationForm() 실행");
		System.out.println("(C) getLeaveApplicationForm() documentFormCode:"+documentFormCode);
		return "member/documentForm/leaveApplicationForm";
	}
}
