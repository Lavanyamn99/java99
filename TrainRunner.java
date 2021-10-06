class TrainRunner{
public static void main(String[] values)
{
  Train train=new Train();
  String result=train.color;
  System.out.println(result);
  float results=train.price;
  System.out.println(results);
  train.weight=1800.9f;
  train.name="EXPRESS";
  train.seats=100;
  System.out.println(train.weight);
  System.out.println(train.name);
  System.out.println(train.seats);
}
}
