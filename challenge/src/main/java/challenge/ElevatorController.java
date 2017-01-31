package challenge;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
	
	List<Elevator> elevatorList;
	int noOfElevators = 4;
	int noOfFloors = 10;
	Elevator elevator1 = new Elevator();
	Elevator elevator2 = new Elevator();
	Elevator elevator3 = new Elevator();
	Elevator elevator4 = new Elevator();
	
	public ElevatorController() {
		elevatorList = new ArrayList<Elevator>();
		elevatorList.add(elevator1);
		elevatorList.add(elevator2);
		elevatorList.add(elevator3);
		elevatorList.add(elevator4);
	}
	
	public Elevator availableElevator(int floor, String direction){
		//should return the elevator object.
		for(Elevator elevator :elevatorList){
			if(elevator.getFloorPosition() == floor || elevator.getDirection().equals(direction)){// need to add condition for nearest lift
				elevator.setHalt(false);
				elevator.setDestinationFloor(floor);
				elevator.setNoOfTrips(elevator.getNoOfTrips()+1);
				return elevator;
			}
		}
		return null;
	}

}
