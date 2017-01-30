package challenge;

public class ElevatorOperation {
	
	int noOfElevators = 4;
	int noOfFloors = 10;
	
	void outsideOperation(int currentFloor, String operation){
		if(currentFloor == 1 && operation.equals("down")){
			return;
		}else if(currentFloor == 10 && operation.equals("up")){
			return;
		}
		else{
			findAvailableElevator(currentFloor, operation);
		}
	}
	void findAvailableElevator(int currentFloor, String operation){
		
	}



}
