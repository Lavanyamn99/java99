class Watch
 {
 String countryMade;
 float price;
 String brand;  
 
 Watch()
 {
	 
	 System.out.println("INVOCATION");
	 
 }
  void brake(String countryMade,String brand)
 { 
     
      System.out.println("WATCH INVOKED");
	  this.countryMade=countryMade;
      this.brand=brand;
 }
 void move(float price)
 {
   
	System.out.println("PRICE INVOKED");
     this.price=price;
 }
 void displayDetails()
 {
   System.out.println("COUNTRYMADE:"+countryMade);
   System.out.println("PRICE:"+price);
   System.out.println("BRAND:"+brand);

 }
 
 }