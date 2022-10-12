package logic;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Car> Cars= new ArrayList<>();
		Cars.add(new Car(5,7,12,"Bemveu",true));
		Cars.add(new Car(input.nextInt(),input.nextInt(),input.nextInt(),input.next(),input.nextBoolean()));
		System.out.println(Cars.get(0).GetIsDiesel());
		System.out.println(Cars.get(1).GetIsDiesel());
		}
}
