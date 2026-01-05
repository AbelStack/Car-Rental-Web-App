package class;


/**
 * @author kiot
 * @version 1.0
 */
public class rentalCar extends vehicle {

	public double pricePerDay;
	public booking m_booking;

	public rentalCar(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean isAvaliable(){
		return false;
	}
}//end rentalCar