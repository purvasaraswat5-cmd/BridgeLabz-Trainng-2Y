import java.util.*;
class PerformanceTest {
    public static void main(String[] args){
        int n=1000000;
        int[] arr=new int[n];
        ArrayList<Integer> list=new ArrayList<>(n);
        long t1=System.currentTimeMillis();
        for(int i=0;i<n;i++)arr[i]=i;
        long sum1=0;
        for(int v:arr)sum1+=v;
        long t2=System.currentTimeMillis();
        for(int i=0;i<n;i++)list.add(i);
        long sum2=0;
        for(int v:list)sum2+=v;
        long t3=System.currentTimeMillis();
        System.out.println("int[] time: "+(t2-t1)+"ms sum="+sum1);
        System.out.println("ArrayList<Integer> time: "+(t3-t2)+"ms sum="+sum2);
    }
}
