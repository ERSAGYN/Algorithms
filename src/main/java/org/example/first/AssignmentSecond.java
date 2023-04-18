package org.example.first;

import org.example.first.extra.Book;
import org.example.first.extra.Employee;
import org.example.first.extra.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AssignmentSecond {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("and");
        strings.add("Goodbye");
        for(String s: strings){
            System.out.println(s);
        }

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add((int) (Math.random() * 10));
            System.out.println(integers.get(i));
        }

        Collections.sort(integers);
        System.out.println(integers);

        tenth();
    }

    public static void third() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNext()) {
            String str = scanner.next();
            strings.add(str);
            System.out.println(str);
        }
    }

    public static void fourth() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            int integer = scanner.nextInt();
            integers.add(integer);
            max = Math.max(max, integer);
            min = Math.min(min, integer);
        }
        System.out.printf("max = %d; min = %d;", max, min);
    }

    public static void fifth() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0, average;
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/fifth.txt"))) {
            String strCurrentLine;
            while ((strCurrentLine = br.readLine()) != null) {
                int num = Integer.parseInt(strCurrentLine);
                numbers.add(num);
                sum += num;
            }
            average = sum / numbers.size();
            System.out.printf("sum = %d; average = %d", sum, average);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sixth() {
        ArrayList<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/sixth.txt"))) {
            String strCurrentLine;
            while ((strCurrentLine = br.readLine()) != null) {
                if(!strings.contains(strCurrentLine)) {
                    strings.add(strCurrentLine);
                    System.out.println(strCurrentLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void seventh() {
        ArrayList<Student> students = new ArrayList<>();
        int sum = 0, average;
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/seventh.txt"))) {
            String strCurrentLine;
            while ((strCurrentLine = br.readLine()) != null) {
                Student student = new Student();
                String[] strings = strCurrentLine.split(" ", 2);
                student.setName(strings[0]);
                student.setGrade(Integer.parseInt(strings[1]));
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getGrade(), o1.getGrade());
            }
        });
        for (Student s: students) {
             System.out.println(s.getGrade() + " " + s.getName());
        }
    }

    public static void eighth() {
        ArrayList<Book> books = new ArrayList<>();
        int sum = 0, average;
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/eighth.txt"))) {
            String strCurrentLine;
            while ((strCurrentLine = br.readLine()) != null) {
                Book book = new Book();
                String[] strings = strCurrentLine.split(" ", 3);
                book.setTitle(strings[0]);
                book.setAuthor(strings[1]);
                book.setDate(strings[2]);
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kitaptin atyn engiziniz:");
        String search = scanner.nextLine();
        boolean contains = false;
        for (Book b: books) {
            if(b.getTitle().equals(search)) {
                System.out.printf("Book title: %s,\nBook author: %s,\nBook date: %s", b.getTitle(),b.getAuthor(),b.getDate());
                contains = true;
                return;
            }
        }
        if(!contains) System.out.println("the book was not found");
    }

    public static void ninth() {
        ArrayList<Employee> employees = new ArrayList<>();
        int total = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/ninth.txt"))) {
            String strCurrentLine;
            while ((strCurrentLine = br.readLine()) != null) {
                Employee employee = new Employee();
                String[] strings = strCurrentLine.split(" ", 2);
                employee.setName(strings[0]);
                employee.setSalary(Integer.parseInt(strings[1]));
                employees.add(employee);
                total += employee.getSalary();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Total: " + total);
    }

    public static void tenth() {
        ArrayList<String> dates = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/tenth.txt"))) {
            String strCurrentLine;
            while ((strCurrentLine = br.readLine()) != null) {
                dates.add(strCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(dates);
        for (String s: dates) {
            System.out.println(s);
        }
    }


}
