package LoopingStatements;

public class ArgsNull {
	public static void main(String[] args) {
		
		
		int a = args.length;
		if(a == 0) {
			System.out.println("No values");
		}
		else  {
			System.out.println(args[0]+","+args[1]);
		}
	}

}
