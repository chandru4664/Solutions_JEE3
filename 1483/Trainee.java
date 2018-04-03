/**
 * Create an Entity class Trainee
 */
package htc.HomeWork1;

/**
 * @author 1483
 *
 */
public class Trainee 
	{
	    private int traineeId = 0; 
	    private String traineeName = "";
	    private int contactNo = 0;
	    private String email = "";
	    private boolean gender = true;
	    private int age = 0;
	    
	    public Trainee(int traineeId, String traineeName, int contactNo, String email,
	                boolean gender, int age)
	    {
	        this.traineeId = traineeId;
	        this.traineeName = traineeName;
	        this.contactNo = contactNo;
	        this.email = email;
	        this.gender = gender;
	        this.age = age;
	    }

	    public final int gettraineeId()
	    {
	        return traineeId;
	    }

	    public final String gettraineeName()
	    {
	        return traineeName;
	    }

	    public final int getcontactNo()
	    {
	        return contactNo;
	    }

	    public final String getemail()
	    {
	        return email;
	    }

	    public final boolean getgender()
	    {
	        return gender;
	    }
	    
	    public final int getage()
	    {
	        return age;
	    }
	    
	    @Override
	    public String toString()
	    {
	        return "Trainee: traineeId=" + traineeId +
	               " traineeName=" + traineeName +
	               " contactNo=" + contactNo +
	               " email=" + email +
	               " gender=" + gender + 
	               " age=" + age + '.';
	    }
	} 
