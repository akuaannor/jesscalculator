public class Calc;
{
	public static void main (String [] args){
		double num1, num2;
		if(args[0].equals("add")){
			num1 = Double.parseDouble(args[1]);
			num2 = Double.parseDouble(args[2]);

			System.out.println(num1 + num2);

		}
			
		if(args[0].equals("subtract")){
			num1 = Double.parseDouble(args[1]);
			num2 = Double.parseDouble(args[2]);

			System.out.println(num1 - num2);	

	
			else if(args[0].equals("Multiply")){
			num1 = Double.parseDouble(args[1]);
			num2 = Double.parseDouble(args[2]);

			System.out.println(num1 * num2);

	}

	if (args[0].equals(divide)){
		num1 = Double.parseDouble(args[1]);
		num2 = Double.parseDouble(args[2]);

		System.out.println(num1 / num2);

	}
}
}
