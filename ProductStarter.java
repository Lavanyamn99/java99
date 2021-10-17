class ProductStarter{

public static void main(String[] chocolates)
{

Product product=new Product();
product.displayDetails();
product.name="Mobile";
product.price=15.8f;
product.quality="BEST";
product.quantity=5;
product.isiMark="YES";
Product product1=new Product();
product1.displayDetails();
product1.name="Bluetooth";
product1.price=45.8f;
product1.quality="WORST";
product1.quantity=8;
product1.isiMark="NO";
product.displayDetails();
product1.displayDetails();
product.displayTotalPrice();
product1.displayTotalPrice();


}


}