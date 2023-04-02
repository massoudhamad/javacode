public class Red extends Yellow {
    public void one() {
        super.one();
        System.out.println("Red 1");
    }

    public void two() {
        System.out.println("Red 2");
        super.two();
    }
}