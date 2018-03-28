package com.htc.pack;

import java.util.Scanner;

import com.htc.pack.Trainee;

public class Batch 
{
	int batchCode;
	String startdate;
	String enddate;
	Trainee Trainee[];
	
	public Trainee getTrainee(int traineeId) throws TraineeNotFound {
				
		System.out.println("traineeId:"+traineeId);
		return null;
	}

       
	public Trainee[] getTrainee(String gender) {
		System.out.println(Trainee);
		return Trainee;
		
	}
}
	
class Batch1
{
	
	private static Scanner sc;

	public static void main(String[] args) {
		Batch obj=new Batch();
		
		sc = new Scanner(System.in);
		
		
		System.out.println("BatchCode   :");
		obj.batchCode=sc.nextInt();
		System.out.println("Start Date  :");
		obj.startdate=sc.next();
		System.out.println("End Date    :");
		obj.enddate=sc.next();
		System.out.println("Num of Trainees:");
		int count=sc.nextInt();
		
		obj.Trainee=new Trainee[count];
		
		int i;
		for(i=0;i<count;i++) {
			Trainee T1=new Trainee();
		
			System.out.println("Trainee Id  :");
			T1.traineeId=sc.nextInt();
			System.out.println("Trainee Name :");
			T1.traineeName=sc.next();
			System.out.println("email id     :");
			T1.email=sc.next();
			System.out.println("gender       :");
			T1.gender=sc.next();			
			System.out.println("contactNo    :");
			T1.contactNo=sc.next();
			System.out.println("age          :");
			T1.age=sc.nextInt();
			
		}
		
		//Look for Trainee
		//String checkId = null;
		System.out.println("Enter trainee Id to check availability:");
		String checkId=sc.next();  
		//calling override method
		obj.getTrainee(checkId);
		

		System.out.println("Enter gender type to pull all qualified employees:");
		String checkgender = sc.next();		
		//obj.getTrainee(checkgender);
		
		System.out.println("Employee details:"+obj.getTrainee(checkgender));
		
		
	}


	
}
