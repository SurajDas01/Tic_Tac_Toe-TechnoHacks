import javax.swing.*;
import java.awt.event.*;
class TTgame extends JFrame
{
	int k=0,l,count=0;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b;
	JTextField tf;
	public TTgame(String s)
	{
		super (s);
	}
	public void setComponent()
	{
		b1=new JButton("");
		b1.setBounds(13,13,90,90);
		add(b1);

		b2=new JButton("");
		b2.setBounds(110,13,90,90);
		add(b2);

		b3=new JButton("");
		b3.setBounds(207,13,90,90);
		add(b3);
		b4=new JButton("");
		b4.setBounds(13,110,90,90);
		add(b4);
		b5=new JButton("");
		b5.setBounds(110,110,90,90);
		add(b5);
		b6=new JButton("");
		b6.setBounds(207,110,90,90);
		add(b6);
		b7=new JButton("");
		b7.setBounds(13,207,90,90);
		add(b7);
		b8=new JButton("");
		b8.setBounds(110,207,90,90);
		add(b8);
		b9=new JButton("");
		b9.setBounds(207,207,90,90);
		add(b9);
		b=new JButton("Start New Game");
		b.setBounds(90,320,130,30);
		add(b);
		tf=new JTextField();
		tf.setBounds(20,370,250,30);
		tf.setEditable(false);
		add(tf);
		b1.addActionListener(new A1());
		b2.addActionListener(new A2());
		b3.addActionListener(new A3());
		b4.addActionListener(new A4());
		b5.addActionListener(new A5());
		b6.addActionListener(new A6());
		b7.addActionListener(new A7());
		b8.addActionListener(new A8());
		b9.addActionListener(new A9());
		b.addActionListener(new A());

	}
	public void setEnable()
	{
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}
	public int check()
	{
		count++;
		if(b1.getText()=="x" && b2.getText()=="x"&&b3.getText()=="x")
			return 1;
		else if(b1.getText()=="x" && b4.getText()=="x"&& b7.getText()=="x")
			return 1;
		else if(b1.getText()=="x" && b5.getText()=="x"&& b9.getText()=="x")
			return 1;
		else if(b2.getText()=="x" && b5.getText()=="x"&& b8.getText()=="x")
			return 1;
		else if(b3.getText()=="x" && b6.getText()=="x"&& b9.getText()=="x")
			return 1;
		else if(b3.getText()=="x" && b5.getText()=="x"&& b7.getText()=="x")
			return 1;
		else if(b4.getText()=="x" && b5.getText()=="x"&& b6.getText()=="x")
			return 1;
		else if(b7.getText()=="x" && b8.getText()=="x"&&b9.getText()=="x")
			return 1;

		else if(b1.getText()=="0"&&b2.getText()=="0"&&b3.getText()=="0")
			return 2;
		else if(b1.getText()=="0"&&b4.getText()=="0"&&b7.getText()=="0")
			return 2;
		else if(b1.getText()=="0"&&b5.getText()=="0"&&b9.getText()=="0")
			return 2;
		
		else if(b2.getText()=="0"&&b5.getText()=="0"&&b8.getText()=="0")
			return 2;
		
		else if(b3.getText()=="0"&&b6.getText()=="0"&&b9.getText()=="0")
			return 2;
		else if(b3.getText()=="0"&&b5.getText()=="0"&&b7.getText()=="0")
			return 2;
		
		else if(b4.getText()=="0"&&b5.getText()=="0"&&b6.getText()=="0")
			return 2;
		
		else if(b7.getText()=="0"&&b8.getText()=="0"&&b9.getText()=="0")
			return 2;

		else
		{
			if(count==9)
				tf.setText("game draw");
			return 3;
		}

	}
		
	class A implements ActionListener
	{
		public void actionPerformed(ActionEvent e)		
		{
			 k=0;l=0;count=0;
			b1.setText("");
			b2.setText("");
			b3.setText("");
			b4.setText("");
			b5.setText("");
			b6.setText("");
			b7.setText("");
			b8.setText("");
			b9.setText("");
			tf.setText("");
			b1.setEnabled(true);
			b2.setEnabled(true);	
			b3.setEnabled(true);	
			b4.setEnabled(true);	
			b5.setEnabled(true);	
			b6.setEnabled(true);	
			b7.setEnabled(true);	
			b8.setEnabled(true);
			b9.setEnabled(true);				
		}
	}
	class A1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(k==0)
			{
				b1.setText("x");
				b1.setEnabled(false);
				k=1;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
				}
				
			}
			else{
				b1.setText("0");
				b1.setEnabled(false);
				k=0;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
			}
			else;
		}
	}
}
	class A2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(k==0)
			{
				b2.setText("x");
				b2.setEnabled(false);

				k=1;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
				}
				
			}
			else{
				b2.setText("0");
				b2.setEnabled(false);
				k=0;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
			}
			else;
		}
	}
}
	class A3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(k==0)
			{
				b3.setText("x");
				b3.setEnabled(false);

				k=1;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
				}
				
			}
			else{
				b3.setText("0");
				b3.setEnabled(false);
				k=0;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
			}
			else;
		}
	}
}
	class A4 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(k==0)
			{
				b4.setText("x");
				b4.setEnabled(false);

				k=1;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
				}
				
			}
			else{
				b4.setText("0");
				b4.setEnabled(false);
				k=0;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
			}
			else;
		}
	}
}
	class A5 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(k==0)
			{
				b5.setText("x");
				b5.setEnabled(false);

				k=1;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
				}
				
			}
			else{
				b5.setText("0");
				b5.setEnabled(false);
				k=0;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
			}
			else;
		}
	}
}
	class A6 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(k==0)
			{
				b6.setText("x");
				b6.setEnabled(false);

				k=1;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
				}
				
			}
			else{
				b6.setText("0");
				b6.setEnabled(false);
				k=0;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
			}
			else;
		}
	}
}
	class A7 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(k==0)
			{
				b7.setText("x");
				b7.setEnabled(false);

				k=1;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
				}
			
			}
			else{
				b7.setText("0");
				b7.setEnabled(false);
				k=0;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
			}
			else;
		}
	}
}
	class A8 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(k==0)
			{
				b8.setText("x");
				b8.setEnabled(false);

				k=1;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
				}
			
			}
			else{
				b8.setText("0");
				b8.setEnabled(false);
				k=0;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
			}
			else;
		}
	}
}
	class A9 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(k==0)
			{
				b9.setText("x");
				b9.setEnabled(false);

				k=1;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
				}
				
			}
			else{
				b9.setText("0");
				b9.setEnabled(false);
				k=0;
				l=check();				
				if(l==1)
				{
					tf.setText("player 1 won");
					setEnable();
				}
				else if(l==2)
				{
					tf.setText("player 2 won");
					setEnable();
			}
			else;
		}
	}
}


	public static void main(String[] args)
	{
		TTgame jf=new TTgame("Tic_Tac_Toe");
		jf.setVisible(true);
		jf.setSize(325,450);
		jf.setLocation(100,100);
		jf.setResizable(false);
		jf.setLayout(null);
		jf.setComponent();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}