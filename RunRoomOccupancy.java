
public class RunRoomOccupancy {

	public static void main(String[] args) {
		
		RoomOccupancy room1 = new RoomOccupancy();
		RoomOccupancy room2 = new RoomOccupancy();
		
		room1.addToRoom();
		room1.addToRoom();
		room1.addToRoom();
		room1.addToRoom();
		room1.addToRoom();
		room1.addToRoom();
		room1.addToRoom();
		room2.addToRoom();
		room2.addToRoom();
		room2.addToRoom();
		room2.addToRoom();
		System.out.print("There are " + room1.getNumber() + " people in room1");
		System.out.print("\nThere are " + room2.getNumber() + " people in room2");
		System.out.print("\nThere are " + RoomOccupancy.getTotal() + " total people");
		System.out.print("\nEvicting 5 people from each room");
		
		room1.removeFromRoom();
		room1.removeFromRoom();
		room1.removeFromRoom();
		room1.removeFromRoom();
		room1.removeFromRoom();
		room2.removeFromRoom();
		room2.removeFromRoom();
		room2.removeFromRoom();
		room2.removeFromRoom();
		room2.removeFromRoom();
		
		System.out.print("\n\nThere are " + room1.getNumber() + " people in room1");
		System.out.print("\nThere are " + room2.getNumber() + " people in room2");
		System.out.print("\nThere are " + RoomOccupancy.getTotal() + " total people");

	}

}
