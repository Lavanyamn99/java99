class BicycleStarter
{
public static void main(String[] args)
{
      Bicycle bicycle=new Bicycle();
	  bicycle.brake("RED","ATLAS");
	  bicycle.move(6.9f);
	  bicycle.displayDetails();
	  float result=6879.0f;
	  System.out.println(result);
      Type type=Type.HERCULUS;
	  System.out.println(type);
	  System.out.println("ENDED BICYCLE INVOKING");



}

}