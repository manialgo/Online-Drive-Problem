package programs;
import java.util.Scanner;
public class MaximumSumInAArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) arr[i]=sc.nextInt();
		int currSubArray = arr[0], max = arr[0];
		//using Kadene's algorithm
		for(int i=1; i<size; i++) {
			currSubArray = Math.max(arr[i], currSubArray+arr[i]);
			max = Math.max(max, currSubArray);
		}
		System.out.println("Maximum: "+ max);
		sc.close();
	}
}