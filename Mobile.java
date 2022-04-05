/**
 * 
 */
/**
 * @author Shivani
 *
 */
package week1day1;
public class Mobile {
	String mobileModel = "Apple";
	float mobileWeight = 12.567F;
	boolean isFullyCharged = true;
	int mobileCost = 600000;
	String a= "Send Message";
	public void sendmsg()
	{
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
}
	public void makeCall() {
		System.out.println(isFullyCharged);
		System.out.println(mobileCost);
	}
	
	public static void main(String[] args) {
	Mobile myMobile = new Mobile();
	myMobile.sendmsg();
	myMobile.makeCall();
	
		
	}
}
	
	