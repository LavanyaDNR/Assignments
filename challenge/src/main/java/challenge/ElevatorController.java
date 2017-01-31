package challenge;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {

	List<Elevator> elevatorList;
	int noOfElevators = 4;
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

	public Elevator availableElevator(int floor, String direction) {
		// should return the elevator object.
		for (Elevator elevator : elevatorList) {
			if (elevator.isAvailable()) {// if under maintainance skip

				if (elevator.getFloorPosition() == floor
						|| (elevator.getDirection().equals(direction))) {
					// need to add
					// condition for
					// nearest lift
					elevator.setHalt(false);
					elevator.setDestinationFloor(floor);// elevator is set to
														// move and destination
														// floor set
					elevator.setNoOfTrips(elevator.getNoOfTrips() + 1);
					elevator.setDirection(direction);
					return elevator;
				}
			}
		}
		return null;
	}

	// Continuous running api to check for maintainance
	public void checkForMaintainance() {
		for (Elevator elevator : elevatorList) {
			if (elevator.getNoOfTrips() == 100) {
				elevator.setAvailable(false);
			}
		}

	}

}
