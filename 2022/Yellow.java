public class Yellow extends Blue {
    public void two() {
        System.out.println("Yellow 2");
    }

    public void three() {
        two();
        System.out.println("Yellow 3");
    }
}