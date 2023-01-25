public class Teacher extends People {
    private String subject;

    public Teacher(int id, String name, String email, String phone, String subjects) {
        super(id, name, email, phone);
        this.subject = subjects;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher [ID=" + super.getId() + " Name=" + super.getName() + " Email=" + super.getEmail() + " Phone="
                + super.getPhone() + " Subject=" + subject + "]";
    }

}
