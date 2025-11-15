
package mid_proj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LAFT {
    
    static class Item {
    int id;
    String name;
    String category;
    boolean isClaimed;

    public Item(int id, String name, String category) {
        
        this.id = id;
        this.name = name;
        this.category = category;
        this.isClaimed = false;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               " | Name: " + name +
               " | Category: " + category +
               " | Claimed: " + (isClaimed ? "Yes" : "No");
        
        }
    }
        
   static ArrayList<Item> items= new ArrayList<>();
   static Set<String> categories = new HashSet<>();
   static int idCounter = 1;
   static Scanner sc = new Scanner(System.in);
   
    
     public static void main(String[] args) {
         Item item = new Item(idCounter++, "Test", "Category");
        System.out.println(item);
         
               //List of Lost Items
      Item newItem = new Item(idCounter++, "Wallet", "Accessories");
        items.add(newItem);
    
    // Add categories
        for (Item Items : items) {
            categories.add(item.category);
    }
  
        while (true) {
            System.out.println("\n===== LOST & FOUND TRACKER =====");
            System.out.println("1. Add Found Item");
            System.out.println("2. View All Items");
            System.out.println("3. Mark Item as Claimed");
            System.out.println("4. View Unclaimed Items");
            System.out.println("5. Delete an Item");
            System.out.println("6. View Unique Categories");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addItem();
                case 2 -> viewItems();
                case 3 -> markClaimed();
                case 4 -> viewUnclaimed();
                case 5 -> deleteItem();
                case 6 -> viewCategories();
                case 7 -> {
                    System.out.println("Exiting system...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    // CREATE
    static void addItem() {
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter category: ");
        String category = sc.nextLine();

        Item newItem = new Item(idCounter++, name, category);
        items.add(newItem);
        categories.add(category);

        System.out.println("Item added successfully!");
    }

    // READ
    static void viewItems() {
        if (items.isEmpty()) {
            System.out.println("No items found.");
            return;
        }
        System.out.println("\n--- All Items ---");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    // UPDATE
    static void markClaimed() {
        System.out.print("Enter item ID to mark as claimed: ");
        int id = sc.nextInt();

        for (Item item : items) {
            if (item.id == id) {
                item.isClaimed = true;
                System.out.println("Item marked as claimed!");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // VIEW UNCLAIMED
    static void viewUnclaimed() {
        System.out.println("\n--- Unclaimed Items ---");
        boolean found = false;

        for (Item item : items) {
            if (!item.isClaimed) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) System.out.println("No unclaimed items.");
    }

    // DELETE
    static void deleteItem() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
                

        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.id == id) {
                iterator.remove();
                System.out.println("Item deleted successfully!");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // VIEW UNIQUE CATEGORIES (HashSet)
    static void viewCategories() {
        System.out.println("\n--- Unique Categories ---");
        if (categories.isEmpty()) {
            System.out.println("No categories available.");
            return;
        }
        for (String cat : categories) {
            System.out.println("- " + cat);
        }
    }
}


    

