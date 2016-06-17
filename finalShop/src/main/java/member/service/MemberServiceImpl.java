package member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	@Qualifier("memberdao")
	MemberDAO dao;
	
	@Override
	public int insert(MemberDTO user) {
		return 0;
	}

	@Override
	public MemberDTO login(MemberDTO user) {
		return dao.login(user);
	}

	@Override
	public boolean idcheck(String id) {
		return false;
	}

}
