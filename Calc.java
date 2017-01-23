public class Calc;
{
	public static void main (String [] args){
		if(args[0].equals("add")){
			num1 = Double.parseDouble(args[1]);
			num2 = Double.parseDouble(args[2]);

			System.out.println(num1 + num2);

		}
		else if(args[0].equals("Subtract")){
			num1 = Double.parseDouble(args[1]);
			num2 = Double.parseDouble(args[2]);

			System.out.println(num1 - num2);
		}
			
			else if(args[0].equals("Multiply")){
			num1 = Double.parseDouble(args[1]);
			num2 = Double.parseDouble(args[2]);

			System.out.println(num1 * num2);
	}
}
}
