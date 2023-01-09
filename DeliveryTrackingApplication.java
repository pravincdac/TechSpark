package techSpark.demo;

import java.util.List;
import java.util.ArrayList;

public class DeliveryTrackingApplication {

    // This is a simple class that represents a product delivery
    public static class Delivery {
        private String productName;
        private String address;
        private String agent;
        private String status;

        public Delivery(String productName, String address, String agent, String status) {
            this.productName = productName;
            this.address = address;
            this.agent = agent;
            this.status = status;
        }

        public String getProductName() {
            return productName;
        }

        public String getAddress() {
            return address;
        }

        public String getAgent() {
            return agent;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    // This is a simple class that represents an agent
    public static class Agent {
        private String name;
        private List<Delivery> deliveries;

        public Agent(String name) {
            this.name = name;
            this.deliveries = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public List<Delivery> getDeliveries() {
            return deliveries;
        }
    }

    // This is a simple in-memory database of deliveries
    private static List<Delivery> deliveries = new ArrayList<>();

    // This is a simple in-memory database of agents
    private static List<Agent> agents = new ArrayList<>();

    public static void main(String[] args) {
        // Initialize the database with some sample data
        agents.add(new Agent("Pravin"));
        agents.add(new Agent("Sanket"));
        agents.add(new Agent("Ganesh"));

        deliveries.add(new Delivery("Mobile", "123 Main St", "Pravin", "Product Dispatched"));
        deliveries.add(new Delivery("Laptop", "456 Main St", "Sanket", "Product Dispatched"));
        deliveries.add(new Delivery("HeadPhone", "789 Main St", "Ganesh", "Product Dispatched"));

        // Employee Frontend:

        // This is the page where the employee can create a new delivery
        // The employee enters the product name, address, and selects an agent from the list of agents in the database
        String productName = "Camera";
        String address = "246 Elm St";
        String agent = "Omkar";
        String status = "Product Dispatched";
        createDelivery(productName, address, agent, status);

        // This is the page where the employee can view a list of all deliveries
        List<Delivery> allDeliveries = getAllDeliveries();
        for (Delivery delivery : allDeliveries) {
            System.out.println(delivery.getProductName() + " - " + delivery.getAddress() + " - " + delivery.getAgent() + " - " + delivery.getStatus());
        }

       


}

	private static List<Delivery> getAllDeliveries() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void createDelivery(String productName, String address, String agent, String status) {
		// TODO Auto-generated method stub
		
	}}
