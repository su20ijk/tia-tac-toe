
public class player_1_beginner implements robot{
public player_1_beginner() {
}
public String decision() {
	String [] ls=Board.leftSpots;
	String selection=ls[(int)(Math.random()*Board.leftSpots.length)];
	while(selection.equals("")) {
		selection=ls[(int)(Math.random()*Board.leftSpots.length)];
	}
	return selection;
}
}