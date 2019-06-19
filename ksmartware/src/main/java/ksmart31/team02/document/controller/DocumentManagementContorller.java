package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team02.document.service.DocumentManagementService;
import ksmart31.team02.document.vo.DocumentFormCategory;

@Controller
public class DocumentManagementContorller {
	@Autowired private DocumentManagementService documentManagementService;
	
	// 공통양식 카테고리 목록
	@GetMapping("/documentFormManagement")
	public String getDocumentFormManagement(Model model) {
		System.out.println("(C) getDocumentFormManagement() 실행");
		List<DocumentFormCategory> list = documentManagementService.getDocumentFormManagement();
		System.out.println("(C) getDocumentFormManagement() list : "+list);
		model.addAttribute("list",list);
		return "/view/admin/documentManagement/documentFormManagement";
	}
}
