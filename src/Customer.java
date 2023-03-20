import java.io.FileWriter;
import java.util.*;
import java.util.Queue;
public class Customer {
    public static void Operation(String Name,String Number){
        System.out.println("Hello "+Name+": ");
        Queue<String> DataOfCustomer = new PriorityQueue<>();
        System.out.println("The available Items in Menu: ");
        System.out.println("1-Chips:4tl    |2-Cola:6tl");
        System.out.println("3-Rice:24tl    |4-Meat:50tl");
        System.out.println("5-Chicken:25tl |6-Mac&Cheese:10tl");
        System.out.println("7-Chocolate:8tl|8-Sweets:5tl");
        System.out.println("9-ketchup:13tl |10-almond:9tl");
        System.out.println("11-Orange:2tl  |12-Apples:1tl");
        System.out.println("13-Water:5tl   |14-cucumber:11");
        System.out.println("15-Milk:15tl   |16-Beans:5tl");
        System.out.println("17-Cookies:8tl |18-Carrot:7tl");
        System.out.println("19-potatoes:1tl|20-napkins:10tl");
        System.out.println("_____________________________");
        System.out.println("How many items you want to buy : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<n;i++){
            System.out.println("enter the number of the item NO."+(i+1)+":");
            int d=s.nextInt();
            stack.push(d);
            boolean cc=true;
            while (cc){
                System.out.println("do you want to cancel the added item (y/n): ");
                String g= s.next();
                if(g.equals("y")){
                    stack.pop();
                    System.out.println("enter the new item : ");
                    d=s.nextInt();
                    stack.push(d);
                    cc=false;
                }
                else if(g.equals("n")){
                    System.out.println("continuing...");
                    cc=false;
                }
                else{
                    System.out.println("wrong input,try again......");
                    cc=true;
                }
            }

        }
        LinkedList<Integer>items=new LinkedList<>();
        LinkedList<String>itemsName=new LinkedList<>();
        if(stack.contains(1)){
            items.add(4);
            itemsName.add("Chips");
        }
        if (stack.contains(2)) {
            items.add(6);
            itemsName.add("Cola");
        }
        if (stack.contains(3)) {
            items.add(24);
            itemsName.add("Rice");
        }
        if (stack.contains(4)) {
            items.add(50);
            itemsName.add("Meat");
        }
        if (stack.contains(5)) {
            items.add(25);
            itemsName.add("Chicken");
        }
        if (stack.contains(6)) {
            items.add(10);
            itemsName.add("Mac&Cheese");
        }
        if (stack.contains(7)) {
            items.add(8);
            itemsName.add("Chocolate");
        }
        if (stack.contains(8)) {
            items.add(5);
            itemsName.add("Sweats");
        }
        if (stack.contains(9)) {
            items.add(13);
            itemsName.add("Ketchup");
        }
        if (stack.contains(10)) {
            items.add(9);
            itemsName.add("Almond");
        }
        if (stack.contains(11)) {
            items.add(2);
            itemsName.add("Orange");
        }
        if (stack.contains(12)) {
            items.add(1);
            itemsName.add("Apple");
        }
        if (stack.contains(13)) {
            items.add(5);
            itemsName.add("Water");
        }
        if (stack.contains(14)) {
            items.add(11);
            itemsName.add("Cucumber");
        }
        if (stack.contains(15)) {
            items.add(15);
            itemsName.add("Milk");
        }
        if (stack.contains(16)) {
            items.add(5);
            itemsName.add("Beans");
        }
        if (stack.contains(17)) {
            items.add(8);
            itemsName.add("Cookies");
        }
        if (stack.contains(18)) {
            items.add(7);
            itemsName.add("Carrot");
        }
        if (stack.contains(19)) {
            items.add(1);
            itemsName.add("Potatoes");
        }
        if (stack.contains(20)) {
            items.add(10);
            itemsName.add("Napkins");
        }

            double sum=0;
            boolean q=false;
            for (int i=0;i<n;i++){
                sum+= items.pop();
                itemsName.pop();
                q=true;
            }
            if(q=true){
                if(stack.contains(1)){
                    items.add(4);
                    itemsName.add("Chips");
                }
                if (stack.contains(2)) {
                    items.add(6);
                    itemsName.add("Cola");
                }
                if (stack.contains(3)) {
                    items.add(24);
                    itemsName.add("Rice");
                }
                if (stack.contains(4)) {
                    items.add(50);
                    itemsName.add("Meat");
                }
                if (stack.contains(5)) {
                    items.add(25);
                    itemsName.add("Chicken");
                }
                if (stack.contains(6)) {
                    items.add(10);
                    itemsName.add("Mac&Cheese");
                }
                if (stack.contains(7)) {
                    items.add(8);
                    itemsName.add("Chocolate");
                }
                if (stack.contains(8)) {
                    items.add(5);
                    itemsName.add("Sweats");
                }
                if (stack.contains(9)) {
                    items.add(13);
                    itemsName.add("Ketchup");
                }
                if (stack.contains(10)) {
                    items.add(9);
                    itemsName.add("Almond");
                }
                if (stack.contains(11)) {
                    items.add(2);
                    itemsName.add("Orange");
                }
                if (stack.contains(12)) {
                    items.add(1);
                    itemsName.add("Apple");
                }
                if (stack.contains(13)) {
                    items.add(5);
                    itemsName.add("Water");
                }
                if (stack.contains(14)) {
                    items.add(11);
                    itemsName.add("Cucumber");
                }
                if (stack.contains(15)) {
                    items.add(15);
                    itemsName.add("Milk");
                }
                if (stack.contains(16)) {
                    items.add(5);
                    itemsName.add("Beans");
                }
                if (stack.contains(17)) {
                    items.add(8);
                    itemsName.add("Cookies");
                }
                if (stack.contains(18)) {
                    items.add(7);
                    itemsName.add("Carrot");
                }
                if (stack.contains(19)) {
                    items.add(1);
                    itemsName.add("Potatoes");
                }
                if (stack.contains(20)) {
                    items.add(10);
                    itemsName.add("Napkins");
                }
            }
        System.out.println(items);
        System.out.println(itemsName);
        System.out.println("the total is : "+sum);
        Management.tax(sum);
        String c1="Yes";
        String c2="No";
        boolean a=true;
        while (a){
            System.out.println("Do you have a discount code : ");
            String c3=s.next();
            if(c3.equals(c1)){
                System.out.println("enter the discount code: ");
                String c4=s.next();
                Management.check(c4,sum);
                a=false;
            }
            else if(c3.equals(c2)){
                a=false;
            }
            else{
                System.out.println("Wrong input try again.....");
                a=true;
            }
        }
        System.out.println("1-home delivery / 2-store pickup: ");
        boolean ç=true;
        String data=Number+"\n";
        while (ç){
            int z=s.nextInt();
            if(z==1){
                DataOfCustomer.add(data);
                try {
                    FileWriter output = new FileWriter("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\homeDelivery",true);
                    output.write(DataOfCustomer.element());
                    System.out.println("thank you for buying you will receive a call from our employees soon......");
                    output.close();
                }
                catch (Exception e) {
                    e.getStackTrace();
                }
                String Data= Number+" "+itemsName+" "+sum;
                try {
                    FileWriter output = new FileWriter("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\bill",true);
                    output.write(Data);
                    output.close();
                }
                catch (Exception e) {
                    e.getStackTrace();
                }
                ç=false;
            }
            else if (z==2){
                System.out.println("your order is ready for you to pick it up.");
                String Data= Number+" "+itemsName+" "+sum;
                try {
                    FileWriter output = new FileWriter("C:\\Users\\ASUS\\IdeaProjects\\test\\project\\src\\bill",true);
                    output.write(Data);
                    output.close();
                }
                catch (Exception e) {
                    e.getStackTrace();
                }
                ç=false;
            }
            else{
                System.out.println("Error,Try Again: ");
                ç=true;
            }
        }
    }
}
