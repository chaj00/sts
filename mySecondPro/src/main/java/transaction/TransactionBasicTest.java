package transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionBasicTest {
	public static void main(String[] args) {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "scott";
			String password = "tiger";
			String sql ="";
			Connection con =null;
			PreparedStatement ptmt =null;
			boolean state = false; //현재상태값
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection(url, user, password);
				con.setAutoCommit(false);
				
				sql ="insert into myemp values('1111','1111','1111',1000,'1111','001','1111')";
				ptmt=con.prepareStatement(sql);
				ptmt.executeUpdate();
				
				sql ="insert into myemp values('2222','2222','2222',1000,'2222','001','2222')";
				ptmt=con.prepareStatement(sql);
				ptmt.executeUpdate();
				
				sql ="insert into myemp values('3333','3333','3333',1000,'3333','001','3333')";
				ptmt=con.prepareStatement(sql);
				ptmt.executeUpdate();
				
				state=true;
				
			}catch(ClassNotFoundException e){
				System.out.println("드라이버로딩 실패");
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(state){
						con.commit();
					}else{
						con.rollback();
					}
					if(ptmt!=null)ptmt.close();
					if(con!=null)con.close();
					
				}catch(Exception e){
				}
				
			}
		

	}

}
