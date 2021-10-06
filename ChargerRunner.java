class ChargerRunner{
public static void main(String[] values)
{
  Charger charger=new Charger();
  String result=charger.color;
  System.out.println(result);
  int results=charger.price;
  System.out.println(results);
  charger.capacity=180.9f;
  charger.brand="MI";
 charger.weight=35.0f;
  System.out.println(charger.capacity);
  System.out.println(charger.brand);
  System.out.println(charger.weight);
  



}






}