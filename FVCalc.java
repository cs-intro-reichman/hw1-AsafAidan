// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double interestRate = Double.parseDouble(args[1])/100;
		int n = Integer.parseInt(args[2]);
		Double futureValue = (currentValue*Math.pow(1 + interestRate, n));

		System.out.println("After 2 years, $" + currentValue + " saved at " + interestRate + "% will yield $" + (int) futureValue);
         // % java FVCalc 100 10 2
         //After 2 years, $100 saved at 10.0% will yield $121

	}
}