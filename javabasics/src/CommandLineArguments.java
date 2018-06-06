
public class CommandLineArguments {

	public static void main(String[] args) {
		
		int sum=0;
	
		for(int i=0;i<args.length;i++) {
			int a=Integer.parseInt(args[i]);
			sum=sum+a;
			System.out.println(a);
		}
		System.out.println(sum);
		

	}

}
