package javacombined318;

public class StringFormatArgumentIndexExample {
  public static void main(String[] args) {
    String product = "Bread";
    double price = 4.99;
    String name="Sam";
    
    String str = String.format("%3$s is the name of User and " +
                    "The price of %2$s is CAD $%1$.2f today.",
            price, product,name);
    
    // The price of Bread is CAD $4.99 today.
    System.out.println(str);
  }
}
