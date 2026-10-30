package gym.memberships;

public class PremiumMembership implements Membership{
    @Override
    public double getPrice() {
        return 60.00;
    }

    @Override
    public void printBenefits() {
        System.out.println("Benefits: Access to fitness equipment and sauna.");
    }

}
