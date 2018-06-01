
public class ArrayExample {
	
	public static void main(String[] args) {
		
		int numbers[] = {3,4,5,2,33,24,2};
		int max=numbers[0];
		
		for (int i = 0; i < numbers.length; i++) 
		{
			
			      if (numbers[i] > max)
		            max = numbers[i];
}
		System.out.println("Maximum Number"+max);
	}
}
