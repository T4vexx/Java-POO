package POO.chapter5.AutoPolicy;

public class AutoPolicyTest {

    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",policy.getAccountNumber(), policy.getMakeAndModel(),policy.getState(),(policy.isNoFaultState() ? "is": "is not"));
    }

    public static void main(String[] args) {
        AutoPolicy autoPolicy1 = new AutoPolicy(111, "Toyota Camry", "NJ");
        AutoPolicy autoPolicy2 = new AutoPolicy(222, "Ford Fusion", "ME");

        policyInNoFaultState(autoPolicy1);
        policyInNoFaultState(autoPolicy2);
    }
}
