package DSA;
import java.util.*;

public class Averageofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        double average = (double)sum/n;
        System.out.println("average of elements in the array is:"+average);
        sc.close();
    }
}
