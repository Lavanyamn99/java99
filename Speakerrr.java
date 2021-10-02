class Speakerrr
{
public static String volume(int level)
{                                                                         
  if(level<=0)
  {
      System.out.println("Level 0 is Invoked");
      String enter="On it First";
      return enter; 
  }
   
  
  else if(level<=3)
  {
	 System.out.println("Level 1");
      String sound="ok";
       return sound;
	  
  }
   

else if(level>3&&level<5)
	
{    
      System.out.println("Level 2");
      String cheer="loud";
      return cheer;
   
   
}

	

else if(level>5&&level>9)
  {
	
	  System.out.println("Level 3");
      String start="too loud";
       return start;
  }
  else
  {
	 System.out.println("Level 4"); 
	  String message="call police";
	  return message;
	  
	  
  }
} 
public static boolean turnOn()
{
	System.out.println("TN");
	return true;
}
public static boolean turnOff()
{
	System.out.println("TF");
	return false;
	
}

}