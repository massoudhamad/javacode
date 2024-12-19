class GradeBook {
    
    public GradeBook(){
    }

    public void displayMessage() {
        System.out.println("Welcome to Grade Book!");
    }
}

public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook gb = new GradeBook();
        gb.displayMessage();
    }

}

/*
 * class GradeBook {
 * void displayMessage() {
 * }
 * 
 * public class GradeBook {
 * public void displayMessage() {
 * public string name;
 * }
 * }
 * public class GradeBook {
 * private Strinhg name;
 * public void setName(String name) {
 * }
 * }
 * 
 * public class GradeBook {
 * protected String name;
 * public void setName(String name) {
 * }
 * }
 * 
 * public class TextBook extends GradeBook {
 * public void displayMessage() {
 * sop(name);
 * }
 * public void displayMessage(String message) {
 * }
 * }
 * 
 * 
 * 
 */