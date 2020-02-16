package userInterface;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import model.*;
import exceptions.*;

public class Main {
	
	private Company company;
	
	public Main(Company c) {
		company = c;
	}

	public static void main(String[] args) {
		Company company = new Company();
		Main main = new Main(new Company());
		
		boolean end = false;

		Scanner s = new Scanner(System.in);
		while(!end) {
			System.out.println("Menu\n1.Add a new user\n2.Search an user\n3.Assign a turn\n4Exit");
			int x = s.nextInt();
		switch(x) {
		
		case 1:
			
		main.addAnUser();
			
		break;
		case 2:
			System.out.println("Enter the user's id");
			String i = s.next();
			
			try{
			System.out.println(company.searchUser(i));
			}
			catch(UserNotFoundException u) {
				System.out.println(u.getMessage()+" Please fill the following information to add it to the database");
				main.addAnUser();
			}		
			break;
		case 3:
			System.out.println("Enter the id of the user");
			String a = s.next();
			System.out.println("Was the user in the line?(1 for yes, 2 for no)");
			int f = s.nextInt();
			boolean y = true;
			if(f == 2)
				y = false;
			try {
				company.advanceTurn(y, a);
			} catch (NoTurnsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UserNotFoundException e) {
				System.out.println(e.getMessage()+" Please enter the following information to add the user to the database");
				main.addAnUser();
			}
			break;
		case 4:
			System.out.println("Ne vedem curand");
			end = true;
			break;
		}
		}
	}
		
		
		public void addAnUser() {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the id");
			String id = s.next();
			System.out.println("Enter the type of his id:\n1 for CEDULA_DE_CIUDADANIA\n2 for TARJETA_DE_IDENTIDAD\n3 for REGISTRO_CIVIL\n4 for PASAPORTE\n5 for CEDULA DE EXTRANJERIA");
			int idt = s.nextInt();
			System.out.println("Enter the first name of the user");
			String na = s.next();
			System.out.println("Enter the last name of the user");
			String nl = s.next();
			System.out.println("Enter the phone number of the user");
			String p = s.next();
			System.out.println("Enter the direction of the user");
			String d = s.next();
			

			try{
				if(idt==0||id==null||na==null||nl==null) {
					throw new MissingFieldsException();
				}
				else {
					company.addUser(new User(id,idt,na,nl,p,d));
				}
			}
			catch(MissingFieldsException m) {
				System.out.println(m.getMessage());
			}
		}

}
