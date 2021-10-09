class Monitor
{
 String color,brand,madein,shape;
 float weight,height;
 float length,breadth;
 long mfg;
 int  ram,rom,id,code,warranty;
 Stabilizer(String color,String brand)
 {
 System.out.println("MONITOR INVOKED");
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
Stabilizer(int ram,int rom)
{
System.out.println("RAM:"+ram);
System.out.println("ROM:"+rom);
this.ram=ram;
this.rom=rom;
}
Stabilizer(int id)
{
System.out.println("ID:"+id);
this.id=id;
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