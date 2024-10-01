package Bus_reservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<BusBooking> booking=new ArrayList<BusBooking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(5,false,50));
		buses.add(new Bus(3,true,40));
		int userOpn=1;
		Scanner scanner=new Scanner(System.in);
		for(Bus b:buses) {
			b.display();
		}
		while(userOpn==1) {
			System.out.println("enter 1is bookin 2 is exit");
			userOpn=scanner.nextInt();
			if(userOpn==1) {
				BusBooking busbooking=new BusBooking();
				if(busbooking.isAvailable(booking,buses)) {
					booking.add(busbooking);
					System.out.println("Your bookin is Confirmed.");
				}
				else
					System.out.println("Sorry,bus is full,try another bus or date.");
			}
		}

	}

}
