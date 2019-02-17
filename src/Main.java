import javax.swing.JFrame;
class Main extends JFrame{
	public Main(){
		super("Rock, Paper, Scissor");
		setSize(800,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	public static void main(String[] args){
		System.out.println("Rock, Paper, Scissors? What shall it be?");
		new Main();
		
	}
}
