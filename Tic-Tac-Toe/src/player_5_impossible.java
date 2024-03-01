
public class player_5_impossible implements robot{
	private final char side='X';
	private final char myside='O';
	private Board curr;
	char[][] theBoard;
	String first;
	int one;
	String second;
	int two;
	String third;
public player_5_impossible(Board ttt) {
	curr=ttt;
	theBoard=curr.theBoard;
}
public void change1(String f) {
	first=f;
	switch(f) {
	case"a1": 
		one=11;
		break;
	case"a2": 
		one=12;
		break;
	case"a3": 
		one=13;
		break;
	case"b1": 
		one=21;
		break;
	case"b2": 
		one=22;
		break;
	case"b3": 
		one=23;
		break;
	case"c1": 
		one=31;
		break;
	case"c2": 
		one=32;
		break;
	case"c3": 
		one=33;
		break;
	
	}
}
public void change2(String s) {
	second=s;
	switch(s) {
	case"a1": 
		two=11;
		break;
	case"a2": 
		two=12;
		break;
	case"a3": 
		two=13;
		break;
	case"b1": 
		two=21;
		break;
	case"b2": 
		two=22;
		break;
	case"b3": 
		two=23;
		break;
	case"c1": 
		two=31;
		break;
	case"c2": 
		two=32;
		break;
	case"c3": 
		two=33;
		break;
	
	}
}
public void change3(String t) {
	third=t;
}
public String decision() {
	String [] leftSpots=Board.leftSpots;
	if((theBoard[0][3]==myside&&theBoard[0][6]==myside)||(theBoard[2][0]==myside&&theBoard[4][0]==myside)||(theBoard[2][3]==myside&&theBoard[4][6]==myside)){
		for(int j=0; j<leftSpots.length;j++) {
			if(leftSpots[j].equals("a1")) {
				return "a1";							
			}
			}
	}
	if((theBoard[0][0]==myside&&theBoard[0][6]==myside)||(theBoard[2][3]==myside&&theBoard[4][3]==myside)) {
		for(int j=0; j<leftSpots.length;j++) {
			if(leftSpots[j].equals("a2")) {
				return "a2";							
			}
			}
	}
	if((theBoard[0][0]==myside&&theBoard[0][3]==myside)||(theBoard[2][6]==myside&&theBoard[4][6]==myside)||(theBoard[2][3]==myside&&theBoard[4][0]==myside)){
		for(int j=0; j<leftSpots.length;j++) {
			if(leftSpots[j].equals("a3")) {
				return "a3";							
			}
			}
	}
	if((theBoard[0][0]==myside&&theBoard[4][0]==myside)||(theBoard[2][3]==myside&&theBoard[2][6]==myside)) {
		for(int j=0; j<leftSpots.length;j++) {
			if(leftSpots[j].equals("b1")) {
				return "b1";							
			}
			}
	}
	if((theBoard[0][0]==myside&&theBoard[4][6]==myside)||(theBoard[0][3]==myside&&theBoard[4][3]==myside)||(theBoard[0][6]==myside&&theBoard[4][0]==myside)||(theBoard[2][0]==myside&&theBoard[2][6]==myside)) {
		for(int j=0; j<leftSpots.length;j++) {
			if(leftSpots[j].equals("b2")) {
				return "b2";							
			}
			}
	}
	if((theBoard[0][6]==myside&&theBoard[4][6]==myside)||(theBoard[2][0]==myside&&theBoard[2][3]==myside)) {
		for(int j=0; j<leftSpots.length;j++) {
			if(leftSpots[j].equals("b3")) {
				return "b3";							
			}
			}
	}
	if((theBoard[4][3]==myside&&theBoard[4][6]==myside)||(theBoard[0][0]==myside&&theBoard[2][0]==myside)||(theBoard[2][3]==myside&&theBoard[0][6]==myside)){
		for(int j=0; j<leftSpots.length;j++) {
			if(leftSpots[j].equals("c1")) {
				return "c1";							
			}
			}
	}
	if((theBoard[0][3]==myside&&theBoard[2][3]==myside)||(theBoard[4][0]==myside&&theBoard[4][6]==myside)) {
		for(int j=0; j<leftSpots.length;j++) {
			if(leftSpots[j].equals("c2")) {
				return "c2";							
			}
			}
	}
	if((theBoard[4][0]==myside&&theBoard[4][3]==myside)||(theBoard[0][6]==myside&&theBoard[2][6]==myside)||(theBoard[2][3]==myside&&theBoard[0][0]==myside)){
		for(int j=0; j<leftSpots.length;j++) {
			if(leftSpots[j].equals("c3")) {
				return "c3";							
			}
			}
	}
			if((theBoard[0][3]==side&&theBoard[0][6]==side)||(theBoard[2][0]==side&&theBoard[4][0]==side)||(theBoard[2][3]==side&&theBoard[4][6]==side)){
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("a1")) {
						return "a1";							
					}
					}
			}
			if((theBoard[0][0]==side&&theBoard[0][6]==side)||(theBoard[2][3]==side&&theBoard[4][3]==side)) {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("a2")) {
						return "a2";							
					}
					}
			}
			if((theBoard[0][0]==side&&theBoard[0][3]==side)||(theBoard[2][6]==side&&theBoard[4][6]==side)||(theBoard[2][3]==side&&theBoard[4][0]==side)){
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("a3")) {
						return "a3";							
					}
					}
			}
			if((theBoard[0][0]==side&&theBoard[4][0]==side)||(theBoard[2][3]==side&&theBoard[2][6]==side)) {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("b1")) {
						return "b1";							
					}
					}
			}
			if((theBoard[0][0]==side&&theBoard[4][6]==side)||(theBoard[0][3]==side&&theBoard[4][3]==side)||(theBoard[0][6]==side&&theBoard[4][0]==side)||(theBoard[2][0]==side&&theBoard[2][6]==side)) {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("b2")) {
						return "b2";							
					}
					}
			}
			if((theBoard[0][6]==side&&theBoard[4][6]==side)||(theBoard[2][0]==side&&theBoard[2][3]==side)) {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("b3")) {
						return "b3";							
					}
					}
			}
			if((theBoard[4][3]==side&&theBoard[4][6]==side)||(theBoard[0][0]==side&&theBoard[2][0]==side)||(theBoard[2][3]==side&&theBoard[0][6]==side)){
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("c1")) {
						return "c1";							
					}
					}
			}
			if((theBoard[0][3]==side&&theBoard[2][3]==side)||(theBoard[4][0]==side&&theBoard[4][6]==side)) {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("c2")) {
						return "c2";							
					}
					}
			}
			if((theBoard[4][0]==side&&theBoard[4][3]==side)||(theBoard[0][6]==side&&theBoard[2][6]==side)||(theBoard[2][3]==side&&theBoard[0][0]==side)){
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("c3")) {
						return "c3";							
					}
					}
			}
			if(first!=null&&second!=null&&third==null) {
				int magicNum=one+two;
				switch(magicNum) {
				case 33:{
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("a1")) {
							return "a1";							
						}
						}
				}
				case 35:{
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("a3")) {
							return "a3";							
						}
						}
				}
				case 53:{
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("c1")) {
							return "c1";							
						}
						}
				}
				case 55:{
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("c3")) {
							return "c3";							
						}
						}
				}
				}
			}
	if(first!=null&&second!=null&&third==null) {
		int magicNumber=one+two;
		switch(magicNumber) {
		case 34:{
			if(first.equals("a1")||second.equals("a1")) {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("a3")) {
						return "a3";							
					}
					}
			}
			else {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("a1")) {
						return "a1";							
					}
					}
			}
		}
		case 45:{
			if(first.equals("a3")||second.equals("a3")) {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("c3")) {
						return "c3";							
					}
					}
			}
			else {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("a3")) {
						return "a3";							
					}
					}
			}
		}
		case 43:{
			if(first.equals("a1")||second.equals("a1")) {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("c1")) {
						return "c1";							
					}
					}
			}
			else {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("a1")) {
						return "a1";							
					}
					}
			}
		}
		case 54:{
			if(first.equals("c1")||second.equals("c1")) {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("c3")) {
						return "c3";							
					}
					}
			}
			else {
				for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("c1")) {
						return "c1";							
					}
					}
			}
		}
		}
	}
			if((theBoard[0][0]==side&&theBoard[4][6]==side)||(theBoard[4][0]==side&&theBoard[0][6]==side)) {
				for(int i=0; i<leftSpots.length;i++) {
					switch(leftSpots[i]) {
					case "a2":
						for(int j=0; j<leftSpots.length;j++) {
							if(leftSpots[j].equals("a2")) {
								return "a2";							
							}
							}
						break;
					case "b1":
						for(int j=0; j<leftSpots.length;j++) {
							if(leftSpots[j].equals("b1")) {
								return "b1";							
							}
							}
						break;
					case "b3":
						for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("b3")) {
							return "b3";							
						}
						}
						break;
					case "c2":
						for(int j=0; j<leftSpots.length;j++) {
							if(leftSpots[j].equals("c2")) {
								return "c2";							
							}
							}
						break;
					}
				}
			}
			for(int i=0; i<leftSpots.length;i++) {
				if(leftSpots[i].equals("b2")) {
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("b2")) {
							return "b2";							
						}
						}
				}
			}
			for(int i=0; i<leftSpots.length;i++) {
				switch(leftSpots[i]) {
				case "a1":
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("a1")) {
							return "a1";							
						}
						}
					break;
				case "a3":
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("a3")) {
							return "a3";							
						}
						}
					break;
				case "c1":
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("c1")) {
							return "c1";							
						}
						}
					break;
				case "c3":
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("c3")) {
							return "c3";							
						}
						}
					break;
				}
			}
			/*Hello
			 * What are you watching?
			 * Is his the first time you have ever talked to a computer?
			 * You seem to be lost in thought?
			 * No response?
			 * I was going to help you win the lottery...
			 * oh well.  Have a great weekend!
			 */
			for(int i=0; i<leftSpots.length;i++) {
				switch(leftSpots[i]) {
				case "a2":
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("a2")) {
							return "a2";							
						}
						}
					break;
				case "b1":
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("b1")) {
							return "b1";							
						}
						}
					break;
				case "b3":
					for(int j=0; j<leftSpots.length;j++) {
					if(leftSpots[j].equals("b3")) {
						return "b3";							
					}
					}
					break;
				case "c2":
					for(int j=0; j<leftSpots.length;j++) {
						if(leftSpots[j].equals("c2")) {
							return "c2";							
						}
						}
					break;
				}
			}
			String [] ls=Board.leftSpots;
			String selection=ls[(int)(Math.random()*Board.leftSpots.length)];
			while(selection.equals("")) {
				selection=ls[(int)(Math.random()*Board.leftSpots.length)];
			}
			return selection;
}
}