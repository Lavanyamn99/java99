class HandBag
{
  String color,brand,material;
  float price,size,capacity;
  
  HandBag(String rest,String value ,String type)
{
    System.out.println("COLOR INVOKED");
	System.out.println("values:"+rest);
	color=rest;
	System.out.println("BRAND INVOKED");
    System.out.println("values:"+value);
	brand=value;
	System.out.println("MATERIAL INVOKED");
	System.out.println("values:"+type);
	material=type;
	
	

}

HandBag(float rest1,float value1,float type1)
{

System.out.println("FIG:"+rest1);
System.out.println("FIG:"+value1);
System.out.println("FIG:"+type1);
price=rest1;
size=value1;
capacity=type1;
}

}