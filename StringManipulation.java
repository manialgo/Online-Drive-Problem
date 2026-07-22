//NOKIA DRIVE

import java.util.Scanner;
public class StringManipulation {
	public static StringBuilder work(String str) {
		char arr[] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<arr.length; i++) {
			sb.append((char) (97+(((arr[i] - 97)+1) % 26)));
		}
		return sb;
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String str = "a";
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) arr[i]  = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		for(int j=0; j<size; j++) {
			if(arr[j] == 0) sb.append(sb);
			else sb.append(work(sb.toString()));
		}
		System.out.println(sb.toString());
		sc.close();
	}
}

/*
 From the system they gave us a String str = "a";
 
 Now the user input(s):
 first line: number of operation(s) that's the size of the array that we are processing
 second line: The Operations only the representations
 
 Here: Eg:
 
 Operation:
 Type 0: (Duplicate append) 
 "a" -- > "aa" -- > "aaaa"
 Type 1: (Next alphabet append: a->b, b->c, ... z->a)
 "a" -- > "ab" -- > "abbc"
Test Case:
4
0 1 0 1

0-th index work:
Type: 0 ===> "a" --> "aa"

1-st index work:
Type: 1 ===> "aa" --> "aabb"

2-nd index work:
Type: 0 ===> "aabb" --> "aabbaabb"

3-rd index work: 
Type: 1 ===> "aabbaabb" --> "aabbaabbbbccbbcc"

 */
