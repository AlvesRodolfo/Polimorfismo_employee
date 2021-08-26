package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number of employees: ");
		int number = sc.nextInt();
		List<Employee> list = new ArrayList<>();
		
		for(int i = 1;i<=number;i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.printf("Outsorced (y/n)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			
						
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.printf("Hours: ");
				int hours = sc.nextInt();
				System.out.printf("Valeu per Hour: ");
				double valuePerHour = sc.nextDouble();
				
				if(resp == 'n') {
					
				Employee employee = new Employee(name, hours, valuePerHour);
				list.add(employee);
	
			}
			else {
				System.out.printf("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				OutsourcedEmployee outsourced = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(outsourced);
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee e: list) {
			System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
		}
		
		sc.close();

	}

}
