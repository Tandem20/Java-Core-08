package Tandem20;

public enum Months {
	 January(Sezon.Winter, 31),
	  February(Sezon.Winter, 28),
	  March(Sezon.Spring, 31),
	  April(Sezon.Spring, 30),
	  May(Sezon.Spring, 31),
	  June(Sezon.Summer, 30),
	  July(Sezon.Summer, 31),
	  August(Sezon.Summer, 31),
	  September(Sezon.Autumn, 30),
	  October(Sezon.Autumn, 31),
	  November(Sezon.Autumn, 30),
	  Desember(Sezon.Winter, 31);
	
	Sezon sezon;
	int indays;
	
	Months(Sezon sezon,int i){
		this.sezon = sezon;
		this.indays = i;
	}
	
	public Sezon getSezon() {
		return sezon;
	}
	public int getIndays() {
		return indays;
	}
	
}
