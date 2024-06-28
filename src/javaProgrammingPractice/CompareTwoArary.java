package javaProgrammingPractice;

import java.util.Arrays;

public class CompareTwoArary {

	public static void main(String[] args) {
	int a[]= {1,3,6,7,8};
	int b[]= {1,3,6,7,8,7};
	if(Arrays.equals(a,b))
	{
		System.out.println("Both r equals");
	}
	else
	{
		System.out.println("Both are not equals");
	}

	}

}
