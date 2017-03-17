
public class MobilesMethodOverloading 

  	{
	
	
	private String Manufacturer;
	private String operating_System;
	private String model;
	private int cost;
	
    private float camera;
    private String technalogy;
    private String sim;
    private String memory;
    
    
	
	
	
	public float getCamera() 
	{
		return this.camera;
	}


	
	public void setCamara(float camera) 
	{
		this.camera = camera;
	}


	public String getTechnalogy() 
	{
		return this.technalogy;
	}


	
	public void setTechnalogy(String technalogy)
	{
		this.technalogy = technalogy;
	}


	
	public String getSim() 
	{
		return this.sim;
	}


	
	public void setSim(String sim)
	{
		this.sim = sim;
	}


	
	public String getMemory() 
	{
		return this.memory;
	}


	
	public void setMemory(String memory)
	{
		this.memory = memory;
	}


	public String getManufacturer()
	{
		return this.Manufacturer;
	}
	
	
	public void setManufacturer(String manufacturer)
	{
		Manufacturer = manufacturer;
	}
	
	
	public String getOperating_System()
	{
		return this.operating_System;
	}
	
	
	public void setOperating_System(String operating_System)
	{
		this.operating_System = operating_System;
	}
	
	
	
	public String getModel() 
	{
		return this.model;
	}
	
	public void setModel(String model)
	{
		
		this.model = model;
	}
	
	
	public int getCost() 
	{
		return this.cost;
	}
	
	
	public void setCost(int cost) 
	{
		this.cost = cost;
	}
	
	
	
	




	public MobilesMethodOverloading(String manufacturer, String operating_System, String model, int cost, float camera,
			String technalogy, String sim, String memory) 
	{
		super();
		Manufacturer = manufacturer;
		this.operating_System = operating_System;
		this.model = model;
		this.cost = cost;
		this.camera = camera;
		this.technalogy = technalogy;
		this.sim = sim;
		this.memory = memory;
	}



	public void printMobileDetails(String Manufacturer,int cost)
	{
		
		System.out.println("Manufacture Name:"+getManufacturer()+" " +"\n" +"Cost :"+getCost() );
		System.out.println("************************************");
		
	}
	
	public void printMobileDetails(String Manufacturer,String operating_System,String Model,int cost)
	{
		
		System.out.println("Manufacture Name:"+getManufacturer()+" "+"\n" +"Operating System:"+getOperating_System()+" " +"\n"+"Model:"+getModel()+" "+"\n"+"Cost:"+getCost() );
		System.out.println("************************************");
		
	}
	
	public void printMobileDetails(float camera,String technalogy,String sim,String memory)	
	{
	
		System.out.println("Camara px's:"+getCamera()+"\n" +"Technalogy:"+getTechnalogy() +"\n" +"SIM type:"+getSim()+"\n"+"Memory :"+getMemory() );
	
		System.out.println("************************************");
	}


	public void printMobileDetails(String Manufacturer,String operating_System,String Model,int cost,float camera,String technalogy,String sim,String memory){
	
		System.out.println("Manufacture Name:"+getManufacturer()+" "+"\n" +"Operating System:"+getOperating_System()+" " +"\n"+"Model:"+getModel()+" "+"\n"+"Cost:"+getCost()+" "+"Camara px's:"+getCamera()+"\n" +"Technalogy:"+getTechnalogy() +"\n" +"SIM type:"+getSim()+"\n"+"Memory :"+getMemory() );
		System.out.println("************************************");
	
	}



	public static void main(String[] args)
	{
	
			MobilesMethodOverloading overloading1 = new MobilesMethodOverloading("Apple","IOS","6S",800,5,"GSM","NANO","16GB");
	
			overloading1.printMobileDetails("Apple",800);

			overloading1.printMobileDetails("Apple", "IOS", "6S", 800);
	
			overloading1.printMobileDetails(5,"GSM CDMA","NANO","16GB");
	
			overloading1.printMobileDetails("Apple", "IOS", "6S", 800,5,"GSM CDMA","NANO","16GB");
	
	
	}
	
		
}
