package gym;

import gym.memberships.BasicMembership;
import gym.memberships.Membership;
import gym.memberships.PremiumMembership;
import gym.models.Customer;
import gym.services.GymService;

public class Main {
    public static void main(String[] args) {

        // Create gym service
        GymService gymService = new GymService();

        // Create memberships
        Membership basic = new BasicMembership();
        Membership premium = new PremiumMembership();

        // Create customers
        Customer customer1 = new Customer("Ivan", 25, basic);
        Customer customer2 = new Customer("Maria", 22, premium);
        Customer customer3 = new Customer("Georgi", 30, basic);

        // Add customers to the gym
        gymService.addCustomer(customer1);
        gymService.addCustomer(customer2);
        gymService.addCustomer(customer3);

        // Print information about all customers
        gymService.printAllCustomers();

        // Print total number of customers
        System.out.println("\nTotal customers: " + gymService.getCustomerCount());

        // Print gym rules
        Membership.printGymRules();
    }

}
