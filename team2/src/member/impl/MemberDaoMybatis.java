package member.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import member.vo.MemberVO;

@Repository
public class MemberDaoMybatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	/*
	 * * SqlSession 주요 메소드
			   - selectList ( )
			   - selectOne ( )
			   - insert ( )
			   - update ( )
			   - delete ( )

	 */
	public void insertMember(MemberVO vo) {
		System.out.println(",,,> Mybatis insertMember() 호출");
		mybatis.insert("com.ict.MemberMapper.insertMember", vo); 
		// membermapping.xml 의 namespace 로부터 member-mapping.xml 의 insertMember 함수 호출.
	}

	public void updateMember(MemberVO vo) {
		System.out.println("...> Mybatis updateMember() 호출");
		mybatis.update("com.ict.MemberMapper.updateMember", vo);
		// membermapping.xml 의 namespace 로부터 member-mapping.xml 의 updateMember 함수 호출.
	}

	public void deleteMember(MemberVO vo) {
		System.out.println("+++> Mybatis deleteMember() 호출");
		mybatis.delete("com.ict.MemberMapper.deleteMember", vo);
		// membermapping.xml 의 namespace 로부터 member-mapping.xml 의 deleteMember 함수 호출.
	}

	public MemberVO getMember(MemberVO vo) {
		System.out.println("***> Mybatis getMember() 호출");
		return (MemberVO) mybatis.selectOne("com.ict.MemberMapper.getMember", vo);
		// membermapping.xml 의 namespace 로부터 member-mapping.xml 의 getMember 함수 호출.
	}

	public List<MemberVO> getMemberList(MemberVO vo) {
		System.out.println("===> Mybatis getMemberList() 호출");
		return mybatis.selectList("com.ict.MemberMapper.getMemberList", vo);
		// membermapping.xml 의 namespace 로부터 member-mapping.xml 의 getMemberList 함수 호출.
	}
}