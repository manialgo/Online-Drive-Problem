import java.util.Scanner;
public class PartySeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[M];
		for(int i=0; i<N; i++) A[i] = sc.nextInt();
		for(int i=0; i<M; i++) B[i] = sc.nextInt();
		
		//Array is sorted
		int totalPerson = 0;
		for(int num:B) totalPerson += num;
		int j = N-1;
		int cost=0;
		while(totalPerson >0) {
			cost += A[j];
			j--;
			totalPerson--;
		}
		System.out.println(cost);
		sc.close();
	}
}

/*
N - No.of seats
M - Groups
A - Cost of the i-th seat 
B -	No. of persons

so how the party owner earn maximum profit by selling the seats.
Also the gave that the array is in sorted order. We are looking to maximum profit
so, if we are purchasing the last seat means have high profit
so according to number of persons we need to buy the seats from the last seat

for that by using theB array we are calculating the number of persons
in a while loop we are traversing from N-1 seat to 0 in that occasion the idea is
to calculate only for the number of peoples by decrementing the number also we terminate the while loop
simultaneously we are calculating the sum of cost

And finally we are return the total cost

TestCase:
N=5
M=3
A=[1,6,7,9,15]
B=[1,1,1]

So total seat: 3 {B array sum}
only they are going to buy 3 counts from the last index of A; => 7+9+15=31
IT WORKS ONLY BECAUSE OF THE ARRAY IS IN SORTED ORDER

*/
