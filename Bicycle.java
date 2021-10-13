 class Bicycle
 {
 String color;
 float price;
 String brand;  
 
 Bicycle()
 {
	 
	 System.out.println("INVOCATION");
	 
 }
  void brake(String color,String brand)
 { 
     
      System.out.println("BICYCLE INVOKED");
	  this.color=color;
      this.brand=brand;
 }
 void move(float price)
 {
   
	System.out.println("BLACK INVOKED");
     this.price=price;
 }
 void displayDetails()
 {
   System.out.println("COLOR:"+color);
   System.out.println("PRICE:"+price);
   System.out.println("BRAND:"+brand);

 }
 
 }