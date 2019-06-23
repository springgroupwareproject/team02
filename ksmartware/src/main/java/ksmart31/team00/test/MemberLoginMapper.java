package ksmart31.team00.test;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberLoginMapper {
	public Member selectMemberForLogin(Member member); //로그인 처리를 위한 회원 정보 조회




}