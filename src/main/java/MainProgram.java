import java.sql.SQLException;
import java.util.Scanner;

public class MainProgram {
    private DAO_Implementation obj;
    Connection con;

     MainProgram() throws SQLException, ClassNotFoundException {
        this.obj = new DAO_Implementation((Connection) con.connect());
        this.con = new Connection();
    }
    public static void main (String args[]) throws SQLException, ClassNotFoundException{
         Boolean flag=true;

         Scanner key = new Scanner(System.in);

         MainProgram obj1 =new MainProgram();
         String ans;

         System.out.println("Choose from the following options");
         while (flag){
             System.out.println("/nEnter A to Add, D to Delete, S to Search, Di to Display , E to Edit, Ex to Exit");
             ans =key.nextLine();

             if(ans.equals("A")){

             }
         }
    }
}
