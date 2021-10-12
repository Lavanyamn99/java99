class SocialMedia
{
String app;
int battery;
float data;
String favourite;
int hours;
SocialMedia(String app,String favourite)
{
	System.out.println("APP:"+app);
	System.out.println("FAVOURITE:"+favourite);
	this.app=app;
	this.favourite=favourite;	
}
SocialMedia(int battery)
{
	this();
	System.out.println("BATTERY USAGE:"+battery);
	this.battery=battery;
}
SocialMedia()
{
	System.out.println("SOCIAL MEDIA INVOKED");
}

SocialMedia(float data)
{
	System.out.println("DATAUSAGE:"+data);
	this.data=data;
	
}


}