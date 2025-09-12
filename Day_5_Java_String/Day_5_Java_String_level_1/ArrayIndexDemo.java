public class ArrayIndexDemo {
    public static void generate() {
        String[] arr = {"a","b","c"};
        System.out.println(arr[5]);
    }
    public static void handle() {
        try {
            String[] arr = {"a","b","c"};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        // generate();
        handle();
    }
}
