package co.lemon.one.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.lemon.one.common.DataSource;
import co.lemon.one.member.service.MemberMapper;
import co.lemon.one.member.service.MemberService;
import co.lemon.one.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);

	@Override
	public List<MemberVO> memberSelectList() {
		// TODO Auto-generated method stub
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberDelete(vo);
	}

	@Override
	public MemberVO memberLogin(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberLogin(vo);
	}

}
