import java.awt.*;
import java.awt.event.*;
class Admin_Customer extends Frame implements ActionListener
{
    Label l1;
	Button b1,b2;
	Admin_Customer()
	{
		setTitle("BIKE RENTAL SYSTEM");
		setSize(400,200);
		setLayout(null);
		l1=new Label("WELCOME TO BIKE RENTAL SYSTEM");
		l1.setBounds(80,50,250,30);
		b1=new Button("ADMIN");
		b1.setBounds(80,150,70,30);
		b2=new Button("CUSTOMER");
		b2.setBounds(250,150,70,30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);
		add(l1);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(ae.getSource()==b1)
		{
			System.out.println("Clicked on Admin");
			Admin ad=new Admin();
		}
		if(ae.getSource()==b2)
		{
			System.out.println("Clicked on Customer");
			Customer cus=new Customer();
	
	}
}
class Admin extends Frame implements ActionListener
{
	Button b3,b4,b5;
	Label l2,l3;
	TextField tf1,tf2;
	Admin()
	{
		setTitle("BIKE RENTAL SYSTEM");
		setSize(800,800);
		setLayout(null);
		l2=new Label("User Name");
		l2.setBounds(200,200,150,50);
		tf1=new TextField("ADMIN");
		tf1.setBounds(400,200,150,50);
		l3=new Label("Password");
		l3.setBounds(200,400,150,50);
		tf2=new TextField();
		tf2.setBounds(400,400,150,50);
		b3=new Button("OK");
		b3.setBounds(200,600,50,30);
		b4=new Button("CANCEL");
		b4.setBounds(400,600,50,30);
		b5=new Button("RESET");
		b5.setBounds(600,600,50,30);
		add(b3);
		add(b4);
		add(b5);
		add(tf1);
		add(tf2);
		add(l2);
		add(l3);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ace)
	{
		String strin=ace.getActionCommand();
		if(ace.getSource()==b4)
		{
			tf2.setText(" ");
		}
		if(strin.equals("CANCEL"))
		{
			System.exit(0);
		}
		if(ace.getSource()==b3)
		{
			Customer c=new Customer();
			c.setVisible(true);
		}
	}
}
class Customer extends Frame implements ActionListener
{
	TextField b1,b2,b3,b4,b5,b6;
	Label l1,l2,l3,l4,l5,l6,l7;
	Button b7,b8,b9;
	public String s1,s2;
	Customer()
	{
		setTitle("BIKE RENTAL SYSTEM");
		setLayout(null);
		l1=new Label("...WELCOME...");
		l1.setBounds(300,50,200,100);
		add(l1);
		l2=new Label("NAME :");
		l2.setBounds(200,200,100,50);
		add(l2);
		b1=new TextField("");
		b1.setBounds(450,200,100,40);
		add(b1);
		l3=new Label("BIKE NO. :");
		l3.setBounds(200,250,100,50);
		add(l3);
		b2=new TextField("");
		b2.setBounds(450,250,100,40);
		add(b2);
		l4=new Label("PHONE NO. : ");
		l4.setBounds(200,300,100,50);
		add(l4);
		b3=new TextField("");
		b3.setBounds(450,300,100,40);
		add(b3);
		l5=new Label("AADHAR NO. :");
		l5.setBounds(200,350,100,50);
		add(l5);
		b4=new TextField("");
		b4.setBounds(450,350,100,40);
		add(b4);
		l6=new Label("DL N0. :");
		l6.setBounds(200,400,100,50);
		add(l6);
		b5=new TextField("");
		b5.setBounds(450,400,100,40);
		add(b5);
		l7=new Label("NUMBER OF DAYS BIKE HAS TAKEN :");
		l7.setBounds(200,450,250,50);
		add(l7);
		b6=new TextField("");
		b6.setBounds(450,450,100,40);
		add(b6);
		b7=new Button("SUBMIT");
		b7.setBounds(200,500,100,40);
		add(b7);
		b7.addActionListener(this);
		b8=new Button("CANCEL");
		b8.setBounds(200,550,100,40);
		add(b8);
		b8.addActionListener(this);
		b9=new Button("RESET");
		b9.setBounds(200,600,100,40);
		add(b9);
		b9.addActionListener(this);
		setSize(700,700);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	
	
	{
		String str=ae.getActionCommand();
		if(ae.getSource()==b9)
		{
			b1.setText(" ");
			b2.setText(" ");
			b3.setText(" ");
			b4.setText(" ");
			b5.setText(" ");
			b6.setText(" ");
		}
		if(str.equals("CANCEL"))
		{
			System.exit(0);
		}
		if(ae.getSource()==b7)
		{
			String na=b1.getText();
			String bn=b2.getText();
			String pn=b3.getText();
			String an=b4.getText();
			String dln=b5.getText();
			String dan=b6.getText();
			prnt pr=new prnt(na,bn,pn,an,dln,dan);
			pr.setVisible(true);

		}
	}

}
class prnt extends Frame implements ActionListener,TextListener
{
	Button b10;
	TextField t1,t2,t3,t4,t5,t6,t7;
	Label l8,l9,l10,l11,l12,l13,l14,l15,l16;
	String name,bno,pno,adno,dlno,dn;
	prnt(String n,String p,String q,String r,String s,String t)
	{
		name=n;
		bno=p;
		pno=q;
		adno=r;
		dlno=s;
		dn=t;
		setTitle("BIKE RENTAL SYSTEM");
		setLayout(null);
		l8=new Label("...WELCOME...");
		l8.setBounds(300,50,200,100);
		add(l8);
		l9=new Label("NAME :");
		l9.setBounds(200,200,100,50);
		add(l9);
		l10=new Label("BIKE NO. :");
		l10.setBounds(200,250,100,50);
		add(l10);
		l11=new Label("PHONE NO. : ");
		l11.setBounds(200,300,100,50);
		add(l11);
		l12=new Label("AADHAR NO. :");
		l12.setBounds(200,350,100,50);
		add(l12);
		l13=new Label("DL N0. :");
		l13.setBounds(200,400,100,50);
		add(l13);
		l14=new Label("NUMBER OF DAYS BIKE HAS TAKEN :");
		l14.setBounds(200,450,250,50);
		add(l14);
		l15=new Label("TOTAL AMOUNT :");
		l15.setBounds(200,500,250,50);
		add(l15);
		l16=new Label("...THANKS FOR VISITING...");
		l16.setBounds(300,550,200,100);
		add(l16);
		b10=new Button("FINISH");
		b10.setBounds(550,620,100,50);
		add(b10);
		b10.addActionListener(this);
		setSize(700,700);

		t1=new TextField();
		t1.setText(name);
		t1.setBounds(450,200,100,40);
		t2=new TextField();
		t2.setText(bno);
		t2.setBounds(450,250,100,40);
		t3=new TextField();
		t3.setText(pno);
		t3.setBounds(450,300,100,40);
		t4=new TextField();
		t4.setText(adno);
		t4.setBounds(450,350,100,40);
		t5=new TextField();
		t5.setText(dlno);
		t5.setBounds(450,400,100,40);
		t6=new TextField();
		t6.setText(dn);
		t6.setBounds(450,450,100,40);
		t7=new TextField();
		t7.setBounds(450,500,100,40);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		t6.addTextListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("FINISH"))
		{
			System.exit(0);
		}
	}
	public void textValueChanged(TextEvent te)
	{
		if(te.getSource()==t6)
		{
			int days,charge;
			days=Integer.parseInt(t6.getText());
			
			if(days<=5)
			{
				charge=days*500;
			}
			else if(days>5 && days<=10)
			{
				charge=(5*500)+((days-5)*400);
			}
			else
			{
				charge=(5*500)+(5*400)+((days-10)*200);
			}
            t7.setText(Integer.toString(charge));

		}
	}
}
class bike
{
	public static void main(String args[])
	{
		Admin_Customer c=new Admin_Customer();
	}
}
}