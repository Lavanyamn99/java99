class Refrigerator
{
String brand;
float capacityInLiters;
boolean doubleDoor;
double price;
int model;  
Refrigerator()
{
System.out.println("REFRIGERATOR");
}
String getBrand()
{
return this.brand;
}


float getCapacityInLiters()
{
return this.capacityInLiters;
}

double getPrice()
{
return this.price;

}
boolean getDoubleDoor()
{
return this.doubleDoor;

}
int getModel()
{
return this.model;
}
void setBrand(String brand)
{
this.brand=brand;
System.out.println("SETTER IS INVOKED");
}
void setCapacityInLiters(float capacityInLiters)
{
this.capacityInLiters=capacityInLiters;
}
void setPrice(double price)
{
this.price=price;
}
void setDoubleDoor(boolean doubleDoor)
{
this.doubleDoor=doubleDoor;
}
void setModel(int model)
{
this.model=model;
}

}