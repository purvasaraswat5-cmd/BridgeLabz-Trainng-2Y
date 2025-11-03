
class WrapperToPrimitive {
    public static void main(String[] args) {
        Double d = 45.67;
        double val = d.doubleValue();
        int i = (int)(double)d;
        System.out.println("Double: " + val);
        System.out.println("Int: " + i);
    }
}
