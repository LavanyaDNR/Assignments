package challenge;

/**
 * Object class for Elevator
 * @author Chapala
 *
 */
public class Elevator {
	
	int floorPosition;
	int noOfTrips;
	boolean closed;//parameter for open/closed
	boolean halt;// parameter for running/stopped
	String direction; // whether its going up or down
	int destinationFloor;
	
	
	public int getDestinationFloor() {
		return destinationFloor;
	}
	public void setDestinationFloor(int destinationFloor) {
		this.destinationFloor = destinationFloor;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public int getFloorPosition() {
		return floorPosition;
	}
	public void setFloorPosition(int floorPosition) {
		this.floorPosition = floorPosition;
	}
	public int getNoOfTrips() {
		return noOfTrips;
	}
	public void setNoOfTrips(int noOfTrips) {
		this.noOfTrips = noOfTrips;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	public boolean isHalt() {
		return halt;
	}
	public void setHalt(boolean halt) {
		this.halt = halt;
	}
	
	

}
