package JDBCApplication1.JdbcApp1;

import jdk.internal.dynalink.beans.StaticClass;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        boolean status = true;

        while (status) {
            System.out.println("<______OPTION_______>");
            System.out.println("1: ADD STUDENT");
            System.out.println("2:DISPLAY STUDENT");
            System.out.println("3: UPDATE STUDENT");
            System.out.println("4: DELETE STUDENT");
            System.out.println("5:EXIT");
            int ch = sc.nextInt();

            switch (ch) {
//                 case 1:addStudent(rollno,name,marks);
                //call add student
//                     break;
//                 case 2:  updateStudent();//call display student
//                     break;
                case 3://call update student
                    break;
                case 4://call delete student
                    break;
                case 5:
                    status = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
//    public static void updateStudent(int rollno,Student s) {
//        Statement stat=null;
//        ResultSet rs=null;
//        String q1="select * from student_info where rolln_no"+rollno;
//        String q2="update student_info set name=?,marks=? where roll_no=?";
//      if(rs!=null){
//          PreparedStatement pstat;
//
//
//      }
//      else{
//
//      }
//    }
//
////    public static void addStudent(Student s) {
////        System.out.println("ENTER ROLL NO");
////        int rollno=sc.nextInt();
////        System.out.println("ENTER NAME");
////        String name=sc.next();
////        System.out.println("ENTER MARKS");
////        double marks=sc.nextDouble();
////        int a=service.addStudent();
////
////        System.out.println(a+"RECORD INSERTED SUCCESSFULLY");
//
//
//    }
//
//}
}