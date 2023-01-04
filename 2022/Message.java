class Message {
    public void displayMessage(String course) {
        System.out.println("Welcome to Java OOP 2022" + course);
    }
    

    public static void main(String[] args) {
        Message msg = new Message();
        msg.displayMessage();
    }
}
