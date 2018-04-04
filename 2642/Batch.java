package com.htc.corejava.exercise;

public class Batch {
		
	
	int batchCode;
	String startdate;
	String enddate;
	Trainee[] trainees;
	boolean flag = false;
	
	public Batch(int batchCode, String startdate, String enddate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;
		this.trainees = trainees;
	}

	public Trainee getTrainee(int traineeId)throws TraineeNotFoundException{
		
		Trainee tr = new Trainee();
		for(int i=0 ;i<trainees.length;i++)
		{
			if(trainees[i].getTraineeId() == traineeId)
			   tr=trainees[i];
			flag = true;	
		}
		if(flag == false) {
			throw new TraineeNotFoundException("Trainee not Found - trainee ID: "+traineeId);
		}
	return tr;			
	}	
	public Trainee[] getTrainee(String gender)
	{
		Trainee[] tr = new Trainee[trainees.length];
		int j=0;
		for(int i=0 ;i<trainees.length;i++)
		{
			if(trainees[i].getGender().equals(gender))
			{
				tr[j]=trainees[i];
				j++;
			}
				   				
		}
	return tr;	
				
	}
	
	public static void main(String[] args)
	{
		Trainee[] trainees = new Trainee[3];
		
		trainees[0] = new Trainee(111,"ABC","9848123456","abc@gmail.com","M",45);
		trainees[1] = new Trainee(222,"AKC","9848785457","akc@gmail.com","F",35);
		trainees[2] = new Trainee(322,"BBC","9848123458","bbc@gmail.com","M",55);
		
//		Trainee tr;
		Batch b = new Batch(111,"03/01/2018","04/01/2018",trainees);
//		tr = b.getTrainee(30);
//		System.out.println("Details with Traineeid:" + tr);
		
		Trainee[] trg = b.getTrainee("M");
				
		for (int i=0;i<trg.length;i++)
		{
			if(trg[i]!=null)
			{
				System.out.println(trg[i]);
			}
			
		}
	}
	
}
