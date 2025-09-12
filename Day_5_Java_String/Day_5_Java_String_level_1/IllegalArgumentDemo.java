public class IllegalArgumentDemo {
    public static void generate() {
        String s = "hello";
        System.out.println(s.substring(4, 2));
    }
    public static void handle() {
        try {
            String s = "hello";
            System.out.println(s.substring(4, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        // generate();
        handle();
    }
}
