import java.util.Date;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Test{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//as the seconds pass, subtract a second from the current time
		Date date = new Date(); //holds today's date
		Calendar now = Calendar.getInstance(); //sets new instance of Calendar
		now.setTime(date); //sets calendar to current time and date
		
		int currentHour = now.get(Calendar.HOUR);
		int currentMinute = now.get(Calendar.MINUTE);
		int currentSecond = now.get(Calendar.SECOND);
		
		System.out.printf("It's currently %d:%d:%d %n",currentHour, currentMinute, currentSecond);
		
		/*New class for Timer Task*/
		class SayHola extends TimerTask{
			
			int setSecond = currentSecond;
			
			@Override
			public void run(){
				if(setSecond != 0){
					System.out.println("Number: " + setSecond--);	
				}else{
					System.out.println("DONION RINGS!");
					System.exit(1);
				}				
			}
		} //end of TimerTask class
				
		Timer taskTime = new Timer();
		taskTime.schedule(new SayHola(), 1, 1000);
	}
}
