package com.workshopio;

// Restaurant Menu System

import java.util.*;
import java.util.stream.Collectors;

public class Restaurant {

    List<Menu> items = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    void addItems() {
        System.out.println("Enter how many item you want to add");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of item");
            String name = scanner.next();
            System.out.println("Enter the rate of item");
            int rate = scanner.nextInt();
            Menu menu1 = new Menu(name, rate);
            items.add(menu1);
            System.out.println(items);
        }
    }

    void removeItems() {
        System.out.println("Enter the name of item ");
        String name = scanner.next();
        Iterator<Menu> iterator = items.iterator();

        while (iterator.hasNext()) {
            Menu delObj = iterator.next();
            if (name.equals(delObj.getName())) {
                iterator.remove();
                items.forEach(System.out::println);
                System.out.println("Item deleted");
                break;
            } else {
                System.out.println("Items not exists");
            }
        }
    }

    void searchByName() {
        System.out.println("Enter yhe name of item");
        String name = scanner.next();
        List<Menu> ref_var = items.stream()
                .filter(itemName -> itemName.getName().equals(name)).collect(Collectors.toList());
        for (Menu menu : ref_var) {
            System.out.println(menu);
        }
    }

    void sortByRate() {
        System.out.println("Sorted Details are: ");
        items.stream().sorted(Comparator.comparing(Menu::getPrice)).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        int menuList = 1;
        while (menuList != 0) {
            System.out.println("Enter 1 to add items");
            System.out.println("Enter 2 to delete items");
            System.out.println("Enter 3 to Search items");
            System.out.println("Enter 4 to Sort by name");
            System.out.println("Enter 0 to exit");
            menuList = scanner.nextInt();
            switch (menuList) {
                case 1:
                    restaurant.addItems();
                    break;
                case 2:
                    restaurant.removeItems();
                    break;
                case 3:
                    restaurant.searchByName();
                    break;
                case 4:
                    restaurant.sortByRate();
                    break;
            }
        }
    }
}
