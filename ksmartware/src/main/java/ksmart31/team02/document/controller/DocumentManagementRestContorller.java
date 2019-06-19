package ksmart31.team02.document.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team02.document.mapper.DocumentManagementMapper;
import ksmart31.team02.document.service.DocumentManagementService;
import ksmart31.team02.document.vo.DocumentForm;

@RestController
public class DocumentManagementRestContorller {
	@Autowired private DocumentManagementService documentManagementService;
	@Autowired private DocumentManagementMapper documentManagementMapper;
	
	// 문서양식 목록
	@GetMapping("/getDocumentForm")
	public List<DocumentForm> getDocumentForm(String documentFormCategoryCode) {
		System.out.println("(C) getDocumentForm() 실행");
		System.out.println("(C) getDocumentForm() documentFormCategoryCode : "+ documentFormCategoryCode);
		List<DocumentForm> documentFormList = documentManagementMapper.selectDocumentForm(documentFormCategoryCode);
		System.out.println("(C) getDocumentForm() documentFormList:"+documentFormList);
		return documentFormList;
	}
	
	/*
	// 문서양식 목록(페이징)
	@GetMapping("/getDocumentForm")
	public Map<String, Object> getDocumentForm(@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage) {
		System.out.println("(C) getDocumentForm() 실행");
		Map<String, Object> map = documentManagementService.getDocumentForm(currentPage);
		System.out.println("(C) getDocumentForm() map:"+map);
		return map;
	}
	*/
}
