class SensorData {
    static void log(double temp){System.out.println("Primitive: "+temp);}
    static void log(Double temp){System.out.println("Wrapper: "+temp);}
    public static void main(String[] args){
        double p=36.5;
        Double w=37.2;
        log(p);
        log(w);
    }
}
