package member.dao;

import java.sql.Connection;
import java.sql.SQLException;

import member.dto.MemberDTO;

public interface MemberDAO {
	int memberInsert(Connection conn,MemberDTO user);
	MemberDTO login(MemberDTO user);
	boolean idCheck(Connection conn,String id);
}
