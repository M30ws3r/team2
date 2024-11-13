package member.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.MemberService;
import member.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDaoMybatis memberDAO;

	public void insertMember(MemberVO vo) {
		memberDAO.insertMember(vo);
		// MemberDaoMybatis.java 의 insertMember 호출. 인자로 vo를 준다.
	}

	public void updateMember(MemberVO vo) {
		memberDAO.updateMember(vo);
		// MemberDaoMybatis.java 의 updateMember 호출. 인자로 vo를 준다.
	}

	public void deleteMember(MemberVO vo) {
		memberDAO.deleteMember(vo);
		// MemberDaoMybatis.java 의 deleteMember 호출. 인자로 vo를 준다.
	}

	public MemberVO getMember(MemberVO vo) {
		return memberDAO.getMember(vo);
		// MemberDaoMybatis.java 의 getMember 호출. 인자로 vo를 준다.
	}

	public List<MemberVO> getMemberList(MemberVO vo) {
		return memberDAO.getMemberList(vo);
		// MemberDaoMybatis.java 의 getMemberList 호출. 인자로 vo를 준다.
	}
}