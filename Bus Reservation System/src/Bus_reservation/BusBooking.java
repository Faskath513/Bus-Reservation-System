package Bus_reservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class BusBooking {
	String PassangerName;
	int Busno;
	Date Date;
	public BusBooking() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the passanger name: ");
		PassangerName=scanner.next();
		System.out.println("Enter the bus num: ");
		Busno=scanner.nextInt();
		System.out.println("Enter the date dd-MM-yyyy: ");
		String DateInput =scanner.next();
		SimpleDateFormat DateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date=DateFormat.parse(DateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public  boolean isAvailable(ArrayList<BusBooking>booking,ArrayList<Bus>buses) {
		int Capacity=0;
		for(Bus bus:buses) {
		if(bus.getBusno()==Busno) {
			Capacity=bus.getCapacity();
			break;
		}
		}
		int booked=0;
		for(BusBooking b:booking) {
			if(b.Busno==Busno && b.Date.equals(Date)) {
				booked++;
				}
		}
		return booked<Capacity?true:false;
		
	}

}
