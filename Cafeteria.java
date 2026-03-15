
import java.util.Scanner;

public class Cafeteria {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Dime el numero de productos que quieres comprar");
    int numeroA = sc.nextInt();
    System.out.println("Dime el precio de los productos");
    double numeroB = sc.nextInt();

    double total = numeroA * numeroB;
    System.out.println("El total a pagar es= " + total);
  }
}