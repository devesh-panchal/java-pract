import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener{
	String Username=new String("abc");
	String Password=new String("pass");
	TextField tf1,tf2,tf3,us,pwd;
	Button add,sub,mul,div,rem,exit,submit,close;
	Label user,pass,display;
	public Calculator(int a){
		setLayout(null);
		setBackground(Color.red);
		
		display=new Label("Username:abc | Password:pass");
		user=new Label("USERNAME : ");
		pass=new Label("PASSWORD : ");
		us=new TextField(10);
		pwd=new TextField(10);
		submit=new Button("SUBMIT");
		close=new Button("Close");
		
		display.setBounds(90,90,250,30);
		user.setBounds(90,130,80,30);
		us.setBounds(175,130,80,30);
		pass.setBounds(90,170,80,30);
		pwd.setBounds(175,170,80,30);
		submit.setBounds(150,250,90,30);
        close.setBounds(150,300,90,30);  		
		submit.addActionListener(this);
		
		add(close);
		add(display);
		add(user);
		add(us);
		add(pass);
		add(pwd);
		add(submit);
		this.setSize(500,500);
		setVisible(true);
	}
	public Calculator(){
		setLayout(new GridLayout(6,2,25,25));
		setBackground(Color.gray);
		tf1=new TextField(10);
		tf2=new TextField(10);
		tf3=new TextField(10);
		
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		rem=new Button("%");
		exit=new Button("EXIT");
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		rem.addActionListener(this);
		exit.addActionListener(this);
		
		tf3.setEditable(false);
		
		add(new Label("Enter The Number"));
		add(tf1);
		add(new Label("Enter The Number"));
		add(tf2);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(rem);
		add(exit);
		add(new Label("Result"));
		add(tf3);
		setTitle("Calculator");
		setSize(450,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		Button btn=(Button)e.getSource();
		String a=us.getText();
		new Calculator();
		if(btn==close){
		 System.exit(0);
		}
		if(btn==submit){
			if(a=="abc" && pwd.getText()=="pass"){
				this.setVisible(false);
				new Calculator();
			}
		 if(pwd.getText()!=Password){
				us.setText("WRONG USERNAME");
			}
		if(a!=Username){
				pwd.setText("WRONG PASSWORD");
			}	
			
		}
		if(btn==exit){
			this.setVisible(false);    
			dispose();
	System.exit(0);	

		}
		String s1=tf1.getText();
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(tf2.getText());
		String s2="";
		if(btn==add)
			s2="Sum="+(d1+d2);
		else if(btn == sub)
			s2 = "Difference = " + (d1-d2);
		else if(btn == mul)
			s2 = "Product = " + (d1*d2);
		else if(btn == rem)
			s2 = "Remainder = "+ (d1%d2);
		else if(btn == div)
			s2 = "Quotient = " + (d1/d2);
                else if(btn==exit)
                          System.exit(0);
                      
		tf3.setText(s2);
		}
	public static void main(String[] args)
	{
		new Calculator(1);
	}
}

