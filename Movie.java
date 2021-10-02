class Movie{
public static void movieDetailsDisplay(int ticketPrice,float movieLength,float rating,String movieName,String[] actors )
{
System.out.println("Movie Details");
System.out.println("TicketPrice:" +ticketPrice);
System.out.println("Movie Length:" +movieLength);
System.out.println("Rating:" +rating);
System.out.println("Movie Name:" +movieName);
for(int actorIndex=0;actorIndex<actors.length;)
{
	String actor=actors[actorIndex];
	System.out.println(actor);
	actorIndex++;	
}
}

}