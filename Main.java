import java.util.Scanner; // import Scanner

public class Main {
   public static void main(String[] args) {
      // Declare Scanner
      Scanner scnr = new Scanner(System.in);

      // Declare variables
      double x;
      double y;
      double z;

      // Get user input
      System.out.println("Enter three floating-point numbers: ");
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();

      // Output
      System.out.println(Math.pow(x, z) + " " + Math.pow(x, Math.pow(y, z)) 
                        + " " + Math.abs(y) + " " + Math.sqrt(Math.pow(x * y, z)));

      // Close Scanner
      scnr.close();
   }
}
