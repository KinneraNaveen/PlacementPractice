package array;

public class DeleteSpecicInd {
    public static void main(String []args){
        int arr[]=new int[6];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        int n=4;
        int ind=3;
        for(int i=ind;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }    
}
