import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
class Main extends JFrame{
	//0 = Rock, 1 = Paper, 2 = Scissor
	Integer choice;
	Random rand = new Random();
	Game gum = new Game();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	int wins,losses,ties;
	JLabel wlabel = new JLabel();
	JLabel llabel = new JLabel();
	JLabel tlabel = new JLabel();
	public Main(){
		super("Rock, Paper, Scissor");
		setSize(800,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setLayout(null);
		label.setBounds(300, 400, 150, 50);
		label2.setBounds(270,150,200, 50);
		wlabel.setBounds(0, 0, 100, 50);
		llabel.setBounds(60,0,100, 50);
		tlabel.setBounds(130,0,100, 50);

		JButton Rock = new JButton("Rock");
		Rock.setBounds(200, 300, 100, 50);
		Rock.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				choice = 0;
				System.out.println(choice);
				ResLabel(panel);
			}

		});

		JButton Paper = new JButton("Paper");
		Paper.setBounds(310, 300, 100, 50);
		Paper.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				choice = 1;
				System.out.println(choice);
				ResLabel(panel);
			}
		});

		JButton Scissor = new JButton("Scissor");
		Scissor.setBounds(420, 300, 100, 50);
		Scissor.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				choice = 2;
				System.out.println(choice);
				ResLabel(panel);
			}
		});

		panel.add(Rock);
		panel.add(Paper);
		panel.add(Scissor);
		this.getContentPane().add(panel);

	}
	public void ResLabel(JPanel panel){
		int opponentChoice = rand.nextInt(3);
		label2.setText("Your Opponent chose: " + gum.OpponentResult(opponentChoice));
		WinState result = gum.GameResult(choice,opponentChoice);
		label.setText("The Game is a " + result);
		switch(result){
			case Win:
				wins++;
				break;
			case Loss:
				losses++;
				break;
			case Tie:
				ties++;
				break;
			default:
				break;
		}

		wlabel.setText("Wins: " + wins);
		llabel.setText("Losses: " + losses);
		tlabel.setText("Ties: " + ties);
		panel.add(label);
		panel.add(label2);
		panel.add(wlabel);
		panel.add(llabel);
		panel.add(tlabel);
		this.getContentPane().add(panel);
		this.repaint();
	}
	public static void main(String[] args){
		System.out.println("Rock, Paper, Scissors? What shall it be?");
		new Main();

	}
}
