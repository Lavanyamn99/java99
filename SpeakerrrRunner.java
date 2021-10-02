class SpeakerrrRunner{
public static void main(String[] values)
{
	int levell=9;
	Speakerrr.volume(levell);
	String enter=Speakerrr.volume(levell);
	System.out.println(enter);
	Speakerrr.turnOn();
	boolean check=Speakerrr.turnOn();
	System.out.println(check);
	Speakerrr.turnOff();
	boolean type=Speakerrr.turnOff();
System.out.println(type);
}
}
