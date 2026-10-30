package gym.memberships;

public interface Membership {
    double getPrice();

    default void printBenefits() {
        System.out.println("Benefits: Access to fitness equipment.");
    }

    static void printGymRules() {
        System.out.println("\n===== GYM RULES =====");
        System.out.println("1. Maximum capacity: 10 customers.");
        System.out.println("2. Customers must follow gym rules.");
        System.out.println("3. Membership prices are in euros.");
        System.out.println("4. Customer age must be a positive integer.");
        System.out.println("=====================\n");
    }

}
