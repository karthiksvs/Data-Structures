package Ranking;

import java.util.ArrayList;
import java.util.Collections;

class Solution{
	public Team[] sort(Team[] teams){
		// your code goes here
		for (int index = 1; index < teams.length; index++){
            Team temp = teams[index];
            int temp_index = index;
            for(int back_index = index - 1; back_index > -1; back_index--){
            	if (teams[back_index].noOfWins < temp.noOfWins)
                    teams[temp_index--] = teams[back_index];
                else if (teams[back_index].noOfWins == temp.noOfWins){
                    if (teams[back_index].noOfLosses > temp.noOfLosses)
                        teams[temp_index--] = teams[back_index];
                    else if (teams[back_index].noOfLosses == temp.noOfLosses)
                    {
                        if (teams[back_index].noOfDraws < temp.noOfDraws)
                            teams[temp_index--] = teams[back_index];
                        else
                            break;
                    }
                    else
                        break;
                }
                else
                    break;
            }
            teams[temp_index] = temp;
        }
        return teams;
    }
}
class Team implements Comparable<Team> {
	String teamName;
	int noOfWins;
	int noOfLosses;
	int noOfDraws;
	Team(String name, int wins, int losses, int draws){
		teamName = name;
		noOfDraws = draws;
		noOfWins = wins;
		noOfLosses = losses;
	}
//	public String toString(){
//		//retrun all the attributes as a string but appending with ", "
//        return teamName+","+noOfWins+","+noOfLosses+","+noOfDraws;
//    }
	@Override
	public int compareTo(Team arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		try {
		return "Team [teamName=" + teamName + ", noOfWins=" + noOfWins + ", noOfLosses=" + noOfLosses + ", noOfDraws="
				+ noOfDraws + "]";
	}catch(Exception e) {
		return "Catched";
	}
	}
}