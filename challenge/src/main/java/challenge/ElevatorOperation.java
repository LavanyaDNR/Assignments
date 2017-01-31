package challenge;

public class ElevatorOperation {

	int noOfFloors = 10;
	
	ElevatorController elevatorController = new ElevatorController();
	
	void elevatorOperation(int currentFloor, String direction){
		if(currentFloor == 1 && direction.equals("down")){
			return;
		}else if(currentFloor == 10 && direction.equals("up")){
			return;
		}
		else{
			Elevator elevator = elevatorController.availableElevator(currentFloor, direction);
			//add wait till elevator reaches the destination
			elevator.setFloorPosition(currentFloor);
			elevator.setClosed(false);
		}
	}
	
	


}
