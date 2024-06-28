package javaProgrammingPractice;

public class MinMaxElementfromArray {

	public static void main(String[] args) {
		int a[] = {4,7,9,56,47,23,6,2,1};
		int max =a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]>max)
//			{
//				max= a[i];
//			}
//		}
//   System.out.println("The maximum number is :"+ max);
	//}
		int min =a[0];
		for(int i=1;i<a.length;i++)
		{
			//if(a[i]<min)
			if(min>a[i])	
			{
				min= a[i];
			}
		}
   System.out.println("The manimum number is :"+ min);

}
}
