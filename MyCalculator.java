import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    public int divisorSum(int n) {
        if (n > 1000) {
            return 0;
        }
        int sum = 0;
        for (int count = 1; count <= n; count++) {
            if (n % count == 0) {
                sum += count;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        MyCalculator calc = new MyCalculator();
        System.out.println(calc.divisorSum(num));
        sc.close();
    }

}