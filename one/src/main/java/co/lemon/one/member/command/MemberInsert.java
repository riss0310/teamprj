package co.lemon.one.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.lemon.one.common.Command;
import co.lemon.one.member.service.MemberService;
import co.lemon.one.member.service.MemberVO;
import co.lemon.one.member.serviceImpl.MemberServiceImpl;

public class MemberInsert implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		MemberService ms = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setMemberId(request.getParameter("memberId"));
		vo.setMemberPw(request.getParameter("memberPw"));
		vo.setMemberName(request.getParameter("memberName"));	
		vo.setMemberTel(request.getParameter("memberTel"));
		vo.setMemeberGrade(request.getParameter("memberGrade"));
		
		int n = ms.memberInsert(vo);
		if(n != 0) {
			//System.out.println("입력 성공");
			request.setAttribute("message", "회원가입이 정상적으로 처리되었습니다.");
		} else {
			//System.out.println("입력 실패");
			request.setAttribute("message", "회원가입이 실패하였습니다.");
		}
		return "member/memberMessage";
	
	}

}
