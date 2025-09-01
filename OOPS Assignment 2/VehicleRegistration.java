class Vehicle{
	static int vehicleCount; String regNo; String ownerName, vehicleType;
	
	Vehicle(String ownerName, String vehicleType){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		vehicleCount++;
		this.regNo="MH-2025-"+vehicleCount;
	}
	
	int getVehicleCount(){
		return vehicleCount;
	}
	String getOwnerName(){
		return ownerName;
	}
	String getVehicleType(){
		return vehicleType;
	}
	
	String getRegistration(){
		return regNo;
	}
}

public class VehicleRegistration{
	public static void main(String argz[]){
		Vehicle v1 = new Vehicle("Anand", "Four wheeler");
		Vehicle v2 = new Vehicle("Vivek", "Two wheeler");
		
		System.out.println("Owner: "+v1.getOwnerName()+", Registration: "+v1.getRegistration()+", Vehicle Type: "+v1.getVehicleType());
		System.out.println("Owner: "+v2.getOwnerName()+", Registration: "+v2.getRegistration()+", Vehicle Type: "+v2.getVehicleType());
	}
}
