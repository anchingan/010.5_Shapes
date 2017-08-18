/*
 * Practice 010.5_Shpae 
 *          Use abstract class and method
 * Date 20170818         
 */

import java.util.Scanner;

public class TestShape {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Shape[] objArray;
	private static int count = 0, input;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		objArray = new Shape[5];
		
		while (true) {
			System.out.print("Menu: 1)add, 2)output, -1)Quit: ");
			input = scanner.nextInt();
			if (input == -1)
				break;
			else if (input == 1)
				add();
			else if (input == 2) {
				for (int i = 0; i < count; i++)
					printInfo(i);
			}
			else
				System.out.println("Input error!");
		}
		
		System.out.println("Program terminate.");
		
	}
	
	private static void add() {
		System.out.print("Options: 1)rectangle, 2)circle, 3)trapezoid, -1)Quit: ");
		input = scanner.nextInt();
		if (input == -1)
			;
		else if (input < 1 || input > 3) 
			System.out.println("Input error!");
		else {
			if (count >= objArray.length) {
				Shape[] temp = new Shape[count * 2];
				System.arraycopy(objArray, 0, temp, 0, count);
				objArray = null;
				objArray = temp;
			}
			if (input == 1) {
				System.out.print("Rectangle (width/height): ");
				double w = scanner.nextDouble(), h = scanner.nextDouble();
				objArray[count] = new Rectangle(w, h);
				printInfo(count++);
			}
			else if (input == 2) {
				System.out.print("Circle (radius): ");
				double r = scanner.nextDouble();
				objArray[count] = new Circle(r);
				printInfo(count++);
			}
			else if (input == 3) {
				System.out.print("Trapezoid (upper base/ lower base/ height): ");
				double u = scanner.nextDouble(), l = scanner.nextDouble(), h = scanner.nextDouble();
				objArray[count] = new Trapezoid(u, l, h);
				printInfo(count++);
			}
		}
	}
	
	private static void printInfo(int index) {
		System.out.printf("%9S\tarea:%.2f\tperimeter:%.2f\n",
				objArray[index].getClass().getName(), objArray[index].area(), objArray[index].perimeter());
	}
	

}
