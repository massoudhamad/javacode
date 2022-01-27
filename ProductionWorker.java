public class ProductionWorker extends Employee {
    private int shiftNumber;
    private double hourlyPayRate;

    public ProductionWorker(String name, int number, int shiftNumber, double hourlyPayRate)
    {
        super(name,number);
        this.shiftNumber=shiftNumber;
        this.hourlyPayRate=hourlyPayRate;
    }
    public int getShiftNumber()
    {
        return shiftNumber;
    }
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }
}
