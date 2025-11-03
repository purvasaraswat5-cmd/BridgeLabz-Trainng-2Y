class ValidateAge {
    public static boolean isValid(String age){
        try{
            int val=Integer.parseInt(age);
            return val>=18;
        }catch(Exception e){return false;}
    }
    public static void main(String[] args){
        String[] tests={"17","20","abc"};
        for(String t:tests) System.out.println(t+" -> "+isValid(t));
    }
}
