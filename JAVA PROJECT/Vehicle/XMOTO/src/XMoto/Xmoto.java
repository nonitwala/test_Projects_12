package XMoto;

public class Xmoto
{
	public static void main(String[] args) 
	{
		
	}	
}
class Bicycle extends Xmoto
{
	public static void main(String[] args) 
	{
		ChooseCompany(2);     
	}
	public static void ChooseCompany(int a)
	{
		int b=30;
		switch(a)
		{
		case 1: Bicycle.Hercules(b);
		break;
		case 2: Bicycle.Hero(a);
		break;
		case 3: Bicycle.Avon(a);
		break;
		case 4: Bicycle.KrossBikes(a);
		break;
		case 5: Bicycle.NinetyOne(a);
		break;
		default:System.out.println("press 1 for Hercules Cycles");
				System.out.println("press 2 for Hero Cycles");
				System.out.println("press 3 for Avon Cycles");
				System.out.println("press 4 for KrossBikes Cycles");
				System.out.println("press 5 for NinetyOne Cycles");
		break;
		}
	}
	public static void Hercules(int b)
	{
		switch(1)
		{
		case 1: Bicycle.Roadeo(b);
		break;
		case 2: Bicycle.MTB(b);
		break;
		case 3: Bicycle.TopGear(b);
		break;
		case 4: Bicycle.JrRoadster(b);
		break;
		case 5: Bicycle.Roadster(b);
		break;
		default:System.out.println("press 1 for Hercules Roadeo");
		System.out.println("press 2 for Hercules MTB");
		System.out.println("press 3 for Hercules TopGear");
		System.out.println("press 4 for Hercules Jr. Roadster");
		System.out.println("press 5 for Hercules Roadster");
		break;
		}
	}
	public static void Roadeo(int a)
	{
		switch(33)
		{
		case 1: System.out.println("Hercules Roadeo");
		break;
		case 2: System.out.println("Red & Black");
		break;
		case 3: System.out.println("MRP:13500");
		break;
		case 4: System.out.println("Your order has been successfully placed");
		break;
		default:System.out.println("press 1 for name");
				System.out.println("press 2 for color");
				System.out.println("press 3 for price");
				System.out.println("press 4 for buy the cycle");
		break;
	}
		
	}
	public static void MTB(int a)
	{
		switch(4)
		{
		case 1: System.out.println("Hercules MTB");
		break;
		case 2: System.out.println("Red & Black");
		break;
		case 3: System.out.println("13500");
		break;
		case 4: System.out.println("Your order has been successfully placed");
		break;
		default:System.out.println("press 1 for name");
				System.out.println("press 2 for color");
				System.out.println("press 3 for price");
				System.out.println("press 4 for buy the cycle");
		break;
		}
		
	}
	public static void TopGear(int a)
	{
		switch(4)
		{
		case 1: System.out.println("Hercules TopGear");
		break;
		case 2: System.out.println("Red & Black");
		break;
		case 3: System.out.println("13500");
		break;
		case 4: System.out.println("Your order has been successfully placed");
		break;
		default:System.out.println("press 1 for name");
				System.out.println("press 2 for color");
				System.out.println("press 3 for price");
				System.out.println("press 4 for buy the cycle");
		break;
		}
		
	}
	public static void JrRoadster(int a)
	{
		switch(4)
		{
		case 1: System.out.println("Hercules TopGear");
		break;
		case 2: System.out.println("Red & Black");
		break;
		case 3: System.out.println("13500");
		break;
		case 4: System.out.println("Your order has been successfully placed");
		break;
		default:System.out.println("press 1 for name");
				System.out.println("press 2 for color");
				System.out.println("press 3 for price");
				System.out.println("press 4 for buy the cycle");
		break;
		}
		
	}
	public static void Roadster(int a)
	{
		switch(4)
		{
		case 1: System.out.println("Hercules Roadster");
		break;
		case 2: System.out.println("Red & Black");
		break;
		case 3: System.out.println("13500");
		break;
		case 4: System.out.println("Your order has been successfully placed");
		break;
		default:System.out.println("press 1 for name");
				System.out.println("press 2 for color");
				System.out.println("press 3 for price");
				System.out.println("press 4 for buy the cycle");
		break;
		}
		
	}
	public static void Hero(int a)
	{
		switch(22)
		{
		case 1: Bicycle.Caliber(a);
		break;
		case 2: Bicycle.Ceralo(a);
		break;
		case 3: Bicycle.Doran(a);
		break;
		case 4: Bicycle.Halcon(a);
		break;
		case 5: Bicycle.Joplin(a);
		break;
		default:System.out.println("press 1 for Hero Caliber");
		System.out.println("press 2 for Hero Ceralo");
		System.out.println("press 3 for Hero Doran");
		System.out.println("press 4 for Hero Halcon");
		System.out.println("press 5 for Hero Joplin");
		break;
		}	
	}
	public static void Caliber(int a)
	{
		switch(4)
		{
		case 1: System.out.println("Hero Caliber");
		break;
		case 2: System.out.println("Red & Black");
		break;
		case 3: System.out.println("25500");
		break;
		case 4: System.out.println("Your order has been successfully placed");
		break;
		default:System.out.println("press 1 for name");
				System.out.println("press 2 for color");
				System.out.println("press 3 for price");
				System.out.println("press 4 for buy the cycle");
		break;
		}
		
	}
	public static void Ceralo(int a)
	{
		switch(4)
		{
		case 1: System.out.println("Hero Ceralo");
		break;
		case 2: System.out.println("Red & Black");
		break;
		case 3: System.out.println("24500");
		break;
		case 4: System.out.println("Your order has been successfully placed");
		break;
		default:System.out.println("press 1 for name");
				System.out.println("press 2 for color");
				System.out.println("press 3 for price");
				System.out.println("press 4 for buy the cycle");
		break;
		}
		
	}
	public static void Doran(int a)
	{
		switch(4)
		{
		case 1: System.out.println("Hero Doran");
		break;
		case 2: System.out.println("Red & Black");
		break;
		case 3: System.out.println("24500");
		break;
		case 4: System.out.println("Your order has been successfully placed");
		break;
		default:System.out.println("press 1 for name");
				System.out.println("press 2 for color");
				System.out.println("press 3 for price");
				System.out.println("press 4 for buy the cycle");
		break;
		}
		
	}
	public static void Halcon(int a)
	{
		switch(4)
		{
		case 1: System.out.println("Hero Halcon");
		break;
		case 2: System.out.println("Red & Black");
		break;
		case 3: System.out.println("24500");
		break;
		case 4: System.out.println("Your order has been successfully placed");
		break;
		default:System.out.println("press 1 for name");
				System.out.println("press 2 for color");
				System.out.println("press 3 for price");
				System.out.println("press 4 for buy the cycle");
		break;
		}
		
	}
	public static void Joplin(int a)
	{
		switch(4)
		{
		case 1: System.out.println("Hero Joplin");
		break;
		case 2: System.out.println("Red & Black");
		break;
		case 3: System.out.println("24500");
		break;
		case 4: System.out.println("Your order has been successfully placed");
		break;
		default:System.out.println("press 1 for name");
				System.out.println("press 2 for color");
				System.out.println("press 3 for price");
				System.out.println("press 4 for buy the cycle");
		break;
		}
		
	}
	public static void Avon(int a)
	{
		switch(1)
		{
		case 1: Bicycle.Roadeo(a);
		break;
		case 2: Bicycle.MTB(a);
		break;
		case 3: Bicycle.TopGear(a);
		break;
		case 4: Bicycle.JrRoadster(a);
		break;
		case 5: Bicycle.Roadster(a);
		break;
		default:System.out.println("press 1 for Hercules Roadeo");
		System.out.println("press 2 for Hercules MTB");
		System.out.println("press 3 for Hercules TopGear");
		System.out.println("press 4 for Hercules Jr. Roadster");
		System.out.println("press 5 for Hercules Roadster");
		break;
		}
	}
	public static void KrossBikes(int a)
	{
		switch(1)
		{
		case 1: Bicycle.Roadeo(a);
		break;
		case 2: Bicycle.MTB(a);
		break;
		case 3: Bicycle.TopGear(a);
		break;
		case 4: Bicycle.JrRoadster(a);
		break;
		case 5: Bicycle.Roadster(a);
		break;
		default:System.out.println("press 1 for Hercules Roadeo");
		System.out.println("press 2 for Hercules MTB");
		System.out.println("press 3 for Hercules TopGear");
		System.out.println("press 4 for Hercules Jr. Roadster");
		System.out.println("press 5 for Hercules Roadster");
		break;
		}
	}
	public static void NinetyOne(int a)
	{
		switch(1)
		{
		case 1: Bicycle.Roadeo(a);
		break;
		case 2: Bicycle.MTB(a);
		break;
		case 3: Bicycle.TopGear(a);
		break;
		case 4: Bicycle.JrRoadster(a);
		break;
		case 5: Bicycle.Roadster(a);
		break;
		default:System.out.println("press 1 for Hercules Roadeo");
				System.out.println("press 2 for Hercules MTB");
				System.out.println("press 3 for Hercules TopGear");
				System.out.println("press 4 for Hercules Jr. Roadster");
				System.out.println("press 5 for Hercules Roadster");
		break;
		}
	}
}
class MotorCycle extends Xmoto
{
	
	
}
class Scooter extends MotorCycle
{

	
}
