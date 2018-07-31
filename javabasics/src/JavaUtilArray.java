import java.util.Arrays;

public class JavaUtilArray {
	public static void main(String[] args) {
		
		int one[] = {2,344,567,4,90,6};
		int two[] = Arrays.copyOf(one, one.length);
		
		for (int i = 0; i < two.length; i++) {
			System.out.println(two[i]);
		}
		System.out.println("---------");
		Arrays.sort(two);
		
		for (int i = 0; i < two.length; i++) {
			System.out.println(two[i]);
		}
		
	}
	
}
