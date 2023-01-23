import it.develhope.encapsuation1.House;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner floor = new Scanner(System.in);
		Scanner address = new Scanner(System.in);
		Scanner residents = new Scanner(System.in);
		House house = new House();

		System.out.println("Number of floors: ");
		house.setFloorsNumber(floor.nextInt());

		System.out.println("House address: ");
		house.setAddress(address.nextLine());

		System.out.println("Insert residents: ");
		house.setResidentsName(residents.nextLine());

		String houseDetails = String.format("The house has %s floors \n", house.getFloorsNumber());
		houseDetails += String.format("The address of the house is %s \n", house.getAddress());
		houseDetails +="And these are the people that live in it:\n";
		for (String resident: house.getResidentsName()) {
			houseDetails+=String.format("-%s\n", resident);
		}
		System.out.println(houseDetails);
	}
}