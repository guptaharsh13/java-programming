public class employee {
    int emp_id;
    int age;
    static int count = 1;

    {
        emp_id = 10001;
        age = 20;
        count++;
        System.out.println("One");
    }

    employee() {
        employee(count);
        age = 21;
        count = count++;
        System.out.println("Two");
    }

    void employee(int count) {
        count = count++;
        System.out.println("Three");
    }

    static {
        count = count - 5;
        System.out.println("Four");
    }

    public static void main(String args[]) {
        System.out.println(employee.count);
        main();
        employee obj = new employee();
        System.out.println(employee.count);
    }

    static {
        count = count + 1;
        System.out.println("Five");
    }

    public static void main() {
        count = count + 5;
    }
}
