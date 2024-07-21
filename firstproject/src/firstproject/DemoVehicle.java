package firstproject;

public class DemoVehicle {

	public static void main(String[] args) {
	Vehicle vh ;
	
	vh = new Vehicle();
	
	vh.setColour("black");
	vh.setCompany("maruti");
	vh.setFueltype("petrol");
	
	System.out.println("colour : " + vh.getColour() + " company : " + vh.getCompany() + " Fuel_type : " + vh.getFueltype());
	}

}
