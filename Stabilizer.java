class Stabilizer
{
 String color,brand,made,shape;
 float capacity,weight,height;
 float length,breadth;
 long mfg;
 int size,id,code,warranty;
 Stabilizer(String color,String brand)
 {
 System.out.println("STABILIZER INVOKED");
 System.out.println("COLOR:"+color);
 System.out.println("BRAND:"+brand);
 this.color=color;
 this.brand=brand;

 }
Stabilizer(String made)
{
System.out.println("COUNTRY:"+made);
this.made=made;
}
Stabilizer(int size,int id)
{
System.out.println("SIZE:"+size);
System.out.println("ID:"+id);
this.id=id;
this.size=size;
}

Stabilizer(float capacity,float weight)
{
System.out.println("CAPACITY:"+capacity);
System.out.println("WEIGHT:"+weight);
this.weight=weight;
this.capacity=capacity;
System.out.println(this);
}

}