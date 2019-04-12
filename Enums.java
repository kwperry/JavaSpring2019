
public class Enums {

	public static enum  flavors 
	{ 
		vanilla, 
		chocolate, 
		strawberry
	}
	public static void main(String[] args) 
	{
	
		for(flavors flavor : flavors.values())
		{
			switch(flavor)
			{
				case chocolate:
					System.out.println(flavor  + ", I'm lactose intolerant");
					break;
				case strawberry:
					System.out.println(flavor  + ", still cannont have ice cream");
					break;
				case vanilla:
					System.out.println(flavor  + ", not worth the effort");
					break;
				default:
					System.out.println("Is that ice cream? If so, I can't eat it");
					break;
			}
			
		}
	}

}
