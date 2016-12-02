/*
 * File: Shot.java
 * Author: Scott Robinson, lsrobins@uab.edu
 * Assignment: ShotLogger-Scott - EE333 Fall 2016
 * Vers: 1.0.0 11/23/2016 lsr - initial coding
 *
 * Credits:  (if any for sections of code)
 */

import java.time.LocalDateTime;

/**
 * @author Scott Robinson, lsrobins@uab.edu
 */
public class Shot {
    
    private Player player;  // Player who took the shot
    private int x; // x coordinate on the court
    private int y; // y coordinate on the court
    private boolean made; // true if the shot is made, false if it is not
    private boolean overHalfCourt; // true if the shot was taken from across
                                   // half court
    private LocalDateTime shotTime; // real world time the shot was taken
    private int pointValue; // number of pointValue shot attempt is worth
    private Period period;
    
    public Shot(Player player, int x, int y, boolean made, 
            boolean overHalfCourt, LocalDateTime shotTime,  int pointValue,
            Period period){
        this.player = player;
        this.x = x;
        this.y = y;
        this.made = made;
        this.overHalfCourt = overHalfCourt;
        this.shotTime = shotTime;
        this.pointValue = pointValue;      
        this.period = period;
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
    return y;
}
    
    public boolean wasShotMade(){
        return made;
    }
    
    public LocalDateTime getShotTime(){
        return shotTime;
    }
    
    public boolean wasShotOverHalfCourt(){
        return overHalfCourt;
    }
    
    public int getPointValue(){
        return pointValue;
    }
    

}
