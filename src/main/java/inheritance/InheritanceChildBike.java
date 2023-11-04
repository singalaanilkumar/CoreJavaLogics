package inheritance;

public class InheritanceChildBike extends InheritanceParentBike {
 public void bikecolor()
 {
	 System.out.println("color");
 }
	public static void main(String[] args) {
		InheritanceChildBike inb = new InheritanceChildBike();
		inb.bikecolor();
		inb.audio();
		inb.company();
		inb.seat();

		InheritanceParentBike ipb = new InheritanceParentBike();
		ipb.audio();



	}

}
