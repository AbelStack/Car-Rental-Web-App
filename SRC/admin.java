package class;


/**
 * @author kiot
 * @version 1.0
 */
public class admin extends user {

	public vehicle m_vehicle;
	public booking m_booking;

	public admin(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void manageUsers(){

	}

	public void manageVehicle(){

	}

	/**
	 * 
	 * @param paymentId
	 */
	public boolean verifyPayment(int paymentId){
		return false;
	}
}//end admin