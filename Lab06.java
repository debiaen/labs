package mypackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class Lab06 {
    
    static class Student {
        private String name;
        private String surname;
        private int age;
        private int course;
        private double averageMark;

        public Student(String name, String surname, int age, int course, double averageMark) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.course = course;
            this.averageMark = averageMark;
        }

        @Override
        public String toString() {
            return String.format("Student{name='%s', surname='%s', age=%d, course=%d, averageMark=%.2f}",
                    name, surname, age, course, averageMark);
        }

        public String getSurname() {
            return surname;
        }
    }

    
    static class StudentDatabaseArrayList {
        private ArrayList<Student> database;

        public StudentDatabaseArrayList() {
            this.database = new ArrayList<>();
        }

        public void addStudent(Student student) {
            database.add(student);
        }

        public void removeStudent(String surname) {
            database.removeIf(student -> student.getSurname().equals(surname));
        }

        public void displayAllStudents() {
            for (Student student : database) {
                System.out.println(student);
            }
        }

        public Student findStudent(String surname) {
            for (Student student : database) {
                if (student.getSurname().equals(surname)) {
                    return student;
                }
            }
            return null;
        }
    }

    
    static class StudentDatabaseLinkedList {
        private LinkedList<Student> database;

        public StudentDatabaseLinkedList() {
            this.database = new LinkedList<>();
        }

        public void addStudent(Student student) {
            database.add(student);
        }

        public void addStudentFirst(Student student) {
            database.addFirst(student);
        }

        public void addStudentLast(Student student) {
            database.addLast(student);
        }

        public void removeStudent(String surname) {
            database.removeIf(student -> student.getSurname().equals(surname));
        }

        public void displayAllStudents() {
            for (Student student : database) {
                System.out.println(student);
            }
        }

        public Student findStudent(String surname) {
            for (Student student : database) {
                if (student.getSurname().equals(surname)) {
                    return student;
                }
            }
            return null;
        }
    }

   
    static class StudentDatabaseHashMap {
        private HashMap<String, Student> database;

        public StudentDatabaseHashMap() {
            this.database = new HashMap<>();
        }

        public void addStudent(Student student) {
            database.put(student.getSurname(), student);
        }

        public void removeStudent(String surname) {
            database.remove(surname);
        }

        public void displayAllStudents() {
            for (String surname : database.keySet()) {
                System.out.println(database.get(surname));
            }
        }

        public Student findStudent(String surname) {
            return database.get(surname);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== ArrayList ===");
        StudentDatabaseArrayList arrayListDb = new StudentDatabaseArrayList();
        arrayListDb.addStudent(new Student("Ivan", "Petrov", 19, 1, 88.5));
        arrayListDb.addStudent(new Student("Anna", "Ivanova", 20, 2, 91.0));
        arrayListDb.displayAllStudents();

        System.out.println("\n=== LinkedList ===");
        StudentDatabaseLinkedList linkedListDb = new StudentDatabaseLinkedList();
        linkedListDb.addStudentFirst(new Student("Maria", "Sidorova", 21, 3, 85.0));
        linkedListDb.addStudentLast(new Student("John", "Smith", 22, 4, 87.0));
        linkedListDb.displayAllStudents();

        System.out.println("\n=== HashMap ===");
        StudentDatabaseHashMap hashMapDb = new StudentDatabaseHashMap();
        hashMapDb.addStudent(new Student("Ivan", "Petrov", 19, 1, 88.5));
        hashMapDb.addStudent(new Student("Anna", "Ivanova", 20, 2, 91.0));
        hashMapDb.displayAllStudents();
    }
}
