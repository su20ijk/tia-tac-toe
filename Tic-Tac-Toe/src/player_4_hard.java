
public class player_4_hard implements robot{
private player_5_impossible smart;
public player_4_hard(Board pos) {
		smart=new player_5_impossible(pos);
}
public String decision() {
	double ram=Math.random();
	if(ram<0.75) {
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
