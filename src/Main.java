public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 95;
        double heightM = 1.83;
        double bmi = service.calculate(weightKg, heightM);

        System.out.println("BMI = " + bmi);
    }
}
