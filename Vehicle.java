public class Vehicle{
	//declaring and initializing a final variable
	final int speedlimit=60;
	void controlSpeed() {
		//Trying to change the value of the final variable will give an error
		speedlimit=150;
	}
	public static void main(String args[]){
		Vehicle obj = new Vehicle();
		obj.controlSpeed()
		speedlimit=150;
	}
}