class RefrigeratorStarter
{
	public static void main(String[] values)
	{                           

    Refrigerator refrigerator=new Refrigerator();
     refrigerator.setBrand("SAMSUNG");
     refrigerator.setPrice(45607);
     refrigerator.setCapacityInLiters(8.9f);
     refrigerator.setDoubleDoor(true);
     refrigerator.setModel(56);
     String brand=refrigerator.getBrand();
	 System.out.println(refrigerator.getBrand());  
	 float capacityInLiters=refrigerator.getCapacityInLiters();
	 System.out.println(refrigerator.getCapacityInLiters()); 
     double price=refrigerator.getPrice();
	 System.out.println(refrigerator.getPrice());
     boolean doubleDoor=refrigerator.getDoubleDoor();
	 System.out.println(refrigerator.getDoubleDoor());
     int model=refrigerator.getModel();
	 System.out.println(refrigerator.getModel());
}

}