package javaProgrammingPractice;


	class A
  {
	private int value1; //data hiding
    public void set1(int x)//data Abstraction
	{
	value1 = x;	
	}
    public int get1()
    {
    	return ++value1;
    }

}
	public class Encapsulation {
	public static void main(String[] args) {
		A r = new A();
		r.set1(100);
		System.out.println(r.get1());

	}
   }

	