package ksmart31.team02.document.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.domain.ApprovalDocument;
import ksmart31.team02.document.domain.ApprovalMember;
import ksmart31.team02.document.domain.DisbursementDocument;
import ksmart31.team02.document.domain.DocumentAttachedFile;
import ksmart31.team02.document.domain.DocumentOpinion;
import ksmart31.team02.document.domain.LeaveApplication;
import ksmart31.team02.document.domain.ProjectDisbursement;
import ksmart31.team02.document.domain.ProjectReport;
import ksmart31.team02.document.domain.PurchaseRequisition;
import ksmart31.team02.document.mapper.DocumentManagementMapper;

@Service
public class DocumentManagementService {
	@Autowired
	DocumentManagementMapper documentManagementMapper;
	// 관리자 문서통합 관리(리스트)
	public List<ApprovalDocument> documentApprovalList() {
		List<ApprovalDocument> documentApprovalList = documentManagementMapper.selectDocuemntApprovalList();
		return documentApprovalList; 
	
	}
	// 문서통합  관리 -> 문서별 상세 데이터 확인(모든양식)
		public Map<String, Object> documentApprovalDetail(String approvalDocumentCode) {			
			//문서입력 데이터
			Map<String, Object> approvalDocumentDetailMap = new HashMap<String, Object>();
			
			String documentFormTitle = documentManagementMapper.selectDocumentFormTitleByApprovalDocumentCode(approvalDocumentCode);
			if(documentFormTitle.contains("구매요청서")) {
				List<PurchaseRequisition> purchaseRequisitionList = documentManagementMapper.selectPurchaseRequisitionDetail(approvalDocumentCode);
				approvalDocumentDetailMap.put("purchaseRequisitionList", purchaseRequisitionList);
			}else if(documentFormTitle.contains("지출결의서")) {
				List<DisbursementDocument> disbursementDocumentList = documentManagementMapper.selectDisbursementDocumentDetail(approvalDocumentCode);
				approvalDocumentDetailMap.put("disbursementDocumentList", disbursementDocumentList);
			}else if(documentFormTitle.contains("휴가신청서")) {
				List<LeaveApplication> leaveApplicationList= documentManagementMapper.selectLeaveApplicationDetail(approvalDocumentCode);
				approvalDocumentDetailMap.put("leaveApplicationList", leaveApplicationList);
			}else if(documentFormTitle.contains("프로젝트 업무보고")) {	
				List<ProjectReport> projectReportList = documentManagementMapper.selectProjectReportDetail(approvalDocumentCode);
				approvalDocumentDetailMap.put("projectReportList", projectReportList);
			}else if(documentFormTitle.contains("프로젝트 지출결의서")) {
				List<ProjectDisbursement> projectDisbursementList = documentManagementMapper.selectProjectDisbursementDetail(approvalDocumentCode);
				approvalDocumentDetailMap.put("projectDisbursementList", projectDisbursementList);
			}
			//문서별 프로세스 정보	
			List<ApprovalMember> approvalMemberList = documentManagementMapper.selectApprovalDocumentApprovalProcess(approvalDocumentCode);
			
			//문서별 첨부파일 정보
			List<DocumentAttachedFile> documentAttachedFile = documentManagementMapper.selectApprovalDocumentAttachedFile(approvalDocumentCode);
						
			//문서별 의견 정보
			List<DocumentOpinion> documentOpinion = documentManagementMapper.selectApprovalDocumentOpinion(approvalDocumentCode);
			
			approvalDocumentDetailMap.put("approvalMemberList", approvalMemberList); //문서상세  결재 프로세스
			approvalDocumentDetailMap.put("documentAttachedFile", documentAttachedFile); //문서상세 첨부파일
			approvalDocumentDetailMap.put("documentOpinion", documentOpinion); // 문서상세 의견
			approvalDocumentDetailMap.put("documentFormTitle", documentFormTitle); //문서양식
			
			return approvalDocumentDetailMap;
		}
}


		