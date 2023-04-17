public class Tryex {

  public static void main(String[] args) {
    try {
      // int a = 8 / 0;
      System.out.println("aaa");

    } catch (ArithmeticException e) {
      System.out.println("Caught risky code");
    } finally {
      System.out.println(10 / 2);
    }
  }
}