package class;


/**
 * @author kiot
 * @version 1.0
 */
public class booking {

	public string bookingId;
	private date endDate;
	private string pickupLocation;
	public date startDate;
	private string status;
	public driver m_driver;
	public payment m_payment;

	public booking(){

	}

	public void finalize() throws Throwable {

	}
	public double calculateCost(){
		return 0;
	}

	public boolean cancel(){
		return false;
	}
}//end booking