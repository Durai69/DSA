package datastructures;

import java.util.Arrays;



public class Bubble {

	



	public static void findbubble(int [] sample) {

		System.out.println(Arrays.toString(sample));

	

		for(int i=1;i<sample.length;i++) {

			for( int j=0;j<sample.length-1;j++)

			{

				if(sample[j]>sample[j+1])

				{

					int temp =sample[j];

					sample[j]= sample[j+1];

					sample[j+1] =temp;

					

				}

			}

		}

		System.out.println(Arrays.toString(sample));

}

		public static void main(String[]args) {

			int[]arr = {5,4,3,2,1,0};

			findbubble(arr);

		}

}

	





