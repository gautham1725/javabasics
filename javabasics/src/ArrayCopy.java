
public class ArrayCopy {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= new int[6];
		
		System.arraycopy(a, 0, b, 1, 5);
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
