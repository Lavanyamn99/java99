class ComputerStarter{

public static void main(String[] values)
{

Computer computer=new Computer();
computer.brand="DELL";
computer.price=15687.8f;
computer.quantity=5;
computer.modelNo=46;
computer.color="Black";

Computer computer1=new Computer();
computer1.brand="LENOVA";
computer1.price=55687.8f;
computer1.quantity=9;
computer1.modelNo=76;
computer1.color="SILVER";

computer.displayDetails();
computer1.displayDetails();
computer.displayTotalPrice();
computer1.displayTotalPrice();
computer.displayTotalOfAll();
computer1.displayTotalOfAll();

}


}