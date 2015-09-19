package javaTests;

public class arrayPractice {

	public static void main(String[] args) {

		//Intialize an Array with Integers data
		int a[]={2,4,8,7,3,5};
		int i=0;
		//For loop to iterate through all the array list to find i index
		for(i=0; i<a.length; i++)
		{
			
			if(a[i]==7)
			{
				//x++;
				System.out.println(i);

				break;
			}
//			else
//			{
//				break;
//			}
			
		}
		
		//System.out.println(i);
		
		System.out.println("index was displayed successfully");
		//End of the example
	}

}
