package JDBCApplication1.JdbcApp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Service {
    private static Connection conn;
    Student s=new Student();

    {
        String url = "jdbc:mysql://localhost:3306/book_info";
        String user = "root";
        String password = "sql@123";
        try {
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
      private int addStudent(){
          PreparedStatement pstat=null;
          int count=0;
          String query="insert into student_info values(?,?,?)";
          try {
              pstat=conn.prepareStatement(query);
              pstat.setInt(1,s.getRollno());
              pstat.setString(2,s.getName());
              pstat.setDouble(3,s.getMarks());
             count= pstat.executeUpdate();
          } catch (SQLException e) {
              throw new RuntimeException(e);
          }
          return count;

      }
}
