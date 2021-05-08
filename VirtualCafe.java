// In Source Packet in file except/ex1/VirtualCafe.java
class VirtualCafe {

    public static void main(String[]args)
        {
        try {
            if(drinkCoffee>0)
            System.out.println("Coffee is just right.");
        }
        catch (ArithmeticException e) {
            System.out.println("Coffee is too cold.");
            // Deal with an irate customer...
        }
        catch (NullPointerException e) {
            System.out.println("Coffee is too hot.");
            // Deal with an irate customer...
        }
    }
}
