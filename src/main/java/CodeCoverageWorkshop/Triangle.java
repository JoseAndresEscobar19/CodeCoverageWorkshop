package CodeCoverageWorkshop;

import java.util.Scanner;

/**
 * @author José Escobar
 *
 */
public class Triangle {
	int side_a;
	int side_b;
	int side_c;

	public Triangle(int a, int b, int c) {
		this.side_a = a;
		this.side_b = b;
		this.side_c = c;
	}

	private boolean isTriangle() {
		if ((side_a < (side_b + side_c)) && (side_b < side_a + side_c) && (side_c < side_a + side_b)) {
			return true;
		} else {
			return false;
		}
	}

	public String getTypeTriangle() {
		String type;
		if (isTriangle()) {
			if ((side_a == side_b) && (side_b == side_c)) {
				type = "Equilateral";
			} else if ((side_a != side_b) && (side_a != side_c) && (side_b != side_c)) {
				type = "Scalene";
			} else {
				type = "Isosceles";
			}
		} else {
			type = "Not a Triangle";
		}
		return type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		boolean c1, c2, c3;

		Scanner reader = new Scanner(System.in);

//		Step 1: Get Input
		do {
			System.out.println("Enter 3 integers which are sides of a triangle");
			System.out.print("a: ");
			a = reader.nextInt();
			System.out.print("b: ");
			b = reader.nextInt();
			System.out.print("c: ");
			c = reader.nextInt();

			c1 = (1 <= a) && (a <= 200);
			c2 = (1 <= b) && (b <= 200);
			c3 = (1 <= c) && (c <= 200);

			if (!c1) {
				System.out.println("Value of a is not in the range of permitted values");
			}
			if (!c2) {
				System.out.println("Value of b is not in the range of permitted values");
			}
			if (!c3) {
				System.out.println("Value of c is not in the range of permitted values");
			}
		} while (!(c1 && c2 && c3));

		reader.close();

		Triangle triangle = new Triangle(a, b, c);

		System.out.println(triangle.getTypeTriangle());
	}

}