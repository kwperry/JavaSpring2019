
public class RoomOccupancy {
	private static int totalPeople = 0;
	private int numberInRoom;
	
	
	//adds a singular person to the room
	public void addToRoom() 
	{
		this.numberInRoom++;
		this.totalPeople++;
	}
	
	//adds multiple people to the room
	public void addToRoom(int numOfPeople) 
	{
		this.numberInRoom += numOfPeople;
		this.totalPeople+= numOfPeople;
	}
	
	//removes person from the room
	//exits the function if the number of people in the 
	//room is 0
	public void removeFromRoom() {
		if(this.numberInRoom == 0)
		{
			return;
		}
		numberInRoom--;
		totalPeople--;
		
	} 
	//removes multiple people from a room
	//exits the function if the  number of people
	//removed is greater than the the people in 
	//in the room
	public void removeFromRoom(int numOfPeople) {
		if(this.numberInRoom - numOfPeople < 0)
		{
			return;
		}
		numberInRoom-= numOfPeople;
		totalPeople-= numOfPeople;
		
	} 
	
	
	public int getNumber() {
		return numberInRoom;
	}
	public static int getTotal() {
		return totalPeople;
	}
	
	public RoomOccupancy()
	{
		this.numberInRoom = 0;
	}

}
