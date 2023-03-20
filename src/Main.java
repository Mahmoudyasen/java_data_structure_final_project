import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("***self service***");
        System.out.println("1-Customer......");
        System.out.println("2-Manager......");
        boolean E=true;
        Scanner S= new Scanner(System.in);
        while (E){
            int Decider = S.nextInt();
            if(Decider==1){
                System.out.println("please enter your Name: ");
                String Name=S.next();
                String Number=" ";
                boolean x=true;
                while (x){
                    System.out.println("Enter your phone number: ");
                    Number=S.next();
                    if (!Number.matches("[0-9]+")) {
                        System.out.println("Invalid number try again....");
                        x=true;
                    }
                    else {
                        x=false;
                    }
                }
                String data = Name+" "+Number+"\n";
                try {
                    FileWriter output = new FileWriter("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\customerData",true);
                    output.write(data);
                    System.out.println("your name and number are saved to our data file......");
                    output.close();
                }
                catch (Exception e) {
                    e.getStackTrace();
                }
                Customer.Operation(Name,Number);
                E=false;
            }
            else if (Decider==2) {

                System.out.println("enter your password: ");
                String P=S.next();
                String str = Files.readString(Paths.get("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\Password"));
                if (P.equals(str)){
                    System.out.println("Welcome please choose your operation : ");
                    System.out.println("1-change password.");
                    System.out.println("2-manage customer orders.");
                    System.out.println("3-show all bills.");
                    System.out.println("4-show all customer data.");
                    System.out.println("5-clear the bills history.");
                    System.out.println("6-delete all customer data.");
                    System.out.println("7-Shut down.");
                    boolean SC=true;
                    while (SC){
                        System.out.println("What is the operation you want: ");
                        int Cc=S.nextInt();
                        if(Cc==1){
                            Manager.ChangePassword();
                            SC=false;
                        }
                        else if(Cc==2){
                            Manager.ManageCustomerOrders();
                            SC=false;
                        }
                        else if(Cc==3){
                            Manager.ShowAllBills();
                            SC=false;
                        }
                        else if(Cc==4){
                            Manager.ShowCustomerData();
                            SC=false;
                        }
                        else if(Cc==5){
                            Manager.ClearTheBillsHistory();
                            SC=false;
                        }
                        else if(Cc==6){
                            Manager.DeleteAllCustomerData();
                            SC=false;
                        }
                        else if(Cc==7){
                            System.out.println("The Program Shut Down.......");
                            SC=false;
                        }
                        else {
                            System.out.println("Wrong input,Try again:");
                            SC=true;
                        }
                    }
                }
                else{
                    System.out.println("WRONG PASSWORD,RERUN....");
                    E=false;
                }
                E=false;
            }
            else {
                System.out.println("Error Please Try Again...............");
               E=true;
            }
        }
    }
}