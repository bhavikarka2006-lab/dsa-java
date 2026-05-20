package DSA.ARRAY;
import java.util.*;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to be searched");
        int key = sc.nextInt();
        boolean found = false;
        int index = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                found = true;
                index = i;
                break;
            }
        }
        if(found){
            System.out.println("element found in the array at index " + index);
        }
        else{
            System.out.println("element not found in the array");
        }
        sc.close();
    }
    
}
