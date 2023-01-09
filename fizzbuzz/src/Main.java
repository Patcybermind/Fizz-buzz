//class
public class Main {
    // method
    public static void main(String[] args) {
        // loop over numbers
        for (int i = 1; i <= 10000000; i++) {
            // conditions
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz");
            } else if (i % 3 == 0){
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
