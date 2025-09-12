public class NullPointerDemo {
    public static void generate() {
        String s = null;
        System.out.println(s.length());
    }
    public static void handle() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        // generate();
        handle();
    }
}
