package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.mapper.MemberLoginMapper;
import ksmart31.team02.document.mapper.DocumentFormMapper;
import ksmart31.team02.document.vo.DocumentFormCategory;

@Controller
public class DocumentFormController {
	@Autowired private DocumentFormMapper documentFormMapper;
	
	// 지출결의서 작성폼
	@GetMapping("/cashDisbursementVoucherForm")
	public String addCashDisbursementVoucherForm() {
		System.out.println("(C) addCashDisbursementVoucherForm() 실행");
		return "member/documentForm/cashDisbursementVoucherForm";
	}
	
	// 휴가신청서 작성폼
	@GetMapping("/leaveApplicationForm")
	public String getLeaveApplicationForm(Model model) {
		System.out.println("(C) getLeaveApplicationForm() 실행");
		return "member/documentForm/leaveApplicationForm";
	}
	
	// 공통양식 카테고리 목록
	@GetMapping("/documentFormList")
	public String getDocumentFormCategory(Model model) {
		System.out.println("(C) getDocumentFormCategory() 실행");
		List<DocumentFormCategory> list = documentFormMapper.selectDocumentFormCategory();
		System.out.println("(C) getDocumentFormCategory() list : "+list);
		model.addAttribute("list",list);
		return "member/draftDocument/documentFormList";
	}
}
