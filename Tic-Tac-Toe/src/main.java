
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String again;
		Scanner input=new Scanner(System.in);
		System.out.println("a1|a2|a3");
		System.out.println("——+——+——");
		System.out.println("b1|b2|b3");
		System.out.println("——+——+——");
		System.out.println("c1|c2|c3");
		System.out.println();
		do {
		// TODO Auto-generated method stub
System.out.println("Do you have to play with a friend?");
String lol = input.nextLine();
if(lol.equals("yes")) {
	Board ttt=new Board();
	System.out.println();
	ttt.printBoard();
	outer:
		for(int i=0; i<5; i++) {
		String back="game_begins";
		while((!back.equals(" "))&&(!(back.charAt(0)=='s'))) {
		System.out.println("player 'X' next move: ");
		String move=input.nextLine();
		System.out.println(back=ttt.move(move, 'X'));
		ttt.printBoard();
		}
		if(back.charAt(0)=='s') {
			break outer;
		}
		if(i!=4){
			String ok="game_begins";
			while((!ok.equals(" "))&&(!(ok.charAt(0)=='s'))) {
				System.out.println("player 'O' next move: ");
				String move=input.nextLine();
						System.out.println(ok=ttt.move(move, 'O'));
						ttt.printBoard();
				if(ok.charAt(0)=='s') {
					break outer;
				}
			}
		}
			}
	boolean draw=true;
	for(int i=0; i<9; i++) {
		if(ttt.leftSpots[i].equals("")) {
			
		}
		else {
			draw=false;
		}
	}
	if(draw) {
		System.out.println("Draw!");
	}
}
else {
	Board ttt=new Board();
	System.out.println("Select a level (1~5): ");
	int sel=5;
	try {
		sel=input.nextInt();
	}catch(InputMismatchException e) {
		System.out.println("Your level has been automatically set to level 5. Good Luck!");
		sel=5;
	}
	robot AI;
	if(sel<1) {
		sel=1;
	}
	if(sel>5) {
		sel=5;
	}
	switch(sel) {
	case 1:
		AI=new player_1_beginner();
		break;
	case 2:
		AI=new player_2_easy(ttt);
		break;
	case 3:
		AI=new player_3_normal(ttt);
		break;
	case 4:
		AI=new player_4_hard(ttt);
		break;
	case 5:
		AI=new player_5_impossible(ttt);
	break;

	default:
		AI=new player_5_impossible(ttt); 
	}	
	input.nextLine();
	ttt.printBoard();
	outer:
		for(int i=0; i<5; i++) {
		String back="game_begins";
		String move="none_moves";
		while((!back.equals(" "))&&(!(back.charAt(0)=='s'))) {
		System.out.println("your next move: ");
		move=input.nextLine();
			System.out.println(back=ttt.move(move, 'X'));
		ttt.printBoard();
		}
		if(AI instanceof player_5_impossible) {			
			if(i==0) {
				((player_5_impossible) AI).change1(move);
			}
			if(i==1) {
				((player_5_impossible) AI).change2(move);
			}
			if(i==2) {
				((player_5_impossible) AI).change3(move);
			}
		}
		if(back.charAt(0)=='s') {
			break outer;
		}
		if(i!=4){
			String ok;
			System.out.println(ok=ttt.move(AI.decision(), 'O'));
			if(ok.charAt(0)=='s') {
				ttt.printBoard();
				break outer;
			}
			ttt.printBoard();
				}
			}
	boolean draw=true;
	for(int i=0; i<9; i++) {
		if(ttt.leftSpots[i].equals("")) {
		}
		else {
			draw=false;
		}
	}
	if(draw) {
		System.out.println("Draw!");
	}
	}
	System.out.println("do you want to play another game?");
	again=input.nextLine();
		}while(again.equals("yes"));
}
}