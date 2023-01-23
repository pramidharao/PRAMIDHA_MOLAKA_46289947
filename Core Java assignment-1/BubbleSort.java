package assignments;

import java.util.*;

public class BubbleSort {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		int temp = 0;
		for (int i = 0; i< a.length; i++) {
			a[i] = sc.nextInt();
		}
		//bubbleSort.
		for(int i = 0; i <a.length;i++) {
			for (int j =0; j< a.length -i - 1; j++) {
				if(a[j] > a[j+1]) {
					temp =a[j];
					a[j] = a[j+1];
					a[j+1]  =temp;
				}
			}
		
		}
		for(int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	sc.close();		
	}

}
