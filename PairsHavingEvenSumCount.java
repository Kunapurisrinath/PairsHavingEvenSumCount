/*size of array 5
array elmenets 2 4 6 8 10
upto how many elements at a time 2
output:
4 
paris having even sum
since (2,4)=1
(4,6)=1
(6,8)=1
(8,10)=1
therefore=1+1+1+1=4
*/
import java.util.*;
public class PairsHavingEvenSumCount
 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=0;
        int arr[]=new int[x];
        
        for(i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int evencount=0;
        int z=sc.nextInt();
        int m=0;
        int sum=0;
        int k=m+z;
        while(k<=x){
            for(i=m;i<k;i++){
                sum=sum+arr[i];
            }
            if(sum%2==0){
                
                evencount=evencount+1;
            }
            sum=0;
            m++;
            k++;
        }

        if(evencount>0){
            System.out.println(evencount);
        }
        else{
            System.out.println("-1");
        }
    }
}