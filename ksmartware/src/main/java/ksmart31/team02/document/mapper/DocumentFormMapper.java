package ksmart31.team02.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.document.vo.DocumentForm;
import ksmart31.team02.document.vo.DocumentFormCategory;

@Mapper
public interface DocumentFormMapper {
	// 문서양식 목록 페이징
	// public int selectDocumentFormCount();
	
	// 문서양식 목록
	public List<DocumentForm> selectDocumentForm(String documentFormCategoryCode);
	
	// 공통양식 카테고리 목록
	public List<DocumentFormCategory> selectDocumentFormCategory();
}
