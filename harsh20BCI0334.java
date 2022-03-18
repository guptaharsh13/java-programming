// public class harsh20BCI0334 {

// public static void main(String[] args) {

// int num1 = 23;
// long num2 = 23l;
// short num3 = 34;
// double num4 = 23.34;

// System.out.println("Datatype of num1 is " + ((Object)
// num1).getClass().getSimpleName());
// System.out.println("Datatype of num1 is " + ((Object)
// num2).getClass().getSimpleName());
// System.out.println("Datatype of num1 is " + ((Object)
// num3).getClass().getSimpleName());
// System.out.println("Datatype of num1 is " + ((Object)
// num4).getClass().getSimpleName());

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Course Name = ");
// String course = ReadInput.nextLine();

// if (course.startsWith("J")) {
// System.out.println("Java Programming Available");
// }

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Number between 1 to 4 = ");
// int number = ReadInput.nextInt();

// if (number == 1) {
// System.out.println("Number in words = one");
// } else if (number == 2) {
// System.out.println("Number in words = two");
// } else if (number == 3) {
// System.out.println("Number in words = three");
// } else if (number == 4) {
// System.out.println("Number in words = four");
// } else {
// System.out.println("invalid value");
// }

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Number = ");
// int number = ReadInput.nextInt();

// if (number % 2 == 0) {
// System.out.println("Number is Even");
// } else {
// System.out.println("Number is Odd");
// }

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Radius = ");
// double radius = ReadInput.nextDouble();

// double area = (22 / 7) * Math.pow(radius, 2);

// System.out.println("Area of the circle = " + area);

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Room Number = ");
// int room_number = ReadInput.nextInt();

// if (room_number == 823) {
// System.out.println("Java Programming");
// } else if (room_number == 824) {
// System.out.println("Python programming");
// } else {
// System.out.println("Invalid input");
// }

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("N = ");
// int n = ReadInput.nextInt();

// int sum = n * (n + 1) / 2;

// System.out.println("sum of first n numbers = " + sum);

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Number = ");
// int num = ReadInput.nextInt();

// System.out.println("\nMutliplication Table of " + num + "\n");

// for (int count = 1; count <= 20; count++) {
// System.out.println(num + " X " + count + " = " + (num * count));
// }

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// static boolean checkPrime(int num) {
// if (num < 2) {
// return false;
// }
// for (int count = 2; count <= (num / 2); count++) {
// if (num % count == 0) {
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Number = ");
// int num = ReadInput.nextInt();

// int even = 0, odd = 0, prime = 0;

// for (int count = num; count > 0; count /= 10) {
// int digit = count % 10;
// if (digit % 2 == 0) {
// even++;
// } else {
// odd++;
// }
// if (checkPrime(digit)) {
// prime++;
// }
// }

// System.out.println("The number of even digits is " + even);
// System.out.println("The number of odd digits is " + odd);
// System.out.println("The number of prime digits is " + prime);

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// static boolean checkLeap(int year) {
// if (year % 4 == 0) {
// if (year % 100 == 0) {
// if (year % 400 == 0)
// return true;
// return false;
// }
// return true;
// }
// return false;
// }

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Year = ");
// int year = ReadInput.nextInt();

// if (checkLeap(year))
// System.out.println("The given year is a leap year");
// else
// System.out.println("The given year is not a leap year");

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Country = ");
// String country = ReadInput.nextLine();
// country = country.trim().toUpperCase();

// System.out.print("The capital of " + country + " is ");

// switch (country) {
// case "AFGHANISTAN":
// System.out.println("KABUL");
// break;
// case "ALBANIA":
// System.out.println("TIRANA");
// break;
// case "ALGERIA":
// System.out.println("ALGIERS");
// break;
// case "ANDORRA":
// System.out.println("ANDORRA LA VELLA");
// break;
// case "ANGOLA":
// System.out.println("LUANDA");
// break;
// case "ARGENTINA":
// System.out.println("BUENOS AIRES");
// break;
// case "ARMENIA":
// System.out.println("YEREVAN");
// break;
// case "AUSTRALIA":
// System.out.println("CANBERRA");
// break;
// case "AUSTRIA":
// System.out.println("VIENNA");
// break;
// case "AZERBAIJAN":
// System.out.println("BAKU");
// break;
// default:
// System.out.println("INVALID INPUT");
// }

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// String want_continue;
// int correct_count = 0;
// int incorrect_count = 0;

// do {
// System.out.println("\nquestion");
// System.out.println("option 1 - yes");
// System.out.println("option 2 - false");

// int choice;
// while (true) {
// System.out.print("\nchoice = ");
// try {
// choice = ReadInput.nextInt();
// } catch (Exception e) {
// System.out.println("\nINVALID INPUT");
// continue;
// }
// if (choice == 1) {
// correct_count++;
// break;
// } else if (choice == 2) {
// incorrect_count++;
// break;
// } else {
// System.out.println("\nINVALID INPUT");
// continue;
// }
// }

// do {
// System.out.print("\nDo you want to continue (y/n only) - ");
// want_continue = ReadInput.next();
// want_continue = want_continue.toLowerCase();
// } while (!(want_continue.equals("y") || want_continue.equals("n")));
// } while (want_continue.equals("y"));

// ReadInput.close();

// System.out.println("\nTotal number of correct submissions = " +
// correct_count);
// System.out.println("Total number of incorrect submissions = " +
// incorrect_count);

// }

// }

// import java.util.Scanner;

// class harsh20BCI0334 {
// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("n = ");
// int n = ReadInput.nextInt();

// int a[] = new int[n];

// for (int count = 0; count < n; count++) {
// a[count] = ReadInput.nextInt();
// }

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n - i - 1; j++) {
// if (a[j] > a[j + 1]) {
// int temp = a[j];
// a[j] = a[j + 1];
// a[j + 1] = temp;
// }
// }
// }

// System.out.println("\n\nNumbers after Bubble Sort");

// for (int count = 0; count < n; count++) {
// System.out.println(a[count]);
// }

// ReadInput.close();

// }
// }

// import java.util.Scanner;

// class harsh20BCI0334 {
// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("n = ");
// int n = ReadInput.nextInt();

// int a[] = new int[n];

// for (int count = 0; count < n; count++) {
// a[count] = ReadInput.nextInt();
// }

// for (int i = 0, j = n - 1; i < j; i++, j--) {
// int temp = a[i];
// a[i] = a[j];
// a[j] = temp;
// }

// System.out.println("\n\nNumbers after Reversing");

// for (int count = 0; count < n; count++) {
// System.out.println(a[count]);
// }

// ReadInput.close();

// }
// }

// import java.util.Scanner;

// class harsh20BCI0334 {
// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("n = ");
// int n = ReadInput.nextInt();

// int a[] = new int[n];

// for (int count = 0; count < n; count++) {
// a[count] = ReadInput.nextInt();
// }

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n - i - 1; j++) {
// if (a[j] > a[j + 1]) {
// int temp = a[j];
// a[j] = a[j + 1];
// a[j + 1] = temp;
// }
// }
// }

// int temp_a[] = new int[n];
// int temp_count = -1;
// temp_a[++temp_count] = a[0];

// for (int count = 1; count < n; count++) {
// if (a[count] == a[count - 1])
// continue;
// temp_a[++temp_count] = a[count];
// }

// System.out.println("\n\nUnique Numbers");

// for (int count = 0; count <= temp_count; count++) {
// System.out.println(temp_a[count]);
// }

// ReadInput.close();

// }

// import java.util.Scanner;

// class harsh20BCI0334 {
// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Username = ");
// String username = ReadInput.next();
// System.out.print("Password = ");
// String password = ReadInput.next();
// System.out.print("Confirm Password = ");
// String confirm_password = ReadInput.next();

// System.out.println();
// if (username.isEmpty()) {
// System.out.println("Username is Empty !!");
// } else if (password.isEmpty()) {
// System.out.println("Password is Empty !!");
// } else if (password.length() <= 8) {
// System.out.println("Password should be minimum 8 characters in length !!");
// } else if (password.contains(username)) {
// System.out.println("Password contains the username !!");
// } else if (!password.equals(confirm_password)) {
// System.out.println("Password does not match the confirm password !!");
// }

// ReadInput.close();

// }
// }

// import java.util.Scanner;

// class harsh20BCI0334 {
// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Number of names = ");
// int n = ReadInput.nextInt();

// String names[] = new String[n];

// for (int count = 0; count < n; count++) {
// System.out.print("Name " + (count + 1) + " = ");
// names[count] = ReadInput.next();
// }

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n - i - 1; j++) {
// if (names[j].compareTo(names[j + 1]) > 0) {
// String temp = names[j];
// names[j] = names[j + 1];
// names[j + 1] = temp;
// }
// }
// }

// System.out.println("\nNames in sorted order\n");
// for (int count = 0; count < n; count++) {
// System.out.println(names[count]);
// }

// ReadInput.close();

// }
// }

// import java.util.Scanner;

// class harsh20BCI0334 {

// static String reverseWord(String word) {
// String final_word = "";
// for (int count = word.length() - 1; count >= 0; count--) {
// final_word += word.charAt(count);
// }
// return final_word;
// }

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Sentence = ");
// String sentence = ReadInput.nextLine();

// String words[] = sentence.split(" ");

// String new_sentence = "";

// for (int count = 0; count < words.length; count++) {
// new_sentence += reverseWord(words[count]).trim() + " ";
// }

// System.out.println("\nNew Sentence\n");
// System.out.println(new_sentence);

// ReadInput.close();

// }
// }

// import java.util.Scanner;

// class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Sentence = ");
// String sentence = ReadInput.nextLine();
// System.out.print("Word = ");
// String word = ReadInput.nextLine();

// String words[] = sentence.split(" ");
// int count = 0;

// for (int i = 0; i < words.length; i++) {
// if (word.equals(words[i]))
// count++;
// }

// System.out.println("\nThe word \"" + word + "\" occurs " + count + " times in
// the sentence.\n");

// ReadInput.close();

// }
// }

// import java.util.Scanner;

// class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Sentence = ");
// String sentence = ReadInput.nextLine();
// sentence = sentence.toLowerCase();

// int num_of_vowels = 0;

// for (int count = 0; count < sentence.length(); count++) {
// char ch = sentence.charAt(count);
// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
// num_of_vowels++;
// }
// }

// System.out.println("\nNumber of vowels in the sentence = " + num_of_vowels);

// ReadInput.close();

// }
// }

// import java.util.Scanner;

// class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Username = ");
// String username = ReadInput.nextLine();
// System.out.print("Password = ");
// String password = ReadInput.nextLine();

// if (username.length() < 3) {
// System.out.println("\nWeak password !!");
// ReadInput.close();
// return;
// }

// for (int count = 0; count < username.length() - 3; count++) {
// if (password.contains(username.substring(count, count + 3))) {
// System.out.println("\nWeak password !!");
// }
// }

// ReadInput.close();

// }
// }

// class Student {

// String name, address, reg_num, email_id;
// long phone_number;

// Scanner ReadInput = new Scanner(System.in);

// Student() {
// name = "";
// address = "";
// reg_num = "";
// email_id = "";
// phone_number = 0l;
// }

// Student(String name, String address, String reg_num, Long phone_number,
// String email_id) {
// this.name = name;
// this.address = address;
// this.reg_num = reg_num;
// this.phone_number = phone_number;
// this.email_id = email_id;
// }

// void addProfileInfo() {

// System.out.print("\nEnter your Name - ");
// name = ReadInput.nextLine();

// System.out.print("Enter your Address - ");
// address = ReadInput.nextLine();

// System.out.print("Enter your Reg Number - ");
// reg_num = ReadInput.next();

// System.out.print("Enter your Phone Number - ");
// phone_number = ReadInput.nextLong();

// System.out.print("Enter your Email ID - ");
// email_id = ReadInput.next();

// }

// void viewProfileInfo() {
// System.out.println("\n\nStudent Profile Information\n");
// System.out.println("Name - " + name);
// System.out.println("Address - " + address);
// System.out.println("Registration Number - " + reg_num);
// System.out.println("Phone Number - " + phone_number);
// System.out.println("Email id - " + email_id);
// }
// }

// class harsh20BCI0334 {
// public static void main(String[] args) {
// Student student = new Student();
// student.addProfileInfo();
// student.viewProfileInfo();
// }
// }

// class harsh20BCI0334 {
// public static void main(String[] args) {

// Student students[] = new Student[4];
// for (int count = 0; count < 4; count++) {
// students[count] = new Student();
// students[count].addProfileInfo();
// }

// for (int count = 0; count < 4; count++) {
// students[count].viewProfileInfo();
// }

// }
// }

// class harsh20BCI0334 {
// public static void main(String[] args) {

// Student students[] = new Student[4];

// for (int count = 0; count < 4; count++) {
// students[count] = new Student();
// students[count].addProfileInfo();
// }

// Student student1 = new Student("Harsh Gupta", "Asansol", "20BCI0334",
// 7001876232l, "harsh@gmail.com");
// Student student2 = new Student("Anshita Bala", "Odisha", "20BEC1234",
// 9987654321l, "anshita@gmail.com");
// Student student3 = new Student("Jatin", "Rajasthan", "20BCE1234",
// 1234567899l, "jatin@gmail.com");
// Student student4 = new Student("Mayank Sharma", "BIHAR", "20BEE1234",
// 9987456123l, "mayank@gmail.com");

// // Student students[] = { student1, student2, student3, student4 };

// for (int i = 0; i < students.length; i++) {
// for (int j = 0; j < students.length - i - 1; j++) {
// if (students[j].reg_num.compareTo(students[j + 1].reg_num) > 0) {
// Student temp = students[j];
// students[j] = students[j + 1];
// students[j + 1] = temp;
// }
// }
// }

// System.out.println("\n\nStudents in Sorted order\n");

// for (int count = 0; count < 4; count++) {
// students[count].viewProfileInfo();
// }

// }
// }

// class harsh20BCI0334 {
// public static void main(String[] args) {

// Student students[] = new Student[4];

// for (int count = 0; count < 4; count++) {
// students[count] = new Student();
// students[count].addProfileInfo();
// }

// // Student student1 = new Student("Harsh Gupta", "Asansol", "20BCI0334",
// // 7001876232l, "harsh@gmail.com");
// // Student student2 = new Student("Anshita Bala", "Odisha", "20BEC1234",
// // 9987654321l, "anshita@gmail.com");
// // Student student3 = new Student("Jatin", "Rajasthan", "20BCE1234",
// // 1234567899l, "jatin@gmail.com");
// // Student student4 = new Student("Mayank Sharma", "BIHAR", "20BEE1234",
// // 9987456123l, "mayank@gmail.com");

// // Student students[] = { student1, student2, student3, student4 };

// Student final_students[] = new Student[students.length];
// int count = 0;

// for (int i = 0; i < students.length; i++) {
// if (students[i].reg_num.contains("BCE") ||
// students[i].reg_num.contains("BIT")) {
// final_students[count] = students[i];
// count++;
// }
// }

// if (final_students.length == 0) {
// System.out.println("\nNo students from SCOPE or SITE\n");
// return;
// }

// System.out.println("\nStudents from SCOPE or SITE\n");

// for (int i = 0; i < count; i++) {
// final_students[i].viewProfileInfo();
// }

// }
// }

// import java.util.Scanner;

// class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Passenger name = ");
// String name = ReadInput.nextLine();

// System.out.print("Passenger code = ");
// String code = ReadInput.nextLine();

// if (code.isEmpty()) {
// System.out.println("INVALID Passenger code");
// ReadInput.close();
// return;
// }

// System.out.print("Passenger Age = ");
// int age = ReadInput.nextInt();

// System.out.print("Passenger DOB = ");
// String dob = ReadInput.nextLine();

// System.out.print("Passenger destination = ");
// String destination = ReadInput.nextLine();

// ReadInput.close();

// String flight_name = "";
// double ticket_price = 0;

// String temp_destination = destination.toLowerCase();

// switch (temp_destination) {
// case "singapore":
// case "malaysia":
// case "taiwan":
// flight_name = "Boeing 703";
// ticket_price = 3500 + (10 / 100 * 3500.0);
// break;

// case "us":
// case "uk":
// case "canada":
// flight_name = "Lufthansa 303";
// ticket_price = 7500 + (20 / 100 * 7500.0);
// break;

// default:
// System.out.println("INVALID DESTINATION");
// return;

// }

// System.out.println("\nFLIGHT DETAILS\n");
// System.out.println("Passenger name : " + name);
// System.out.println("Passenger code : " + code);
// System.out.println("Passenger Age : " + age);
// System.out.println("Passenger DOB : " + dob);
// System.out.println("Passenger destinantion : " + destination);
// System.out.println("\nFlight Name : " + flight_name);
// System.out.println("Ticket Price Name : " + ticket_price);
// }

// }

// class Passenger {
// String name;
// String code;
// int age;
// String dob;
// String destination;

// String flight_name;
// double ticket_price;

// Passenger() {
// name = "";
// code = "";
// age = 0;
// dob = "";
// destination = "";

// flight_name = "";
// ticket_price = 0;
// }

// Passenger(String name, String code, int age, String dob, String destination)
// {
// this.name = name;
// this.code = code;
// this.age = age;
// this.dob = dob;
// this.destination = destination;

// flight_name = "";
// ticket_price = 0;
// }

// void addPassenger() {
// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Passenger name = ");
// name = ReadInput.nextLine();

// System.out.print("Passenger code = ");
// code = ReadInput.nextLine();

// if (code.isEmpty()) {
// System.out.println("INVALID Passenger code");
// ReadInput.close();
// return;
// }

// System.out.print("Passenger Age = ");
// age = ReadInput.nextInt();

// System.out.print("Passenger DOB = ");
// dob = ReadInput.nextLine();

// System.out.print("Passenger destination = ");
// destination = ReadInput.nextLine();

// ReadInput.close();

// book();
// }

// void book() {
// String temp_destination = destination.toLowerCase();
// switch (temp_destination) {
// case "singapore":
// case "malaysia":
// case "taiwan":
// flight_name = "Boeing 703";
// ticket_price = 3500 + (10 / 100 * 3500.0);
// break;

// case "us":
// case "uk":
// case "canada":
// flight_name = "Lufthansa 303";
// ticket_price = 7500 + (20 / 100 * 7500.0);
// break;

// default:
// System.out.println("INVALID DESTINATION");
// return;

// }
// }

// void display() {
// System.out.println("\nFLIGHT DETAILS\n");
// System.out.println("Passenger name : " + name);
// System.out.println("Passenger code : " + code);
// System.out.println("Passenger Age : " + age);
// System.out.println("Passenger DOB : " + dob);
// System.out.println("Passenger destinantion : " + destination);
// System.out.println("\nFlight Name : " + flight_name);
// System.out.println("Ticket Price Name : " + ticket_price);
// }
// }

// class harsh20BCI0334 {
// public static void main(String[] args) {
// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Number of passengers = ");
// int n = ReadInput.nextInt();

// Passenger passengers[] = new Passenger[n];

// for (int count = 0; count < n; count++) {
// System.out.println("\nPASSENGER " + (count + 1) + "\n");
// passengers[count] = new Passenger();
// passengers[count].addPassenger();
// }

// for (int count = 0; count < n; count++) {
// String destination = passengers[count].destination.toLowerCase();
// if (destination.equals("us") || destination.equals("uk") ||
// destination.equals("canada")) {
// passengers[count].display();
// }
// if (destination.equals("singapore") || destination.equals("taiwan") ||
// destination.equals("malaysia")) {
// passengers[count].display();
// }
// }

// System.out.println("Enter FLIGHT ID");
// int flight_id = ReadInput.nextInt();
// System.out.println("\nPASSENGERS FOR FLIGHT ID " + flight_id + "\n");
// for (int count = 0; count < n; count++) {

// if (passengers[count].flight_name.contains(Integer.toString(flight_id))) {
// passengers[count].display();
// }
// }

// ReadInput.close();
// }
// }

// import java.util.Scanner;

// class Customer {

// String name;
// String address;
// long phone_number;
// String email_id;
// int customer_id;
// double money;

// Customer() {
// name = "";
// address = "";
// phone_number = 0;
// email_id = "";
// customer_id = 0;
// money = 0;
// }

// Customer(String name, String address, long phone_number, String email_id, int
// customer_id) {
// this.name = name;
// this.address = address;
// this.phone_number = phone_number;
// this.email_id = email_id;
// customer_id = 0;
// money = 0;
// }

// void addAccount() {
// Scanner ReadInput = new Scanner(System.in);

// System.out.print("\nEnter your Name - ");
// name = ReadInput.nextLine();

// System.out.print("Enter your Address - ");
// address = ReadInput.nextLine();

// System.out.print("Enter your Phone Number - ");
// phone_number = ReadInput.nextLong();

// System.out.print("Enter your Email ID - ");
// email_id = ReadInput.nextLine();

// customer_id = (int) (Math.random() * Math.pow(10, 5));

// ReadInput.close();

// display();
// }

// void changeDetails() {
// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Enter your Address - ");
// address = ReadInput.nextLine();

// System.out.print("Enter your Phone Number - ");
// phone_number = ReadInput.nextLong();

// System.out.print("Enter your Email ID - ");
// email_id = ReadInput.nextLine();

// ReadInput.close();

// display();
// }

// void deposit(double money) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("\nEnter your Customer ID - ");
// int inp_customer_id = ReadInput.nextInt();

// ReadInput.close();

// if (customer_id != inp_customer_id) {
// System.out.println("\nINVALID Customer ID");
// return;
// }

// if (money <= 0) {
// System.out.println("\nINVALID amount");
// return;
// }
// this.money += money;
// System.out.println("\nSuccessfully deposited an amount of " + money);
// }

// void withdraw(double money) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Enter your Customer ID - ");
// int inp_customer_id = ReadInput.nextInt();

// ReadInput.close();

// if (customer_id != inp_customer_id) {
// System.out.println("\nINVALID Customer ID");
// return;
// }

// if (money <= 0 || this.money < money) {
// System.out.println("\nINVALID amount");
// return;
// }
// this.money += money;
// System.out.println("\nSuccessfully withdrawn an amount of " + money);
// }

// void display() {
// System.out.println("\nCUSTOMER DETAILS\n");
// System.out.println("Customer Name - " + name);
// System.out.println("Customer Address - " + address);
// System.out.println("Customer Phone Number - " + phone_number);
// System.out.println("Customer Email ID - " + email_id);
// System.out.println("Customer ID - " + customer_id);
// System.out.println("Current Balance - " + money);
// }

// }

// class harsh20BCI0334 {
// public static void main(String[] args) {
// Scanner ReadInput = new Scanner(System.in);

// System.out.print("Enter Number of Customers - ");
// int n = ReadInput.nextInt();

// Customer customers[] = new Customer[n];

// for (int count = 0; count < n; count++) {
// customers[count] = new Customer();
// customers[count].addAccount();

// System.out.print("Enter an amount to deposit - ");
// double amount = ReadInput.nextDouble();

// customers[count].deposit(amount);
// }

// System.out.println("\nList of Customers with deposit < 1000\n");
// for (int count = 0; count < n; count++) {
// if (customers[count].money < 1000)
// customers[count].display();
// }

// ReadInput.close();
// }
// }

// class Student {
// String name;
// int roll_number;
// int n; // denotes number of subjects
// String subject_codes[];
// String subject_names[];
// double marks[];

// Student() {
// name = "";
// roll_number = 0;
// n = 0;
// subject_codes = new String[n];
// subject_names = new String[n];
// marks = new double[n];
// }

// Student(String name, int roll_number, String subject_codes[], String
// subject_names[], double marks[]) {
// this.name = name;
// this.roll_number = roll_number;
// this.subject_codes = subject_codes;
// this.subject_names = subject_names;
// this.marks = marks;
// }

// void addSubjects() {
// Scanner ReadInput = new Scanner(System.in);
// }

// }

// import java.util.Scanner;
// import java.util.Arrays;

// class Customer {

// String customer_name;
// String favourite_food;

// Customer() {
// customer_name = "";
// favourite_food = "";
// }

// Customer(String customer_name, String favourite_food) {
// this.customer_name = customer_name;
// this.favourite_food = favourite_food;
// }

// void input() {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the name of the customer - ");
// customer_name = sc.nextLine();
// System.out.println("Enter the favourite food of the customer - ");
// favourite_food = sc.nextLine();

// sc.close();
// }

// void display() {
// System.out.println("\n\nCustomer Details\n");
// System.out.println("Customer Name - " + customer_name);
// System.out.println("Favourite Food of the Customer - " + favourite_food);
// }

// }

// class harsh20BCI0334 {
// public static void main(String[] args) {
// int n = 10;

// Customer customers[] = new Customer[n];

// for (int count = 0; count < n; count++) {
// customers[count] = new Customer();
// customers[count].input();
// }

// String foods[] = new String[n];
// for (int count = 0; count < n; count++) {
// foods[count] = "";
// }

// String common = "";

// for (int count = 0; count < n; count++) {
// if (Arrays.asList(foods).contains(customers[count].favourite_food)) {
// foods[count] = customers[count].favourite_food;
// continue;
// }
// common = customers[count].favourite_food;
// }

// if (common.isEmpty()) {
// System.out.println("\n\nNo Customers have a common food");
// } else {
// System.out.println("\n\nCustomers with a common favourite food\n");
// for (int count = 0; count < n; count++) {
// if (customers[count].favourite_food.equalsIgnoreCase(common)) {
// customers[count].display();
// }
// }
// }
// }
// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("n = ");
// int n = ReadInput.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.print("n = ");
// int n = ReadInput.nextInt();

// int sum = 0;

// for (int count = 0; count < n; count++) {
// System.out.println("Enter a number");
// int temp = ReadInput.nextInt();
// if (temp % 2 == 0) {
// System.out.println("Enter an odd number");
// continue;
// }
// sum += temp;
// }

// System.out.println("The sum of odd numbers - " + sum);

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// static boolean checkPrime(int num) {
// if (num < 2) {
// return false;
// }
// for (int count = 2; count <= (num / 2); count++) {
// if (num % count == 0) {
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// int n = 5;

// for (int count = 0; count < n; count++) {
// System.out.println("Enter a number");
// int temp = ReadInput.nextInt();
// if (checkPrime(temp)) {
// System.out.println("You have entered a prime number - " + temp);
// break;
// }
// }

// ReadInput.close();

// }

// }

// import java.util.Scanner;

// public class harsh20BCI0334 {

// public static void main(String[] args) {

// Scanner ReadInput = new Scanner(System.in);

// System.out.println("Enter number 1 -");
// int num1 = ReadInput.nextInt();
// System.out.println("Enter number 2 -");
// int num2 = ReadInput.nextInt();

// while (true) {
// System.out.println("Enter an operation -");
// char operation = ReadInput.next().charAt(0);
// switch (operation) {
// case '+':
// System.out.println("The sum of 2 numbers - " + (num1 + num2));
// break;
// case '-':
// System.out.println("The difference of 2 numbers - " + (num1 - num2));
// break;
// case '*':
// System.out.println("The product of 2 numbers - " + (num1 * num2));
// break;
// case '%':
// System.out.println("The modulus of 2 numbers - " + (num1 % num2));
// break;
// default:
// System.out.println("INVALID INPUT");
// }
// System.out.println("Do you want to continue -");
// char ans = ReadInput.next().charAt(0);
// if (!(ans == 'y' || ans == 'Y')) {
// break;
// }
// }

// ReadInput.close();

// }
// }

public class harsh20BCI0334 {

    static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int count = 2; count <= (num / 2); count++) {
            if (num % count == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3, 4 }, { 1, 2, 3 }, { 1, 2 }, { 1 } };

        int count = 0;

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                if (checkPrime(a[row][column])) {
                    count++;
                }
            }
        }

        System.out.println("The number of prime numbers in the jagged array - " + count);
    }
}