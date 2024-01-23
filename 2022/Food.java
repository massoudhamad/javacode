public class Food {
    public String getTaste() {
        return "like chicken";
    }

    public String getGoodness() {
        return "Yum!";
    }
}

public class Lemon extends Food {
    public String getTaste() {
        return "sour";
    }

    public String getGoodness() {
        return "Pucker";
    }
}

public class Rat extends Food {
    public String getGoodness() {
        return "Yuck!";
    }

}

public static void main (String[] args) {
 Rat r = new Rat();
 System.out.println(r.getGoodness() + " Tastes " + r.getTaste());

 Food f = new Lemon();
 System.out.println(f.getGoodness() + "Tastes " + f.getTaste());
}