
public class Main {

	public static void main(String[] args) {
        Pen F = new Pen();
		
		F.setBrand("Faber-Castell");
		F.setColor("Black, Red, and Blue");
		F.setType("Ball pen");
		F.setmm(0.7);
		F.setclick(true);
		F.setprice(5);
		F.setpack(20);
		
		System.out.println("Brand: " + F.getBrand());
		System.out.println("Color: " + F.getColor());
		System.out.println("Type: " + F.getType());
		System.out.println("Size: " + F.getmm() + "mm");
		System.out.println("Click: " + F.getclick());
		System.out.println("Pack: " + F.getpack());
		System.out.println("Price: RM " + F.getprice());
		System.out.println("Total price: RM " + F.getTotalprice());
		
		System.out.println();
		
		    Pen M = new Pen();
			
			M.setBrand("M&G");
			M.setColor("Black and Blue");
			M.setType("Gel pen");
			M.setmm(0.5);
			M.setclick(true);
			M.setprice(5);
			M.setpack(30);
			
			System.out.println("Brand: " + M.getBrand());
			System.out.println("Color: " + M.getColor());
			System.out.println("Type: " + M.getType());
			System.out.println("Size: " + M.getmm() + "mm");
			System.out.println("Click: " + M.getclick());
			System.out.println("Pack: " + M.getpack());
			System.out.println("Price: RM " + M.getprice());
			System.out.println("Total price: RM " + M.getTotalprice());
		

	}
}

