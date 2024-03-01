
public class Board {
protected char[][] theBoard;
public static String [] leftSpots={"a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3"};
public Board() {
	theBoard=new char[5][8];
	theBoard[0][2]='|';
	theBoard[0][5]='|';
	theBoard[1][0]='—';
	theBoard[1][1]='—';
	theBoard[1][2]='+';
	theBoard[1][3]='—';
	theBoard[1][4]='—';
	theBoard[1][5]='+';
	theBoard[1][6]='—';	
	theBoard[1][7]='—';
	theBoard[2][2]='|';
	theBoard[2][5]='|';
	theBoard[3][0]='—';
	theBoard[3][1]='—';
	theBoard[3][2]='+';
	theBoard[3][3]='—';
	theBoard[3][4]='—';
	theBoard[3][5]='+';
	theBoard[3][6]='—';	
	theBoard[3][7]='—';
	theBoard[4][2]='|';
	theBoard[4][5]='|';
}
public void printBoard() {
	for(int i=0; i<5; i++) {
		for(int j=0; j<8; j++) {
			System.out.print(theBoard[i][j]);
		}
		System.out.println();
	}
	System.out.println();
}
public void resetBoard() {
	leftSpots[0]="a1";
	leftSpots[1]="a2";
	leftSpots[2]="a3";
	leftSpots[3]="b1";
	leftSpots[4]="b2";
	leftSpots[5]="b3";
	leftSpots[6]="c1";
	leftSpots[7]="c2";
	leftSpots[8]="c3";
} 
public String move(String order, char side) {
	boolean er=false;
	for(int i=0; i<9;i++) {
		if(order.equals(leftSpots[i])) {
			er=true;
			break;
		}
	}
	if(er) {
	for(int i=0; i<9; i++) {
		if(order.equals(leftSpots[i])) {
			switch(order) {
			case"a1": 
				theBoard[0][0]=side;
				leftSpots[0]="";
				if((theBoard[0][3]==side&&theBoard[0][6]==side)||(theBoard[2][0]==side&&theBoard[4][0]==side)||(theBoard[2][3]==side&&theBoard[4][6]==side)){
					return "side: "+side+" wins";
				}
				break;
			case"a2": 
				theBoard[0][3]=side;
				leftSpots[1]="";
				if((theBoard[0][0]==side&&theBoard[0][6]==side)||(theBoard[2][3]==side&&theBoard[4][3]==side)) {
					return "side: "+side+" wins";
				}
				break;
			case"a3": 
				theBoard[0][6]=side;
				leftSpots[2]="";
				if((theBoard[0][0]==side&&theBoard[0][3]==side)||(theBoard[2][6]==side&&theBoard[4][6]==side)||(theBoard[2][3]==side&&theBoard[4][0]==side)){
					return "side: "+side+" wins";
				}
				break;
			case"b1": 
				theBoard[2][0]=side;
				leftSpots[3]="";
				if((theBoard[0][0]==side&&theBoard[4][0]==side)||(theBoard[2][3]==side&&theBoard[2][6]==side)) {
					return "side: "+side+" wins";
				}
				break;
			case"b2": 
				theBoard[2][3]=side;
				leftSpots[4]="";
				if((theBoard[0][0]==side&&theBoard[4][6]==side)||(theBoard[0][3]==side&&theBoard[4][3]==side)||(theBoard[0][6]==side&&theBoard[4][0]==side)||(theBoard[2][0]==side&&theBoard[2][6]==side)) {
					return "side: "+side+" wins";
				}
				break;
			case"b3": 
				theBoard[2][6]=side;
				leftSpots[5]="";
				if((theBoard[0][6]==side&&theBoard[4][6]==side)||(theBoard[2][0]==side&&theBoard[2][3]==side)) {
					return "side: "+side+" wins";
				}
				break;
			case"c1": 
				theBoard[4][0]=side;
				leftSpots[6]="";
				if((theBoard[4][3]==side&&theBoard[4][6]==side)||(theBoard[0][0]==side&&theBoard[2][0]==side)||(theBoard[2][3]==side&&theBoard[0][6]==side)){
					return "side: "+side+" wins";
				}
				break;
			case"c2": 
				theBoard[4][3]=side;
				leftSpots[7]="";
				if((theBoard[0][3]==side&&theBoard[2][3]==side)||(theBoard[4][0]==side&&theBoard[4][6]==side)) {
					return "side: "+side+" wins";
				}
				break;
			case"c3": 
				theBoard[4][6]=side;
				leftSpots[8]="";
				if((theBoard[4][0]==side&&theBoard[4][3]==side)||(theBoard[0][6]==side&&theBoard[2][6]==side)||(theBoard[2][3]==side&&theBoard[0][0]==side)){
					return "side: "+side+" wins";
				}
				break;
			}
			return " ";
			}		
		}
	return "this spot is not available, please pick another one";
	}
		return "invalid position, please pick other legal spots ";
	}
}