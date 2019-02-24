class Game{
	WinState winChart[][] = new WinState[3][3];
	Game(){
		// 0 = Rock, 1 = Paper, 2 = Scissor
		winChart[0][0] = WinState.Tie;
		winChart[0][1] = WinState.Loss;
		winChart[0][2] = WinState.Win;
		winChart[1][0] = WinState.Win;
		winChart[1][1] = WinState.Tie;
		winChart[1][2] = WinState.Loss;
		winChart[2][0] = WinState.Loss;
		winChart[2][1] = WinState.Win;
		winChart[2][2] = WinState.Tie;
	}
	public WinState GameResult(int yourChoice, int opponentChoice) {
		WinState GameResult = winChart[yourChoice][opponentChoice];
		return GameResult;
	}
	public String OpponentResult(int opponentChoice){
		String Choice;
		switch(opponentChoice){
			case 0:
				Choice = "Rock";
				break;
			case 1:
				Choice = "Paper";
				break;
			case 2:
				Choice = "Scissor";
				break;
			default:
				Choice = "Something, an error has occured so i don't know what";
				break;
		}
		return Choice;
	}
}
