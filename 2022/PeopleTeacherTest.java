public class PeopleTeacherTest {
    public static void main(String[] args) {
        Teacher t = new Teacher(33232, "Abubakar", "cadin25@gmail.com", "0777874556", "Advanced Programming");
        People p = new People(33232, "Abubakar", "cadin25@gmail.com", "0777874556");
        System.out.println(p.toString());

        People pl = new Teacher(0, null, null, null, null); // Substutability - Upcast

        People pp = (Teacher) pl; // Downcast

    }

}
