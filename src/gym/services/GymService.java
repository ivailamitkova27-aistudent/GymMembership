package gym.services;

import gym.models.Customer;

public class GymService {
    private Customer[] customers;
    private int customerCount;

    public GymService() {
        customers = new Customer[10];
        customerCount = 0;
    }

    public void addCustomer(Customer customer) {

        if (customer == null) {
            System.out.println("Cannot add an empty customer.");
            return;
        }

        if (customerCount < customers.length) {

            customers[customerCount] = customer;
            customerCount++;

            System.out.println("Customer added successfully!");

        } else {

            System.out.println("Gym is full! Maximum capacity is 10 customers.");
        }
    }

    public void printAllCustomers() {

        if (customerCount == 0) {
            System.out.println("There are no registered customers.");
            return;
        }

        System.out.println("\n===== ALL CUSTOMERS =====");

        for (int i = 0; i < customerCount; i++) {
            customers[i].printInfo();
        }
    }

    public int getCustomerCount() {
        return customerCount;
    }

}
