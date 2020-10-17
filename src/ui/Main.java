package ui;
import java.util.Scanner;
import model.Championship;
public class Main{
	//Atributes
	private Championship tournament;

	//Global variable
	public Scanner lector;

	//Methods
	public Main(){
		lector = new Scanner(System.in);
		createChampion();
	}

		public static void main(String[] args) {
			System.out.println("Iniciando la aplicación");
			Main objMain = new Main();	

			System.out.println("Registro de campeonato");
			System.out.println("Registro de pilotos");			
			int allow=0;

			while(allow!=0){
				objMain.showMenu();
				if (allow==1){
					objMain.addPilot();				
				}else{

				}
				
			}		
		}

		public int showMenu(){
			int allow=0;
			System.out.println("Ingrese:"+"\n1. Para ingresar un piloto"+"2.Para ver el promedio del tiempo en las carreras de cada piloto");
			allow = lector.nextInt();lector.nextLine();
		return allow;
		}

		public void createChampion(){
			System.out.println("Ingrese el año del campeonato");
			int year = lector.nextInt();

			System.out.println("Ingrese la cantidad de grandes premios del campeonato");
			int races = lector.nextInt();lector.nextLine();		
			//no necesito runners, se puede crear un array con posiciones vacias

			tournament = new Championship (year,races);
		}
		//necesito un get
		public void addPilot(){
			System.out.println("Ingrese el nombre del piloto");
			String name= lector.nextLine();

			System.out.println("Ingrese la edad del piloto");
			int age = lector.nextInt(); lector.nextLine();

			System.out.println("Ingrese a que equipo pertenece:"+
				"\n(1)Scuderia ferrari"+
				"\n(2)McLaren f1 team"+
				"\n(3)Red bull racing"+
				"\n(4)Mercedes amg"+
				"\n(5)Racing point"+
				"\n(6)Alfa romeo"+
				"\n(7)Renault"+
				"\n(8)Williams");
			int team=lector.nextInt();

			int amount=tournament.getRaces();
			int []competition= new int [amount];

			for (int i=0;i<competition.length;i++){
				System.out.println("Ingrese el tiempo en segundos del "+(i+1)+" gran premio");
				competition[i]=lector.nextInt();
			}

			String message;
			message=tournament.addPilot(name,age,team);
			System.out.println(message);
		}



//SCUDERIA_FERRARI, MCLAREN_F1_TEAM, REDBULL_RACING, MERCEDES_AMG, RACING_POINT, ALFA_ROMEO, RENAULT,WILLIAMS;

}