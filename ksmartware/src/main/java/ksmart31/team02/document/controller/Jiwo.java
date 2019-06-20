package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team02.document.vo.ApprovalProcess;
import ksmart31.team02.document.vo.DocumentFormCategory;
import ksmart31.team02.document.vo.DraftDocument;

public class Jiwo {
	/*
	// 기안문서 삭제
	@PostMapping("/removeDraftDocument")
	public void removeDraftDocument(@RequestParam(value="ck[]") String[] ck) {
		System.out.println("/removeDraftDocument 요청");
		System.out.println("(C) removeDraftDocument ck : "+ck);
		for(String draftDocumentCode : ck) {
			DraftDocument draftDocument = new DraftDocument();
			draftDocument.setDraftDocumentCode(draftDocumentCode);
			documentManagementService.removeDraftDocument(draftDocument);
		}
	}
	

	
	// 관리자 결재선 관리(공통프로세스 목록)
	@GetMapping("/documentProcessManagement")
	public String getApprovalProcess(Model model) {
		System.out.println("(C) getApprovalProcess() 실행");
		List<ApprovalProcess> list = documentManagementService.getApprovalProcess();
		System.out.println("(C) getApprovalProcess() list : "+list);
		model.addAttribute("list",list);
		return "/view/admin/documentManagement/documentProcessManagement";
	}
	*/
}
