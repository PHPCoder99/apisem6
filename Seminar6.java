package com.company;

import java.util.*;

public class Seminar6 {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Asus", 5, "Pink", "Windows", 100, 100));
        laptops.add(new Laptop("Asus", 3, "Red", "Windows", 50, 120));
        laptops.add(new Laptop("Apple", 6, "Gray", "MacOS", 130, 90));
        laptops.add(new Laptop("Lenovo", 4, "Black", "Windows", 50, 200));
        laptops.add(new Laptop("Apple", 10, "White", "MacOS", 100, 130));
        laptops.add(new Laptop("DEL", 7, "Olive", "Linux", 80, 200));
        Map<Integer, Object> criteria = new HashMap<>();

        int choice;
        int val;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter NUMBER associated with desired criterion");
            System.out.println("1 - Version");
            System.out.println("2 - RAM");
            System.out.println("3 - ROM");
            System.out.println("or press 0 to exit menu");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                break;
            }
            System.out.println("Enter minimum value for your criterion");
            val = Integer.parseInt(scanner.nextLine());
            criteria.put(choice, val);
        }
        String value;
        choice = 0;
        while (true) {
            System.out.println("Enter NUMBER associated with desired criterion");
            System.out.println("4 - Manufacturer");
            System.out.println("5 - Color");
            System.out.println("6 - OS");
            System.out.println("or press 0 to exit menu");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                break;
            }
            System.out.println("Enter value for your criterion");
            value = scanner.nextLine();
            criteria.put(choice, value);
        }

        for (Integer key : criteria.keySet()){
            System.out.println(key);
            System.out.println(criteria.get(key).getClass());
        }

        for (Laptop laptop : laptops) {
            if ((criteria.get(1) == null || greaterThan(laptop.getVersion(), (Integer) criteria.get(1))) &&
                    (criteria.get(2) == null || greaterThan(laptop.getRam(), (Integer) criteria.get(2))) &&
                    (criteria.get(3) == null || greaterThan(laptop.getRom(), (Integer) criteria.get(3))) &&
                    (criteria.get(4) == null || Objects.equals(laptop.getManufacturer(), criteria.get(4))) &&
                    (criteria.get(5) == null || Objects.equals(laptop.getColor(), criteria.get(5))) &&
                    (criteria.get(6) == null || Objects.equals(laptop.getOs(), criteria.get(6)))
            ) {
                System.out.println(laptop);
            }
        }
    }

    private static boolean greaterThan(Integer obj1, Integer obj2){
        if (obj1 == null || obj2 == null) {
            return false;
        } else return obj1 >= obj2;
    }
}
