public class Test {
    public static void main(String[] args) {
        int i;
        for (i = 5; i >= 0; i--){
            switch(i){
            case 1: System.out.println(i + ":" + i*2);
            case 2: System.out.println(i + ":" + i*3);break;
            case 3: System.out.println(i + ":" + i*4);
            case 4: System.out.println(i + ":" + i*5); break;
            case 5: System.out.println(i + ":" + i*6); break;
            default: System.out.println(i + ":" + i*7);
            }
            }
    }
}