class Propagation {
    void methodB() {
        try { Integer.parseInt("abc"); }
        catch (NumberFormatException e) { System.out.println("Handled NumberFormatException"); }
        String s = null;
        s.length();
    }
    void methodA() {
        try { methodB(); }
        catch (Exception e) { System.out.println("Handled in methodA: " + e); }
    }
    public static void main(String[] args) {
        new Propagation().methodA();
    }
}
