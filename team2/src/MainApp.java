import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import member.MemberService;
import member.vo.MemberVO;

public class MainApp {
	public static void main(String[] args) {
		// Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");

		// Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup한다.
		MemberService memberService = (MemberService) container.getBean("memberServiceImpl");

		// [2] 글 목록 검색 기능 테스트		
		MemberVO svo = new MemberVO();
		List<MemberVO> list = memberService.getMemberList(svo);
		for (MemberVO mvo : list) {
			System.out.println("===> " + mvo.toString());
		}
		
		// [1] 글 등록 기능 테스트
		MemberVO vo = new MemberVO();
		vo.setUserid("m01");
		vo.setUserpass("m01");
		vo.setUsername("m01");
		memberService.insertMember(vo);
		
		for (MemberVO mvo : list) {
			System.out.println(",,,> " + mvo.toString());
		}
	
		// [3] 글 수정 기능 테스트 : 아이디가 m01 레코드에서 이름을 m09로 변경
		/* MemberVO vo2 = new MemberVO(); */
		vo = new MemberVO();
		vo.setUserid("m01");
		vo.setUsername("m09");
		memberService.updateMember(vo);
		
		for (MemberVO mvo : list) {
			System.out.println("...> " + mvo.toString());
		}
	
		// [4] 글 삭제 기능 테스트 : 아이디가 m01인 레코드 삭제
		/* MemberVO vo3 = new MemberVO(); */
		vo.setUserid("m01");
		memberService.deleteMember(vo);
		
		for (MemberVO mvo : list) {
			System.out.println("+++> " + mvo.toString());
		}
	
		// Spring 컨테이너 종료
		container.close();
	}
}