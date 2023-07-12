package countofarrayelements;

import java.util.Scanner;

public class CountOfArrayElements {

	public static int count(int array[],int size,int maximum)
	{
		int counter = 0;
		for(int i=0;i<size;i++) {
			if(array[i]>maximum) {
				maximum = array[i];
			}
		}
		for(int i=0;i<size;i++) {
			if(array[i]==maximum) {
				counter++;
			}
		}
		return size - counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int results = count(array,n,max);
		System.out.println(results);

	}

}
