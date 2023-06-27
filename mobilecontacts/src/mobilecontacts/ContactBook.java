package mobilecontacts;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class ContactBook {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Map<String, String> contacts = new HashMap<>();

	        while (true) {
	            System.out.println("\nContact Book");
	            System.out.println("1. Add Contact");
	            System.out.println("2. Search Contact");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice (1-3): ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addContact(scanner, contacts);
	                    break;
	                case 2:
	                    searchContact(scanner, contacts);
	                    break;
	                case 3:
	                    System.out.println("Thank you for using the Contact Book. Goodbye!");
	                    return;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	                    break;
	            }
	        }
	    }

	    private static void addContact(Scanner scanner, Map<String, String> contacts) {
	        System.out.print("Enter the contact name: ");
	        String name = scanner.next();

	        System.out.print("Enter the contact number: ");
	        String number = scanner.next();

	        contacts.put(name, number);
	        System.out.println("Contact added successfully!");
	    }

	    private static void searchContact(Scanner scanner, Map<String, String> contacts) {
	        System.out.print("Enter the contact name to search: ");
	        String name = scanner.next();

	        if (contacts.containsKey(name)) {
	            String number = contacts.get(name);
	            System.out.println("Contact found - Name: " + name + ", Number: " + number);
	        } else {
	            System.out.println("Contact not found!");
	        }
	    }
	}






