package it.develhope.encapsuation1;

public class House {
	private int floorsNumber;
	private String address;
	private String[] residentsName;

	public void setFloorsNumber(int floorsNumber){
		this.floorsNumber=floorsNumber;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setResidentsName(String residentsName){
		this.residentsName=residentsName.split(",");
	}
	public int getFloorsNumber(){
		return floorsNumber;
	}
	public String getAddress(){
		return address;
	}
	public String[] getResidentsName(){
		return residentsName;
	}
	public House(){}

}
