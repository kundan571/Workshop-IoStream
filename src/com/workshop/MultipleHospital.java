package com.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultipleHospital {


//     static Scanner scanner = new Scanner(System.in);
//    public List<Hospital>  addDetails() {
//        List<Hospital> list = new ArrayList<Hospital>();
//        MultipleHospital multipleHospital = new MultipleHospital();
//        // User input to Adding all details
//        System.out.println("Enter name of patient");
//        multipleHospital.setName(scanner.next());
//        System.out.println("Enter Age of Patient");
//        multipleHospital.setAge(scanner.nextInt());
//        System.out.println("Enter phone_number");
//        multipleHospital.setPhone_number(scanner.nextLong());
//        System.out.println("Enter city name: ");
//        multipleHospital.setCity(scanner.next());
//        System.out.println("Enter state");
//        multipleHospital.setState(scanner.next());
//        System.out.println("Enter department");
//        multipleHospital.setDepartment(scanner.next());
//
//        list.add(multipleHospital);
//        System.out.println(list);
//        Stream<Hospital> k = list.stream().filter(name -> name.name.startsWith("k")).collect(Collectors.toList()).forEach(System.out::println);
//
//        return multipleHospital;
//       // List<Hospital> filterlist=list.stream().filter(name -> name.name.startsWith("k")).collect(Collectors.toList()).forEach(System.out::println);
//
//    }

    public static void main(String[] args) {
        List<Hospital> list = new ArrayList<Hospital>();
        Hospital hospital1 = new Hospital("kundan", 26, 123456789, "sheohar", "Bihar", "neuro");
        Hospital hospital2 = new Hospital("rahul", 25, 987654321, "bhagalpur", "bihar", "bone");
        Hospital hospital3 = new Hospital("satya", 23, 684352685, "gorakhpur", "up", "Therapy");
        Hospital hospital4 = new Hospital("sawami", 24, 684352685, "gorakhpur", "up", "cardio");

        list.add(hospital1);
        list.add(hospital2);
        list.add(hospital3);
        list.add(hospital4);

        // System.out.println(list);
        List<Hospital> refvar = list.stream().filter(name -> name.name.startsWith("k")).collect(Collectors.toList());
        System.out.println(refvar);


//        MultipleHospital multipleHospital = new MultipleHospital();
//        multipleHospital.addDetails();
//        System.out.println("Enter 1 to add more details and 0 to exit");
//        int ans = scanner.nextInt();
//        while (ans != 0) {
//            multipleHospital.addDetails();
//            System.out.println("Enter 1 to add more details and 0 to exit");
//            ans = scanner.nextInt();
//        }


    }
}

