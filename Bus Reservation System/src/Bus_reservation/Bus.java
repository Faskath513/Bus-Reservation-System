package Bus_reservation;

public class Bus {
	private int Busno;
	private boolean Ac;
	private int Capacity;//get and set
	public Bus(int Busno,boolean Ac,int Capacity){
		this.Busno=Busno;
		this.Ac=Ac;
		this.Capacity=Capacity; 
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int cap) {
		Capacity=cap;
	}
	public int getBusno() {
		return Busno;
	}
	public void setBusno(int no) {
		Busno=no;
	}
	public boolean isAc() {
		return Ac;
	}
	public void setAc(boolean val) {
		Ac=val;
	}
	public void display() {
		System.out.println("Bus no: "+ Busno +" Ac: " +Ac+" Total capacity: "+Capacity);
	}

}
