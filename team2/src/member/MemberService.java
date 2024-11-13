package member;

import java.util.List;

import member.vo.MemberVO;

public interface MemberService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	void insertMember(MemberVO vo);

	// 글 수정
	void updateMember(MemberVO vo);

	// 글 삭제
	void deleteMember(MemberVO vo);

	// 글 상세 조회
	MemberVO getMember(MemberVO vo);

	// 글 목록 조회
	List<MemberVO> getMemberList(MemberVO vo);
}
