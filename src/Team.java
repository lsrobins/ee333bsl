/*
 * File: Team.java
 * Author:Pat Srisa-An, pat1995@uab.edu
 * Assignment: BasketballShotLogger - EE333 Fall 2016
 * Vers: 1.0.0 11/17/2016 ps - initial coding
 *
 * Credits
 */


import java.util.ArrayList;

/**
 *
 * @author Pat Srisa-An, pat1995@uab.edu
 */
public class Team {

    private ArrayList<Player> team = new ArrayList<>();
    private String teamname;

    public Team() {
        teamname = "";
    }

    public Team(String teamname) {
        this.teamname = teamname;
    }

    public String getName() {
        return "" + teamname;
    }

    public int getCount() {
        return team.size();
    }

    public Player getPlayer(int j) {

                return team.get(j);
            
 
    }

    public void addPlayer(Player p) {
        this.team.add(p);
    }

    public void setPlayer(int i, Player p) {
        this.team.set(i, p);
    }

}
