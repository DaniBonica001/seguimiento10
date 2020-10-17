package model;
public class Pilot{		
	Team squad;
	//Atributes
	private String name;
	private int age;
	private Team team;
	private int [] scores;
	//Methods
	public Pilot (String pName,int pAge, Team pTeam,int races){
		name=pName;
		age=pAge;
		team=pTeam;
		scores= new int [races];
	}
	//Setters and getters
	//set and get of squad
	public void setSquad(Team squad){
		this.squad=squad;
	}
	public Team getSquad (){
		return squad;
	}

	//Set and get of name
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	//Set and get of age
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}

	//set and get of team 
	public void setTeam(Team team){
		this.team=team;
	}
	public Team getTeam(){
		return team;
	}

	//set and get of scores
	public void setScores(int [] scores){
		this.scores=scores;
	}
	public int [] getScores(){
		return scores;
	}

	public double calculateAverage(int races){
		double average=0;
		int time=0;
		for (int i=0;i<scores.length;i++){
			time+=scores[i];
		}
		average= time/races;
	return average;

	}
	
	
}