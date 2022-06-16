public class Question12 {

	public double area(double a, double b, double c) {
		double semi=(a+b+c)/2.0;
		return Math.sqrt(area*(area-a)*(area-b)*(area-c));
	}

	public double area(int a, int b ,int height) {
		return (a+b)*height/2;
	}
	public double area(double diagonal1, double diagonal2) {
		return (diagonal1*diagonal2)/2;
	}
}