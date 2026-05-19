package DSA;
import java.util.*;
public class Smallestarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        if(n==0){
            System.out.println("array is empty");
        }
        else{ for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }

        }
        System.out.println("smallest element in the array is:"+smallest);
        }
        sc.close();
}}

