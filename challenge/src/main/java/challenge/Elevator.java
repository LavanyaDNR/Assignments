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
