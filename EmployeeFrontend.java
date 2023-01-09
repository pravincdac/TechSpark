package techSpark.demo;


	import java.util.Scanner;

import techSpark.demo.DeliveryTrackingApplication.Delivery;

import java.util.List;

	public class EmployeeFrontend {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Create a new delivery");
	            System.out.println("2. View a list of all deliveries");
	            System.out.println("3. View delivery status");
	            System.out.println("4. Exit");
	            System.out.print("Enter a choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            if (choice == 1) {
	                System.out.print("Enter product name: ");
	                String productName = scanner.nextLine();
	                System.out.print("Enter address: ");
	                String address = scanner.nextLine();
	                System.out.print("Enter agent name: ");
	                String agent = scanner.nextLine();
	                String status = "Product Dispatched";
	                createDelivery(productName, address, agent, status);
	            } else if (choice == 2) {
	                List<Delivery> allDeliveries = getAllDeliveries();
	                for (Delivery delivery : allDeliveries) {
	                    System.out.println(delivery.getProductName() + " - " + delivery.getAddress() + " - " + delivery.getAgent() + " - " + delivery.getStatus());
	                }
	            } else if (choice == 3) {
	                System.out.print("Enter product name: ");
	                String productName = scanner.nextLine();
	                Delivery delivery = getDelivery(productName);
	                if (delivery == null) {
	                    System.out.println("Delivery not found");
	                } else {
	                    System.out.println("Status: " + delivery.getStatus());
	                }
	            } else if (choice == 4) {
	                break;
	            } else {
	                System.out.println("Invalid choice");
	            }
	        }
	    }

		private static Delivery getDelivery(String productName) {
			// TODO Auto-generated method stub
			return null;
		}

		private static List<Delivery> getAllDeliveries() {
			// TODO Auto-generated method stub
			return null;
		}

		private static void createDelivery(String productName, String address, String agent, String status) {
			// TODO Auto-generated method stub
			
		}
	}


