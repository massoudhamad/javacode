public class CustomerTest {
    public static void main(String[] args) {
        Address address = new Address("Zanzibar", "Urban West", "Urban", "TZ");
        Customer customer = new Customer("Misim ", 24, address);

        System.out.println(address);
        System.out.println(customer);
    }
}
