
public class Bond extends Instrument {

	@Override
	void calc() {
		System.out.println("Calculating Bond");
	}

}

class CorporateBond extends Bond {
	
}