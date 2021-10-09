class Scooter
{
 String color,brand,madein,engine;
 float weight,height;
 float length,breadth,price;
 long mfg;
 int lights,code,warranty,mylage;
 Stabilizer(String color,String brand)
 {
 System.out.println("SCOOTER INVOKED");
 System.out.println("COLOR:"+color);
 System.out.println("BRAND:"+brand);
 this.color=color;
 this.brand=brand;

 }
Stabilizer(String madein)
{
System.out.println("COUNTRY:"+madein);
this.madein=madein;
}
Stabilizer(int lights,int code)
{
System.out.println("LIGHTS:"+lights);
System.out.println("CODE:"+code);
this.lights=lights;
this.code=code;
}

Stabilizer(float height,float weight)
{
System.out.println("HEIGHT:"+height);
System.out.println("WEIGHT:"+weight);
this.weight=weight;
this.height=height;
System.out.println(this);
}

}