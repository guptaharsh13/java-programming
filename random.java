import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num = sc.nextInt();
            System.out.println(num);

            sc.close();

            if (num == 13) {
                // throw new Number13Exception("some random exception message");
                throw new Number13Exception();
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n");
            System.out.println(e.getMessage());
        }

    }
}

class Number13Exception extends Exception {

    Number13Exception() {

    }

    Number13Exception(String message) {
        super(message);
    }

}