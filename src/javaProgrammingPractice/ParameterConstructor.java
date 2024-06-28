package javaProgrammingPractice;
class A1
{   int x,y;
       A1(int a,int b)
      {
	     x=a;  y=b;
      }
      A1(int a,String b)
      {
	     System.out.println(a+" "+b); 
      }
       void show()
       {
	    System.out.println(x+" "+y);
       }
       }
       public class ParameterConstructor {

	    public static void main(String[] args) {
		A1 r = new A1(100,200);
		r.show();
		A1 ref = new A1(100,"sam");
	     }    //o/p:-100 200 2)100 sam

}










