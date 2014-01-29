
import java.util.Date;
/**
 * Base class of all instruments
 * @author cweng
 *
 */
public abstract class Instrument {
	abstract void calc();
	double iCoupon=0;
	Date iMaturityDate = null;
}
