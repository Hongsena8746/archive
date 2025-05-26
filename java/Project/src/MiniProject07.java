
public class MiniProject07 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(10, 5);
		calc.min(10, 5);
		calc.mul(10, 5);
		calc.div(10, 5);
		
		
		double PI = 3.141592;
		double radius = .0;
		double circle;
	}

}

class Calculator {

	public void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	public void min(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}

	public void mul(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}

	public void div(int num1, int num2) {
		if (num2 != 0) {
			double result = (double) num1 / num2;
			System.out.println(result);
		} else {
			System.out.println("0으로 나눌수 없다");
		}
	}

	public double circle(double radius) {
		return 2 * Math.PI * radius;
	}

}
