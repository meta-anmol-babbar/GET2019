package question3;

public class Area {

	private double area;
	final double pi = 3.14;

	double triangleArea(double base, double height) {
		try {
			area = (base * height) / 2;
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return Math.round(area * 100.0) / 100.0 ;
	}

	double rectangleArea(double length, double width) {
		try {
			area = (length * width);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
				
		return Math.round(area * 100.0) / 100.0 ;
	}

	double squareArea(double side) {
		try {
			area = Math.pow(side, 2);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return Math.round(area * 100.0) / 100.0 ;
	}

	double circleArea(double radius) {
		try {
			area = pi * Math.pow(radius, 2);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return Math.round(area * 100.0) / 100.0 ;
	}
	void print(String initials,double value){
		System.out.println(initials+" "+value);
	}

}
