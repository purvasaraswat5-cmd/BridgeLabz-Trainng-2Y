class InvalidTemperatureException extends Exception { InvalidTemperatureException(String m){super(m);} }
class TempConverter {
    void convert(double temp, char unit) throws InvalidTemperatureException {
        if ((unit=='C' && temp<-273.15) || (unit=='F' && temp<-459.67))
            throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
        if (unit=='C') System.out.println("F: "+(temp*9/5+32));
        else System.out.println("C: "+((temp-32)*5/9));
    }
    public static void main(String[] args) {
        TempConverter t = new TempConverter();
        try { t.convert(-500, 'F'); }
        catch (InvalidTemperatureException e) { System.out.println(e.getMessage()); }
    }
}
