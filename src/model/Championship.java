package model;
public class Championship{
	//Constants
	public static final int MAX_RUNNERS=15;
	//Atributes
	private int year;
	private int races;
	//Relations 
	public Pilot [] pilots;
	//Methods
	public Championship (int fYear, int fRaces){
		//int runners no pasa por parametro
		year=fYear;
		races=fRaces;
		pilots = new Pilot [MAX_RUNNERS]; //el limite seria MAX_RUNNERS
	}

	//Setter and getters
	//set and get of year
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return year;
	}
	//set and get of races
	public void setRaces(int races){
		this.races=races;
	}
	public int getRaces(){
		return races;
	}

	public Pilot findPilot(String name){
		Pilot objPilot=null;
		boolean find=false;
		for (int i=0;i<pilots.length && !find;i++){
			if (pilots[i]!=null && pilots[i].getName().equalsIgnoreCase(name)){
				objPilot=pilots[i];
				find=true;
			}
		}
	return objPilot;
	}

	public String addPilot(String name,int age,int team,int []competition ){
		
		Pilot findPilot=findPilot(name);
		boolean exit=false;
		String message="";
		String message2="";
		if (findPilot!=null){
			message="Error. El piloto ya ha sido creado";
		}else{
			for (int i=0;i<pilots.length;i++){
				if (pilots[i]==null){								
					
					if (team==1){
						pilots[i]= new Pilot (name,age,Team.SCUDERIA_FERRARI,races,competition);
						
					}else if (team==2){
						pilots[i]= new Pilot (name,age,Team.MCLAREN_F1_TEAM,races,competition);
						
					}else if (team==3){
						pilots[i]= new Pilot (name,age,Team.REDBULL_RACING,races,competition);
						
					}else if (team==4){
						pilots[i]= new Pilot (name,age,Team.MERCEDES_AMG,races,competition);
						
					}else if (team==5){
						pilots[i]= new Pilot (name,age,Team.RACING_POINT,races,competition);
						
					}else if (team==6){
						pilots[i]= new Pilot (name,age,Team.ALFA_ROMEO,races,competition);
						
					}else if (team==7){
						pilots[i]= new Pilot (name,age,Team.RENAULT,races,competition);
						
					}else if (team==8){
						pilots[i]= new Pilot (name,age,Team.WILLIAMS,races,competition);
						
					}else{
						message2="Error.No se encontro el equipo";
					}					
					
					exit=true;
					message="Se ha registrado el piloto";
				}
			}
			if (exit==false){
				message="Error. El arreglo de pilotos ya esta lleno";
			}
		}
	return message+message2;
	}
	
	public String showAverageTimes(String name){
	String message="";
	int segundos,min,horas,seg;	
	int time;
	double average=0;
	Pilot findPilot=findPilot(name);
	if (findPilot==null){
		message="Error. No se encontro el piloto";		
	}else{
		if(findPilot.calculateAverage(races)<=60){
			message="El promedio del piloto "+findPilot.getName()+" es de "+average+" segundos";
		}else{
			segundos=(int)average%60;
			seg=(int)average/60;
			min=(int)seg%60;
			horas=(int)seg/60;
			message="El promedio del piloto "+findPilot.getName()+" es de "+horas+" horas"+min+" minutos"+segundos+" segundos";
		}

	}	
	return message;

	}
	



	

}
