/*
 * File: Game.java
 * Author: Scott Robinson, lsrobins@uab.edu
 * Assignment: ShotLogger-Scott - EE333 Fall 2016
 * Vers: 1.0.0 11/23/2016 lsr - initial coding
 *
 * Credits:  (if any for sections of code)
 */

import java.util.ArrayList;

/**
 * @author Scott Robinson, lsrobins@uab.edu
 */
public class Game {

    Team team1;
    Team team2;
    ArrayList<Shot> team1ShotList;
    ArrayList<Shot> team2ShotList;

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        team1ShotList = new ArrayList<>();
        this.team2 = team2;
        team2ShotList = new ArrayList<>();
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public ArrayList<Shot> getTeam1ShotList() {
        return team1ShotList;
    }

    public ArrayList<Shot> getTeam2ShotList() {
        return team2ShotList;
    }

    public ArrayList<Shot> getBothTeamsShots() {
        ArrayList<Shot> bothTeamsShotList = new ArrayList<>();
        bothTeamsShotList.addAll(team1ShotList);
        bothTeamsShotList.addAll(team2ShotList);
        return bothTeamsShotList;
    }

    public ArrayList<Shot> getAllShotsFromPlayer(Player player) {
        ArrayList<Shot> playerShotList = new ArrayList<>();

        for (Shot s : team1ShotList) {
            if (s.getPlayer().equals(player)) {
                playerShotList.add(s);
            }
        }

        for (Shot s : team2ShotList) {
            if (s.getPlayer().equals(player)) {
                playerShotList.add(s);
            }
        }

        return playerShotList;
    }

    public void addShot(Team team, Shot shot) {
        if (team.equals(team1)) {
            team1ShotList.add(shot);
        }
        if (team.equals(team2)) {
            team2ShotList.add(shot);
        }
    }
}
