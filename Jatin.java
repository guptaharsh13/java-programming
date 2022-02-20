import java.util.Scanner;

public class Jatin {

    public static void sort(String words[]) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }

    public static void display(String words[]) {

        System.out.println("\nWORDS\n");

        for (int count = 0; count < words.length; count++) {
            System.out.println(words[count]);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n - ");
        int n = sc.nextInt();

        String words[] = new String[n];

        for (int count = 0; count < n; count++) {
            words[count] = sc.next();
        }

        char characters[] = new char[5];
        for (int count = 0; count < 5; count++) {
            characters[count] = sc.next().charAt(0);
        }

        sort(words);

        display(words);

        System.out.println("\nEnter 5 characters -\n");

        for (int count = 0; count < n; count++) {
            for (int i = 0; i < 5; i++) {
                words[count] = words[count].replace(characters[i], '\0');
            }
        }

        sort(words);

        display(words);

        sc.close();

    }
}
