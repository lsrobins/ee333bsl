/*
 * File: Player.java
 * Author:Pat Srisa-An, pat1995@uab.edu
 * Assignment: BasketballShotLogger - EE333 Fall 2016
 * Vers: 1.0.0 11/17/2016 ps - initial coding
 *
 * Credits
 */


/**
 *
 * @author Pat Srisa-An, pat1995@uab.edu
 */
public class Player {

    private String name;
    private int number;
    private String position;

    public Player() {

        name = "";
        number = 0;
        position = "";
    }
    
    public Player(String name, int number, String position){
        this.name = name;
        this.number = number;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

     /**
    * 
    * @return 
    */
    @Override
    public String toString() {
        return getName()+ "number " + getNumber()+ "playing as " + getPosition()+ ".";
    }
}
