package javaProgrammingPractice;

//Constructor Overloading,default constructor &Parameter constructor

	public class Constructor {

		String model,color,brand;
		int year;
		
		Constructor()     
		{
			this("audi",2020);
			System.out.println("It is Default Constructor");
		}
		
		Constructor(String model,int year)    //parameter constructor
		{   //this();
			System.out.println("It is Parameter Constructor");
              
		}
		public static void main(String[] args) {
			Constructor c1 = new Constructor();
			Constructor c2 = new Constructor("audi",1920);
			//System.out.println(c1.car);//there is no need to call car constructor
			//cause all constructor values are same

		}

	}

