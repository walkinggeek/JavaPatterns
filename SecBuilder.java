
import java.util.Date;
/**
 *  Builder Pattern.
 *  This pattern is to find a solution to the telescoping constructor anti-pattern. 
 *  The telescoping constructor anti-pattern occurs when the increase of object constructor 
 *  parameter combination leads to an exponential list of constructors.
 *  http://en.wikipedia.org/wiki/Builder_pattern
 */
public class SecBuilder {
	Instrument inst = null;
	double iCoupon = 0;
	String iIssuer = "";
	Date iDatedDate = null;
	Date iMaturityDate = null;
	
	public Instrument getSec() {
		if (inst == null) // default is Bond
			inst = new Bond();
		
		if (inst instanceof Bond)
		if (inst instanceof ARM)
			inst.iCoupon = ((ARM) inst).getfloatCPN();
		else
			inst.iCoupon = this.iCoupon;
		return inst;
	}
	public void setType(String type) {
		if (type.equalsIgnoreCase("Corporate"))
			inst = new CorporateBond();
		else if (type.equalsIgnoreCase("MBS"))
			inst = new MBS();
		
	}
	public void setCoupon(double coupon) {
		this.iCoupon = coupon;
	}
	public void setIssuer(String issuer) {
		this.iIssuer = issuer;
	}
	public void setMaturity(Date maturity) {
		this.iMaturityDate = maturity;
	}
}
