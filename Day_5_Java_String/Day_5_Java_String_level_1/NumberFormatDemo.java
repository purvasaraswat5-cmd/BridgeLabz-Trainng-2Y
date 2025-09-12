public class NumberFormatDemo {
    public static void generate() {
        String s = "abc";
        int n = Integer.parseInt(s);
        System.out.println(n);
    }
    public static void handle() {
        try {
            String s = "abc";
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        // generate();
        handle();
    }
}
