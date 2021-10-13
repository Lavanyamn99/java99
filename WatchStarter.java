class WatchStarter
{
public static void main(String[] args)
{
      Watch watch=new Watch();
	  watch.brake("RED","ATLAS");
	  watch.move(6.9f);
	  watch.displayDetails();
	  float result=6879.0f;
	  System.out.println(result);
      Typee typee=Typee.FASTRACK;
	  System.out.println(typee);
	  System.out.println("ENDED WATCH INVOKING");



}

}