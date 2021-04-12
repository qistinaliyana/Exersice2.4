
public class Pen {
	String Brand, Color, Type;
	double mm, price, Totalprice;
	boolean click;
	int pack;
	
	 public void setBrand(String Brand) {
	    	this.Brand = Brand;
	    }
	 public void setColor(String Color) {
	    	this.Color = Color;
	    }
	 public void setType(String Type) {
	    	this.Type = Type;
	    }
	 public void setmm(double mm) {
		 this.mm = mm;
	 }
	 public void setclick(boolean click) {
		 this.click = click;
	 }
	 public void setprice(double price) {
		 this.price = price;
	 }
	 public void setpack(int pack) {
		 this.pack = pack;
	 }
	 
	 
	 public double getmm() {
		 return this.mm;
	 }
	 public String getBrand() {
		 return this.Brand;
	 }
	 public String getColor() {
		 return this.Color;
	 }
	 public String getType() {
		 return this.Type;
	 }
	 public boolean getclick() {
		 return this.click;
	 }
	 public int getpack() {
		 return this.pack;
	 }
	 public double getprice() {
		 return this.price;
	 }
	 public double getTotalprice() {
		 this.Totalprice = this.price * this.pack;
		 return this.Totalprice;
	 }
	 
}
