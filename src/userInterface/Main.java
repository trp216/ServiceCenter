package userInterface;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import model.Company;
import exceptions.*;

public class Main {

	public static void main(String[] args) {
		
		Company company = new Company();
		boolean end = false;

		Scanner s = new Scanner(System.in);
		while(!end) {
			System.out.println("Menu\n1.Add a new user\n2.Search an user\n3.Assign a turn\n4.Save data on disk\n5.Load data from disk\n6.Show rooms\n7.Exit");
			int x = s.nextInt();
		switch(x) {
		
		case 1:
//			System.out.println("Enter the code");
//			String c = s.next();
//			System.out.println("Enter the building");
//			char b = s.next().charAt(0);
//			System.out.println("Enter the capacity");
//			int ca = s.nextInt();
//			System.out.println("Enter the area");
//			double a = s.nextDouble();
//		
//			booking.addRoom(c, b, ca, a);
			
		break;
		case 2:
			try {
//				booking.loadFromFile("data/rooms2.txt");
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
			break;
		case 3:
//			try {
//				booking.generateReportSmallRooms("data/rooms2.txt");
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			break;
		case 4:
			try {
//				booking.saveRooms();
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			break;
		case 5:
//			try {
//				booking.loadRooms();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			break;
		case 6:
		//	System.out.println(booking.showRooms());
			break;
		case 7:
//			System.out.println("Laster arte");
//			end = true;
			break;
		}
		}
	}

}
