class Camera
{
String brand;
float pixel;
double price;
boolean clarity;
int model;  
Camera()
{
System.out.println("CAMERA");
}
String getBrand()
{
return this.brand;
}


float getPixel()
{
return this.pixel;
}

double getPrice()
{
return this.price;

}
boolean getClarity()
{
return this.clarity;

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
void setPixel(float pixel)
{
this.pixel=pixel;
}
void setPrice(double price)
{
this.price=price;
}
void setClarity(boolean clarity)
{
this.clarity=clarity;
}
void setModel(int model)
{
this.model=model;
}

}