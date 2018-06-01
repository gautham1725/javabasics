
public class ArrayMin {
	public static void main(String[] args)
	{
	
	int numbers[]= {3,4,5,2,33,24,2} ;
	int min=numbers[0];
	
	for(int i=0 ; i<numbers.length ;i++)
	{
		if(numbers[i]<min)
		
		 min=numbers[i];
	}
	
	System.out.print("minimum Number = "+min);

}
	
}