
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainWindow {

	private JFrame frame;	
	public static Board ttt=new Board();
	public static robot AI = new player_5_impossible(ttt);;
	public int moveNum=0;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}
	public void restart() {
		frame.setVisible(false);
		ttt = new Board();
		 String[] newLeftSpots={"a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3"};
		ttt.leftSpots=newLeftSpots;
		AI = new player_5_impossible(ttt);;
		moveNum = 0;
		textField=null;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Tic Tac Toe");
		frame.setBounds(608, 156, 352, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(50, 20, 80, 80);
		btnNewButton.setBackground(Color.white);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBounds(130, 20, 80, 80);
		button.setBackground(Color.white);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(210, 20, 80, 80);
		button_1.setBackground(Color.white);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(50, 100, 80, 80);
		button_2.setBackground(Color.white);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(130, 100, 80, 80);
		button_3.setBackground(Color.white);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBounds(210, 100, 80, 80);
		button_4.setBackground(Color.white);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBounds(50, 180, 80, 80);
		button_5.setBackground(Color.white);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBounds(130, 180, 80, 80);
		button_6.setBackground(Color.white);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBounds(210, 180, 80, 80);
		button_7.setBackground(Color.white);
		frame.getContentPane().add(button_7);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(50, 274, 240, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton_1 = new JButton("Restart");
		btnNewButton_1.setBounds(110, 299, 120, 25);
		frame.getContentPane().add(btnNewButton_1);

		
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				restart();
			}
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String back;
				back=ttt.move("a1", 'X');
				btnNewButton.setVisible(false);
				frame.getContentPane().remove(btnNewButton);
				JLabel label1 = new JLabel("X");
				label1.setFont(new Font("Tahoma", Font.PLAIN, 80));
				label1.setBounds(50, 20, 80, 80);
				label1.setBorder(BorderFactory.createLineBorder(Color.black));
				frame.getContentPane().add(label1);
				if(moveNum==0) {
					((player_5_impossible) AI).change1("a1");
				}
				if(moveNum==1) {
					((player_5_impossible) AI).change2("a1");
				}
				if(moveNum==2) {
					((player_5_impossible) AI).change3("a1");
				}
				textField.setText("");
				if(back.charAt(0)=='s') {
					textField.setText("You win!");

					btnNewButton.setVisible(false);
					button.setVisible(false);
					button_1.setVisible(false);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
					
				}
				if(moveNum==4) {
					textField.setText("Draw");
					
				}
				if(moveNum<4){
					String ok;
					String AIMove=AI.decision();
					ok=ttt.move(AIMove, 'O');
					switch(AIMove) {
					case "a1":{
						btnNewButton.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a2":{
						button.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a3":{
						button_1.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b1":{
						button_2.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b2":{
						button_3.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b3":{
						button_4.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c1":{
						button_5.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c2":{
						button_6.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c3":{
						button_7.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
				}
					if(ok.charAt(0)=='s') {
						textField.setText("Robot Wins!");

						btnNewButton.setVisible(false);
						button.setVisible(false);
						button_1.setVisible(false);
						button_2.setVisible(false);
						button_3.setVisible(false);
						button_4.setVisible(false);
						button_5.setVisible(false);
						button_6.setVisible(false);
						button_7.setVisible(false);
					}
						}
				moveNum++;
			}
		});
		
		
		
		
		
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String back;
				back=ttt.move("a2", 'X');
				button.setVisible(false);
				frame.getContentPane().remove(button);
				JLabel label1 = new JLabel("X");
				label1.setFont(new Font("Tahoma", Font.PLAIN, 80));
				label1.setBounds(130, 20, 80, 80);
				label1.setBorder(BorderFactory.createLineBorder(Color.black));
				frame.getContentPane().add(label1);
				if(moveNum==0) {
					((player_5_impossible) AI).change1("a2");
				}
				if(moveNum==1) {
					((player_5_impossible) AI).change2("a2");
				}
				if(moveNum==2) {
					((player_5_impossible) AI).change3("a2");
				}
				textField.setText("");
				if(back.charAt(0)=='s') {
					textField.setText("You win!");

					btnNewButton.setVisible(false);
					button.setVisible(false);
					button_1.setVisible(false);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
				}
				if(moveNum==4) {
					textField.setText("Draw");
					
				}
				if(moveNum<4){
					String ok;
					String AIMove=AI.decision();
					ok=ttt.move(AIMove, 'O');
					switch(AIMove) {
					case "a1":{
						btnNewButton.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a2":{
						button.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a3":{
						button_1.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b1":{
						button_2.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b2":{
						button_3.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b3":{
						button_4.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c1":{
						button_5.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c2":{
						button_6.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c3":{
						button_7.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
				}
					if(ok.charAt(0)=='s') {
						textField.setText("Robot Wins!");

						btnNewButton.setVisible(false);
						button.setVisible(false);
						button_1.setVisible(false);
						button_2.setVisible(false);
						button_3.setVisible(false);
						button_4.setVisible(false);
						button_5.setVisible(false);
						button_6.setVisible(false);
						button_7.setVisible(false);
					}
						}
				moveNum++;
			}
		});
		
		
		
		
		
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String back;
				back=ttt.move("a3", 'X');
				button_1.setVisible(false);
				frame.getContentPane().remove(button_1);
				JLabel label1 = new JLabel("X");
				label1.setFont(new Font("Tahoma", Font.PLAIN, 80));
				label1.setBounds(210, 20, 80, 80);
				label1.setBorder(BorderFactory.createLineBorder(Color.black));
				frame.getContentPane().add(label1);
				if(moveNum==0) {
					((player_5_impossible) AI).change1("a3");
				}
				if(moveNum==1) {
					((player_5_impossible) AI).change2("a3");
				}
				if(moveNum==2) {
					((player_5_impossible) AI).change3("a3");
				}
				textField.setText("");
				if(back.charAt(0)=='s') {
					textField.setText("You win!");

					btnNewButton.setVisible(false);
					button.setVisible(false);
					button_1.setVisible(false);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
				}
				if(moveNum==4) {
					textField.setText("Draw");
					
				}
				if(moveNum<4){
					String ok;
					String AIMove=AI.decision();
					ok=ttt.move(AIMove, 'O');
					switch(AIMove) {
					case "a1":{
						btnNewButton.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a2":{
						button.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a3":{
						button_1.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b1":{
						button_2.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b2":{
						button_3.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b3":{
						button_4.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c1":{
						button_5.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c2":{
						button_6.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c3":{
						button_7.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
				}
					if(ok.charAt(0)=='s') {
						textField.setText("Robot Wins!");

						btnNewButton.setVisible(false);
						button.setVisible(false);
						button_1.setVisible(false);
						button_2.setVisible(false);
						button_3.setVisible(false);
						button_4.setVisible(false);
						button_5.setVisible(false);
						button_6.setVisible(false);
						button_7.setVisible(false);
					}
						}
				moveNum++;
			}
		});
		
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String back;
				back=ttt.move("b1", 'X');
				button_2.setVisible(false);
				frame.getContentPane().remove(button_2);
				JLabel label1 = new JLabel("X");
				label1.setFont(new Font("Tahoma", Font.PLAIN, 80));
				label1.setBounds(50, 100, 80, 80);
				label1.setBorder(BorderFactory.createLineBorder(Color.black));
				frame.getContentPane().add(label1);
				if(moveNum==0) {
					((player_5_impossible) AI).change1("b1");
				}
				if(moveNum==1) {
					((player_5_impossible) AI).change2("b1");
				}
				if(moveNum==2) {
					((player_5_impossible) AI).change3("b1");
				}
				textField.setText("");
				if(back.charAt(0)=='s') {
					textField.setText("You win!");

					btnNewButton.setVisible(false);
					button.setVisible(false);
					button_1.setVisible(false);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
				}
				if(moveNum==4) {
					textField.setText("Draw");
					
				}
				if(moveNum<4){
					String ok;
					String AIMove=AI.decision();
					ok=ttt.move(AIMove, 'O');
					switch(AIMove) {
					case "a1":{
						btnNewButton.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a2":{
						button.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a3":{
						button_1.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b1":{
						button_2.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b2":{
						button_3.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b3":{
						button_4.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c1":{
						button_5.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c2":{
						button_6.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c3":{
						button_7.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
				}
					if(ok.charAt(0)=='s') {
						textField.setText("Robot Wins!");

						btnNewButton.setVisible(false);
						button.setVisible(false);
						button_1.setVisible(false);
						button_2.setVisible(false);
						button_3.setVisible(false);
						button_4.setVisible(false);
						button_5.setVisible(false);
						button_6.setVisible(false);
						button_7.setVisible(false);
					}
						}
				moveNum++;
			}
		});
		
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String back;
				back=ttt.move("b2", 'X');
				button_3.setVisible(false);
				frame.getContentPane().remove(button_3);
				JLabel label1 = new JLabel("X");
				label1.setFont(new Font("Tahoma", Font.PLAIN, 80));
				label1.setBounds(130, 100, 80, 80);
				label1.setBorder(BorderFactory.createLineBorder(Color.black));
				frame.getContentPane().add(label1);
				if(moveNum==0) {
					((player_5_impossible) AI).change1("b2");
				}
				if(moveNum==1) {
					((player_5_impossible) AI).change2("b2");
				}
				if(moveNum==2) {
					((player_5_impossible) AI).change3("b2");
				}
				textField.setText("");
				if(back.charAt(0)=='s') {
					textField.setText("You win!");

					btnNewButton.setVisible(false);
					button.setVisible(false);
					button_1.setVisible(false);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
				}
				if(moveNum==4) {
					textField.setText("Draw");
					
				}
				if(moveNum<4){
					String ok;
					String AIMove=AI.decision();
					ok=ttt.move(AIMove, 'O');
					switch(AIMove) {
					case "a1":{
						btnNewButton.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a2":{
						button.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a3":{
						button_1.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b1":{
						button_2.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b2":{
						button_3.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b3":{
						button_4.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c1":{
						button_5.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c2":{
						button_6.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c3":{
						button_7.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
				}
					if(ok.charAt(0)=='s') {
						textField.setText("Robot Wins!");

						btnNewButton.setVisible(false);
						button.setVisible(false);
						button_1.setVisible(false);
						button_2.setVisible(false);
						button_3.setVisible(false);
						button_4.setVisible(false);
						button_5.setVisible(false);
						button_6.setVisible(false);
						button_7.setVisible(false);
					}
						}
				moveNum++;
			}
		});
		
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String back;
				back=ttt.move("b3", 'X');
				button_4.setVisible(false);
				frame.getContentPane().remove(button_4);
				JLabel label1 = new JLabel("X");
				label1.setFont(new Font("Tahoma", Font.PLAIN, 80));
				label1.setBounds(210, 100, 80, 80);
				label1.setBorder(BorderFactory.createLineBorder(Color.black));
				frame.getContentPane().add(label1);
				if(moveNum==0) {
					((player_5_impossible) AI).change1("b3");
				}
				if(moveNum==1) {
					((player_5_impossible) AI).change2("b3");
				}
				if(moveNum==2) {
					((player_5_impossible) AI).change3("b3");
				}
				textField.setText("");
				if(back.charAt(0)=='s') {
					textField.setText("");

					btnNewButton.setVisible(false);
					button.setVisible(false);
					button_1.setVisible(false);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
				}
				if(moveNum==4) {
					textField.setText("Draw");
					
				}
				if(moveNum<4){
					String ok;
					String AIMove=AI.decision();
					ok=ttt.move(AIMove, 'O');
					switch(AIMove) {
					case "a1":{
						btnNewButton.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a2":{
						button.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a3":{
						button_1.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b1":{
						button_2.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b2":{
						button_3.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b3":{
						button_4.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c1":{
						button_5.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c2":{
						button_6.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c3":{
						button_7.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
				}
					if(ok.charAt(0)=='s') {
						textField.setText("Robot Wins!");

						btnNewButton.setVisible(false);
						button.setVisible(false);
						button_1.setVisible(false);
						button_2.setVisible(false);
						button_3.setVisible(false);
						button_4.setVisible(false);
						button_5.setVisible(false);
						button_6.setVisible(false);
						button_7.setVisible(false);
					}
						}
				moveNum++;
			}
		});
		
		
		
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String back;
				back=ttt.move("c1", 'X');
				button_5.setVisible(false);
				frame.getContentPane().remove(button_5);
				JLabel label1 = new JLabel("X");
				label1.setFont(new Font("Tahoma", Font.PLAIN, 80));
				label1.setBounds(50, 180, 80, 80);
				label1.setBorder(BorderFactory.createLineBorder(Color.black));
				frame.getContentPane().add(label1);
				if(moveNum==0) {
					((player_5_impossible) AI).change1("c1");
				}
				if(moveNum==1) {
					((player_5_impossible) AI).change2("c1");
				}
				if(moveNum==2) {
					((player_5_impossible) AI).change3("c1");
				}
				textField.setText("");
				if(back.charAt(0)=='s') {
					textField.setText("You win!");

					btnNewButton.setVisible(false);
					button.setVisible(false);
					button_1.setVisible(false);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
				}
				if(moveNum==4) {
					textField.setText("Draw");
					
				}
				if(moveNum<4){
					String ok;
					String AIMove=AI.decision();
					ok=ttt.move(AIMove, 'O');
					switch(AIMove) {
					case "a1":{
						btnNewButton.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a2":{
						button.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a3":{
						button_1.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b1":{
						button_2.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b2":{
						button_3.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b3":{
						button_4.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c1":{
						button_5.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c2":{
						button_6.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c3":{
						button_7.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
				}
					if(ok.charAt(0)=='s') {
						textField.setText("Robot Wins!");

						btnNewButton.setVisible(false);
						button.setVisible(false);
						button_1.setVisible(false);
						button_2.setVisible(false);
						button_3.setVisible(false);
						button_4.setVisible(false);
						button_5.setVisible(false);
						button_6.setVisible(false);
						button_7.setVisible(false);
					}
						}
				moveNum++;
			}
		});
		
		
		
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String back;
				back=ttt.move("c2", 'X');
				button_6.setVisible(false);
				frame.getContentPane().remove(button_6);
				JLabel label1 = new JLabel("X");
				label1.setFont(new Font("Tahoma", Font.PLAIN, 80));
				label1.setBounds(130, 180, 80, 80);
				label1.setBorder(BorderFactory.createLineBorder(Color.black));
				frame.getContentPane().add(label1);
				if(moveNum==0) {
					((player_5_impossible) AI).change1("c2");
				}
				if(moveNum==1) {
					((player_5_impossible) AI).change2("c2");
				}
				if(moveNum==2) {
					((player_5_impossible) AI).change3("c2");
				}
				textField.setText("");
				if(back.charAt(0)=='s') {
					textField.setText("You win!");

					btnNewButton.setVisible(false);
					button.setVisible(false);
					button_1.setVisible(false);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
				}
				if(moveNum==4) {
					textField.setText("Draw");
					
				}
				if(moveNum<4){
					String ok;
					String AIMove=AI.decision();
					ok=ttt.move(AIMove, 'O');
					switch(AIMove) {
					case "a1":{
						btnNewButton.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a2":{
						button.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a3":{
						button_1.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b1":{
						button_2.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b2":{
						button_3.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b3":{
						button_4.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c1":{
						button_5.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c2":{
						button_6.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c3":{
						button_7.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
				}
					if(ok.charAt(0)=='s') {
						textField.setText("Robot Wins!");

						btnNewButton.setVisible(false);
						button.setVisible(false);
						button_1.setVisible(false);
						button_2.setVisible(false);
						button_3.setVisible(false);
						button_4.setVisible(false);
						button_5.setVisible(false);
						button_6.setVisible(false);
						button_7.setVisible(false);
					}
						}
				moveNum++;
			}
		});
		
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String back;
				back=ttt.move("c3", 'X');
				button_7.setVisible(false);
				frame.getContentPane().remove(button_7);
				JLabel label1 = new JLabel("X");
				label1.setFont(new Font("Tahoma", Font.PLAIN, 80));
				label1.setBounds(210, 180, 80, 80);
				label1.setBorder(BorderFactory.createLineBorder(Color.black));
				frame.getContentPane().add(label1);
				if(moveNum==0) {
					((player_5_impossible) AI).change1("c3");
				}
				if(moveNum==1) {
					((player_5_impossible) AI).change2("c3");
				}
				if(moveNum==2) {
					((player_5_impossible) AI).change3("c3");
				}
				textField.setText("");
				if(back.charAt(0)=='s') {
					textField.setText("You win!");

					btnNewButton.setVisible(false);
					button.setVisible(false);
					button_1.setVisible(false);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
				}
				if(moveNum==4) {
					textField.setText("Draw");
					
				}
				if(moveNum<4){
					String ok;
					String AIMove=AI.decision();
					ok=ttt.move(AIMove, 'O');
					switch(AIMove) {
					case "a1":{
						btnNewButton.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a2":{
						button.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "a3":{
						button_1.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 20, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b1":{
						button_2.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b2":{
						button_3.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "b3":{
						button_4.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 100, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c1":{
						button_5.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(50, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c2":{
						button_6.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(130, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
					case "c3":{
						button_7.setVisible(false);
						JLabel label2 = new JLabel("O");
						label2.setFont(new Font("Tahoma", Font.PLAIN, 80));
						label2.setBounds(210, 180, 80, 80);
						label2.setBorder(BorderFactory.createLineBorder(Color.black));
						frame.getContentPane().add(label2);
						break;
					}
				}
					if(ok.charAt(0)=='s') {
						textField.setText("Robot Wins!");

						btnNewButton.setVisible(false);
						button.setVisible(false);
						button_1.setVisible(false);
						button_2.setVisible(false);
						button_3.setVisible(false);
						button_4.setVisible(false);
						button_5.setVisible(false);
						button_6.setVisible(false);
						button_7.setVisible(false);
					}
						}
				moveNum++;
			}
		});
		
	}
}
