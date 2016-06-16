package aop01;

import java.util.ArrayList;

public interface DAO {
	public ArrayList<UserDTO> getUserLIst(UserDTO dto);
	public UserDTO getUser();
	public void addUser(UserDTO dto);
	public void deleteUser(UserDTO dto);
	public ArrayList<UserDTO> selectAll();
}
