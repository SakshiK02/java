public class FinalReferenceVariable {
	public static void main(String[] args) {
		// declaring a final reference variable builder
		final StringBuilder builder = new StringBuilder("Tech");
		System.out.println(builder);
		// changing internal state of object reference by final reference variable builder
		builder.append("Vidvan");
		System.out.println(builder);
	}
}