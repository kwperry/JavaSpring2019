
public class RunActor {
	private static void tryout(Actor a)
	{
		a.act();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor1 actor1 = new Actor1();
		Actor2 actor2 = new Actor2();
//		actor1.act();
//		actor2.act();
		tryout(actor1);
		tryout(actor2);
	
	}

}
