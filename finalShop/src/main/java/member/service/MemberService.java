package member.service;

import member.dto.MemberDTO;

public interface MemberService {
	int insert(MemberDTO user);
	MemberDTO login(MemberDTO user);
	boolean idcheck(String id);
}
