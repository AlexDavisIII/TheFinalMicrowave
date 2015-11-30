public class Button {
	private int value; 
	private boolean isPressed; 
	
	public Button(){
		value = 0; //sets default value
		isPressed = false; //button is currently not pressed
	}
	public int getValue(){
		return value;
	}
	
	public boolean getStatus(){
		return isPressed;
	}
	
	public void setValue(int newValue){
		value = newValue;
	}
	
	//toggles the button
	public void pressButton(){
		if(isPressed){
			isPressed = false;
		}else{
			isPressed = true;
		}
	}
}
