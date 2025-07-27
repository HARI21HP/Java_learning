import java.util.*;
import java.io.IOException ;
import java.io.*;
class student{

  public  void Add(){
      //name,id,dept
      Scanner student_details = new Scanner(System.in);
      System.out.print("NAME: ");
      String name =student_details.nextLine();
      System.out.print("DEPT: ");
      String dept = student_details.nextLine();
      System.out.print("ID: ");
      int id = student_details.nextInt();
    

      student_details.close();
 
      try{
        FileWriter fw = new FileWriter("student.txt",true);
        BufferedWriter add_students = new BufferedWriter(fw);
        add_students.write("  NAME:"+name +"  ID:" + id +"  DEPT:" + dept);
        add_students.newLine();
        System.out.println("---ADDED SUCCESFULLY--");
        add_students.close();
      }catch(IOException  e){
        System.out.println(e);
      }
  }

public void view(){
  try{
  FileReader fr = new FileReader("student.txt"); // only one argument
  BufferedReader View = new BufferedReader(fr);
  int i;
  while((i =View.read())!= -1){
    System.out.print((char)i);

  }
    View.close();
    fr.close();
    System.out.println("-----VIEWED FINALLY!!-----");
  }catch(IOException e){
    System.out.println("ERROR 404");
  }
}
//  public void delete(){

// }
}
public class Main{
  public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    System.out.println("--------------STUDENT MANAGEMENT SYSTEM--------------");
    System.out.println("1.ADD\n2.UPDATE\n3.DELETE\n4.VIEW");
    System.out.println("choose option");
    int option = input.nextInt();
    
    //object

    student s2 = new student();
    switch( option){
      case 1 : s2.Add();break;
      // case 2 : update();break;
      // case 3 : delete();break;
      case 4 : s2.view();break;
      default : System.out.println("invaild");
    }
    input.close();
  }
}