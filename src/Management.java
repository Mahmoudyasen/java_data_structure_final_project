public class Management {
    public static void tax(double s){
        double r=s+(s*0.15);
        System.out.println("total after tax is : {"+r+"}.");
    }
    public static void discount(double s){
        double r=s-(s*.25);
        System.out.println("the total after the discount :{"+r+"}.");
    }
    public static void check(String r ,double s){
       String r1="MY442002";
       if (r1.equals(r)){
           Management.discount(s);
       }
    }
}
