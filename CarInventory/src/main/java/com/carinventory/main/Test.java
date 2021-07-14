package com.carinventory.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.carinventory.dao.CarDao;
import com.carinventory.model.Car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Mullet Joe's Gently Used Autos!");
System.out.println("Please enter the command add, list or quit: ");
Scanner sc = new Scanner(System.in);
System.out.println("Enter command: ");
String command = sc.nextLine();

ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
CarDao dao = context.getBean("cdao", CarDao.class);
while(!command.equals("Quit||quit"))
{
	switch(command) 
	{
	case "Add": System.out.print("Enter Make: ");
                String cmake = sc.nextLine();
                System.out.println("Make: "+cmake);

                System.out.print("Enter Model: ");
                String cmodel = sc.nextLine();
                System.out.println("Model: "+cmodel);

                System.out.print("Enter Year: ");
                int cyear = sc.nextInt();
                System.out.println("Year: "+cyear);

                System.out.print("Enter SalesPrice: ");
                float cprice = sc.nextFloat();
                System.out.println("salesPrice ($): "+cprice);
                Car car = new Car();
                car.setMake(cmake);
                car.setModel(cmodel);
                car.setYear(cyear);
                car.setSalesPrice(cprice);
                dao.saveCarDetails(car);
                return;
	case "List": List<Car> list = dao.getAllCarDetails();
                 list.forEach(carDetails->System.out.println(carDetails));
                 return;
    default: 	
             command = sc.nextLine();
    	System.out.println("Invalid command");
             	
}
	
	System.out.println("Good bye!");	
}
sc.close();
	}
	
}
