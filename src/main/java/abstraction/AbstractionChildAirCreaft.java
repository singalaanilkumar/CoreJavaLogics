package abstraction;

public class AbstractionChildAirCreaft extends AbstractionParentAirCreaft  {

	public static void main(String[] args) {
		AbstractionChildAirCreaft aca = new AbstractionChildAirCreaft();
		aca.Aircolor();
		aca.Airengine();
		aca.Airguidelines();

		AbstractionParentAirCreaft apa = new AbstractionChildAirCreaft();
		apa.Aircolor();
		

	}


	@Override
	public void Aircolor() {
		System.out.println("red color on the body");
	}

}
