import java.util.*;
class MarksReport {
    public static void main(String[] args){
        Object[] inputs={"85",95,Integer.valueOf(88),"null"};
        ArrayList<Integer> list=new ArrayList<>();
        for(Object o:inputs){
            try{
                if(o==null)continue;
                String s=o.toString();
                if(s.equals("null"))continue;
                list.add(Integer.parseInt(s));
            }catch(Exception e){}
        }
        double avg=list.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average: "+avg);
    }
}
