import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Manager {
    public static void ChangePassword(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the new password: ");
        String NewPassword=s.next();
        try {
            FileWriter output = new FileWriter("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\Password");
            output.write(NewPassword);
            System.out.println("The Password has been changed successfully....");
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static void ManageCustomerOrders() throws IOException {
        boolean f=true;
        BufferedReader reader;
        Scanner s=new Scanner(System.in);
        Queue<String> D= new PriorityQueue<>();
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\homeDelivery"));
            String line = reader.readLine();

            while (line != null) {
                D.add(line);
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("THE DELIVERY NUMBERS IN ORDER: "+D);
        while (f){
            System.out.println("if the order is ready to be delivered for the number "+D.element()+" press (y) OR press (o) to shut down : ");
            String d=s.next();
            if(d.equals("y")){
                if(D.isEmpty()){
                    System.out.println("there are no orders left to be delivered.....");
                    f=false;
                }
                else {
                    D.remove();
                    f=true;
                    System.out.println("next.....");
                    if(D.isEmpty()){
                        System.out.println("there are no orders left to be delivered.....");
                        f=false;
                        BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\homeDelivery"));
                        writer.write("");
                        writer.flush();
                    }
                }
            }
            else if(d.equals("o")){
                System.out.println("SYSTEM SHUTTING DOWN.....");
                System.out.println("SYSTEM IS OFF.");
                f=false;
            }
            else{
                System.out.println("wait for the order then press (y).");
                f=true;
            }
        }

    }
    public static void ShowAllBills() throws IOException {
        String str = Files.readString(Paths.get("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\bill"));
        System.out.println("THE CUSTOMERS DATA : ");
        System.out.println(str);
    }
    public static void ShowCustomerData() throws IOException {
        String str = Files.readString(Paths.get("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\customerData"));
        System.out.println("THE CUSTOMERS DATA : ");
        System.out.println(str);

    }
    public static void ClearTheBillsHistory() throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\bill"));
        writer.write("");
        writer.flush();
    }
    public static void DeleteAllCustomerData() throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\customerData"));
        writer.write("");
        writer.flush();
    }
}
