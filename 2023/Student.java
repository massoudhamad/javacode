public class Student extends People {
    private String regNumber;
    private String programme;

    public Student(String name, String address, String regNumber, String programme) {
        super(name, address);
        this.regNumber = regNumber;
        this.programme = programme;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    @Override
    public String toString() {
        return "Student [name = " + super.getName() + " regNumber=" + regNumber + ", programme=" + programme
                + "address " + super.getAddress() + "]";
    }
}