public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy autoPolicy= new AutoPolicy(1111,"toyota","sp");
        AutoPolicy autoPolicy1 = new AutoPolicy(222,"renolt","ba");

        policyInNoFaultState(autoPolicy);
        policyInNoFaultState(autoPolicy1);
    }

    private static void policyInNoFaultState(AutoPolicy autoPolicy) {
        System.out.printf("o seu carro esta");
        System.out.printf("%s%n%s%n%s%n",autoPolicy.getAccontnumber(),autoPolicy.getState(),autoPolicy.getMakeAndmodel());
    }


}
