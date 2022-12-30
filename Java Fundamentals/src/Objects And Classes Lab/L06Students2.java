package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L06Students2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students> studentList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputStudentArr = input.split(" ");
            String firstName = inputStudentArr[0];
            String lastName = inputStudentArr[1];
            String age = inputStudentArr[2];
            String town = inputStudentArr[3];

            if (isStudentExisting(studentList, firstName, lastName)) {
                Students students = getStudent(studentList, firstName, lastName, age, town);
            } else {
                Students student = new Students(firstName, lastName, age, town);
                studentList.add(student);
            }

            input = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();

        for (Students iteam : studentList) {
            if (iteam.getTown().equals(searchTown)) {
                System.out.printf("%s %s is %s years old%n",
                        iteam.getFirstName(),
                        iteam.getLastName(),
                        iteam.getAge());
            }
        }
    }

    private static boolean isStudentExisting(List<Students> students, String firstName, String lastName) {
        for (Students student : students) {
            if (student.getFirstName().equals(firstName) && student.lastName.equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Students getStudent(List<Students> students, String firstName, String lastName, String age, String town) {
        Students existingStudent = null;
        for (Students student : students) {
            if (student.getFirstName().equals(firstName) && student.lastName.equals(lastName)) {
                existingStudent = student;
                existingStudent.age = age;
                existingStudent.town = town;
            }
        }
        return existingStudent;
    }

    static class Students {
        String firstName;
        String lastName;
        String age;
        String town;

        public Students(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }
}
