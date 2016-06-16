package aop01;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

public class UserDAO implements DAO{

	@Override
	public ArrayList<UserDTO> getUserLIst(UserDTO dto) {
		System.out.println("#########################");
		System.out.println("####getUserList호출...#####");
		System.out.println("#########################");
		return null;
	}

	@Override
	public UserDTO getUser() {
		System.out.println("#########################");
		System.out.println("######getUser호출...#######");
		System.out.println("#########################");
		return null;
	}

	@Override
	public void addUser(UserDTO dto) {
		System.out.println("#########################");
		System.out.println("######addUser호출...#######");
		System.out.println("#########################");
		
	}

	@Override
	public void deleteUser(UserDTO dto) {
		System.out.println("#########################");
		System.out.println("#####deleteUser호출...####");
		System.out.println("#########################");
		
	}

	@Override
	public ArrayList<UserDTO> selectAll() {
		System.out.println("#########################");
		System.out.println("#####selectAll호출...####");
		System.out.println("#########################");
		return null;
	}

}
