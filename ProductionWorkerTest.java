public class ProductionWorkerTest {
    public static void main(String [] args)
    {
        ProductionWorker pw = new ProductionWorker("Jabir",332,1, 450000.00);
        System.out.println(pw.getName());
        System.out.println(pw.getNumber());
        System.out.println(pw.getHourlyPayRate());
        System.out.println(pw.getShiftNumber());
    }
    
}
