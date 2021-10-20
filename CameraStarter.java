class CameraStarter
{
	public static void main(String[] values)
	{                           

     Camera camera=new Camera();
     camera.setBrand("CANNON");
     camera.setPrice(45607);
     camera.setPixel(78.9f);
     camera.setClarity(true);
     camera.setModel(56);
     String brand=camera.getBrand();
	 System.out.println(camera.getBrand());
     float pixel=camera.getPixel();
	 System.out.println(camera.getPixel());
     double price=camera.getPrice();
	 System.out.println(camera.getPrice());
     boolean clarity=camera.getClarity();
	 System.out.println(camera.getClarity());
     int model=camera.getModel();
	 System.out.println(camera.getModel());
}

}