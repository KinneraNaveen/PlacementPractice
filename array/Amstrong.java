package array;

public class Amstrong {
    public static void main(String[]args){
        int num=153;
        int original=num;
        int r=0;
        while(num>0){
            int d=num%10;
            r+=d*d*d;
            num=num/10;
        }
        if(r==original ){
            System.out.println("Armstrong");

        }
        else{
            System.out.println("Not");
        }
    }
    
}
