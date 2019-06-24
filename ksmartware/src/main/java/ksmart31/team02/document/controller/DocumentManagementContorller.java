package ksmart31.team02.document.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team02.document.domain.ApprovalDocument;
import ksmart31.team02.document.service.DocumentManagementService;

@Controller
public class DocumentManagementContorller {
	@Autowired
	DocumentManagementService documentManagementService;
	
	@GetMapping(value = "/documentApprovalManagement")
	public String documentApprovalManagement(Model model, @RequestParam(value = "approvalDocumentNo")String approvalDocumentcode) {
		System.out.println("(C)documentApprovalManagement");
		List<ApprovalDocument> approvalDocumentList = null;
		Map<String, Object> approvalDocumentDetailMap = null;
		if(approvalDocumentcode != null) {
			approvalDocumentDetailMap = documentManagementService.documentApprovalDetail(approvalDocumentcode);
		}
		approvalDocumentList = documentManagementService.documentApprovalList();
		model.addAttribute("approvalDocumentList", approvalDocumentList);
		model.addAttribute("approvalDocumentDetailMap", approvalDocumentDetailMap);
		return "/documentApprovalManagement";			
	}

}
