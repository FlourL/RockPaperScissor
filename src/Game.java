class Game{
	WinState winChart[][] = new boolean[3][3];
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
	public boolean GameResult(int yourChoice, int opponentChoice){
		WinState GameResult = winChart[yourChoice][opponentChoice];
		Return GameResult;
	}
}
