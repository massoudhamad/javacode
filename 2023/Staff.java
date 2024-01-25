public class Staff extends People {
    private String staffNo;
    private String department;

    public Staff(String name, String address, String staffNo, String department) {
        super(name, address);
        this.staffNo = staffNo;
        this.department = department;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff [staffNo=" + staffNo + ", department=" + department + "]";
    }
}
