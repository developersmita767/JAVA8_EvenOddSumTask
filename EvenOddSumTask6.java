//Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.

package Java8_Task;

import java.util.List;

public class EvenOddSumTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);
		
		int sumOfEvenSquare = list.stream().filter((a)->a%2==0).mapToInt((a)->a*a).sum();//for even
		int sumOfOddSquare = 	list.stream().filter((a)->a%2!=0).mapToInt((a)->a*a).sum();//for even
		
		System.out.println("Sum of even square are: " + sumOfEvenSquare );
		System.out.println("Sum of odd square are: " + sumOfOddSquare );

	}

}
