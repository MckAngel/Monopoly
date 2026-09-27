package game;

import cases.Case;
import java.util.ArrayList;

public class Players {

    private String name ;
    private int credits ;
    private int position ;
    private ArrayList <Case> listOfFields ;
    private ArrayList <Case> listOfGare ;
    private ArrayList <Case> listOfService ;
    private ArrayList <Buildings> listOfBuildings;
    private state PlayerState ;

    public Players(String n){
        this.name = n; 
        this.credits = 1000 ;
        this.listOfFields = new ArrayList<>();
        this.listOfGare= new ArrayList<>();
        this.listOfService = new ArrayList<>();
        this.listOfBuildings = new ArrayList<>();
        this.PlayerState = state.free ;
        this.position = 1 ;
    }
    
    public int getCredits(){
        return this.credits ;
    }
    
    public void modifyCredits(int amount) { 
        this.credits += amount ;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPosition() {
        return this.position;
    }
    
    public void setPosition(int pos) {
        this.position = pos;
    }
    
    public void addToPosition(int add) {
        this.position += add;
    }
    public Case getField(int i){
        return this.listOfFields.get(i);
    }
    public void setField(Case c){
        this.listOfFields.add(c);
    }
    public int getLenghtF(){
        return listOfFields.size();
    }
    public Case getGare(int i){
        return this.listOfGare.get(i);
    }
    public void setGare(Case c){
         this.listOfGare.add(c);
    }
    public int getLenghtG(){
        return listOfGare.size();
    }
    public Case getService(int i){
        return this.listOfService.get(i);
    }
    public void setService(Case c){
         this.listOfService.add(c);
    }
    public int getLenghtS(){
        return listOfService.size();
    }
    public void setState(state s){
        this.PlayerState = s ;
    }
    public state getState(){
        return this.PlayerState;
    }
    public void setBuilding(Buildings b){
        listOfBuildings.add(b);
    }
    public Buildings getBuilding(int i){
        return listOfBuildings.get(i);
    }

    public int getLenghtB(){
        return listOfBuildings.size();
    }
    


}

