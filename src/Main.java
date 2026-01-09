public class Main {

    public static void main(String[] args) {
//        Car car = new Car("GTR", "Black", 2, true);
//
//        car.describeCar();

        Customer customer = new Customer();
        Customer customerLevi = new Customer("Levi",  "levi@gmail.com");
        Customer customerChiloo = new Customer("Chiloo", 5000, "chiloo@gmail.com");

        System.out.println("Hi " + customer.getName() +
                ". Confirm this is your email address " + customer.getEmailAddress() +
                ". Your credit limit is $" + customer.getCreditLimit());
        System.out.println("Hi " + customerLevi.getName() +
                ". Confirm this is your email address " + customerLevi.getEmailAddress() +
                ". Your credit limit is $" + customerLevi.getCreditLimit());
        System.out.println("Hi " + customerChiloo.getName() +
                ". Confirm this is your email address " + customerChiloo.getEmailAddress() +
                ". Your credit limit is $" + customerChiloo.getCreditLimit());
    }
}
