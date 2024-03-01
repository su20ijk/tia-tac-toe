
public class player_2_easy implements robot{
private player_5_impossible smart;
public player_2_easy(Board ttt) {
		smart=new player_5_impossible(ttt);
}
public String decision() {
	double ram=Math.random();
	if(ram<0.25) {
		return smart.decision();
	}
	else {

		String [] ls=Board.leftSpots;
		String selection=ls[(int)(Math.random()*Board.leftSpots.length)];
		while(selection.equals("")) {
			selection=ls[(int)(Math.random()*Board.leftSpots.length)];
		}
		return selection;

	}
}
}
