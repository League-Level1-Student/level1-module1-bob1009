

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar car= new RaceCar("cokacola", 5);
		// 2. Print the RaceCar's position in the race
		System.out.println("your car is in "+car.getPositionInRace()+" place");
		// 3. Crash the RaceCar
		car.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		car.pit();
		// 5. Help the car move into first place.
		for (int i = 0; i < 7; i++) {
			car.overtake();
		
		}
		System.out.println("Last Lap");
		if(car.getPositionInRace()==1);
		System.out.println("you won!!!!!!!!!");
		
	}

	private static void pit() {
		// TODO Auto-generated method stub
		
	}
}
