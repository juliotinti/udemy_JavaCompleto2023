package application;

import java.util.Scanner;

import entities.Sec10_rooms;

public class Sec10_ex5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int totalRooms = 10; 
		Sec10_rooms[] rooms = new Sec10_rooms[totalRooms];
		for(int i = 0; i<totalRooms; i++)
		{
			rooms[i] = new Sec10_rooms(i); 
		}
		
		System.out.print("How many rooms will be rented: ");
		int rentedRooms = sc.nextInt();
		
		for(int i = 0; i<rentedRooms; i++)
		{
			System.out.printf("Rent #%d\n", i+1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNb = sc.nextInt();
			rooms[roomNb].setEmail(email);
			rooms[roomNb].setTenantName(name);
		}		
		
		System.out.println("Busy rooms: ");
		for(Sec10_rooms occupiedRooms: rooms)
		{
			if(occupiedRooms.getTenantName() != null)
			{
				System.out.print(occupiedRooms);
			}
		}
		sc.close();
	}

}
