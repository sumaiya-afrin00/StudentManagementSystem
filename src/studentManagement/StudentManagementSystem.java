package studentManagement;

import java.util.Scanner;

public class StudentManagementSystem {

    static Scanner scanner = new Scanner(System.in);

    static String[] ids = new String[100];
    static String[] names = new String[100];
    static int[] ages = new int[100];
    static double[] gpas = new double[100];
    static int studentCount = 0;

    public static void main(String[] args) {

        while (true) {

            System.out.println("\nWelcome To Student Management System!! \n");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                viewStudents();
            } else if (choice == 3) {
                searchStudent();
            } else if (choice == 4) {
                updateStudent();
            } else if (choice == 5) {
                deleteStudent();
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        ids[studentCount] = scanner.nextLine();
        System.out.print("Enter Name: ");
        names[studentCount] = scanner.nextLine();
        System.out.print("Enter Age: ");
        ages[studentCount] = scanner.nextInt();
        System.out.print("Enter GPA: ");
        gpas[studentCount] = scanner.nextDouble();
        scanner.nextLine();

        studentCount++;
        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        System.out.println("Student List:");

        for (int i = 0; i < studentCount; i++) {
            System.out.println("ID: " + ids[i] + " - Name: " + names[i] + " - Age: " + ages[i] + " - GPA: " + gpas[i]);
        }
    }

    static void searchStudent() {
        System.out.print("Enter Student ID to Search: ");
        String searchId = scanner.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (ids[i].equals(searchId)) {
                System.out.println("\nStudent Found! ");
                System.out.println("ID: " + ids[i] + "\nName: " + names[i] + "\nAge " + ages[i] + "\nGPA: " + gpas[i] + "\n");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    static void updateStudent() {
        System.out.print("Enter Student ID to Update: ");
        String updateId = scanner.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (ids[i].equals(updateId)) {
                System.out.print("Enter New Name: ");
                names[i] = scanner.nextLine();
                System.out.print("Enter New Age: ");
                ages[i] = scanner.nextInt();
                System.out.print("Enter New GPA: ");
                gpas[i] = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    static void deleteStudent() {
        System.out.print("Enter Student ID to Delete: ");
        String deleteId = scanner.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (ids[i].equals(deleteId)) {
                for (int j = i; j < studentCount - 1; j++) {
                    ids[j] = ids[j + 1];
                    names[j] = names[j + 1];
                    ages[j] = ages[j + 1];
                    gpas[j] = gpas[j + 1];
                }
                studentCount--;
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
