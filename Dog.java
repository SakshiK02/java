public class Dog extends Animal {
	final void sound() {
		System.out.println();
		System.out.println("Additional Characteristics : ");
		System.out.println("Sound : Bhow Bhow");
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.characteristics();
		d.sound();
	}
}