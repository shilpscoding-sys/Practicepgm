package javaProgrammingPractice;
class methodsame
{
	public static void main(String[] args) {
		B obj = new B();
		  obj.display();
	}

}	
		class sam
		{  
			
			void display()
			{
				System.out.println("the method is same");
			}
		}
		class B extends sam
		{
			@Override
		
			void display()
			 { 
				super.display();  
				System.out.println("the method is same 11234");
			}
		
		
		}	
	
	

		
