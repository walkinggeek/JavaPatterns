
public class MBS extends Instrument {

	@Override
	void calc() {
		System.out.println("Calculating Bond");
	}

}

class ARM extends MBS {
	public double getfloatCPN() {
		// lookup the schedules
		return 3.0;
	}
}