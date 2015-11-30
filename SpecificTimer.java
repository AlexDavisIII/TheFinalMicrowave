import java.util.Date;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class SpecificTimer{
	private Calendar cal = Calendar.getInstance();
	private Date currentDate;
	
	public SpecificTimer(){
		currentDate.getTime();
	}
	
	public Date getCurrentDate(){
		System.out.print(currentDate);
		return currentDate;
	}
	
	public void setCurrentDate(Date newDate){
		currentDate = newDate;
	}
	
	public void startTimer(){
		
		//as you gain one second
		cal.setTime(currentDate);
		int seconds = cal.get(Calendar.SECOND);
		System.out.println(seconds);
		//take one second off of the current time set for the time
		
	}
}