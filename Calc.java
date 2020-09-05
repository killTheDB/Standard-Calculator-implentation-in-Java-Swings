/**calculator*/
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class C1 extends JFrame implements ActionListener
{ JTextField t1;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27;
  String s=""; int a,b,c,op,opstate;
  C1()
  { setTitle("Calculator");
    setLayout(new FlowLayout());
    setSize(400,230);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    t1=new JTextField(25);
    add(t1);

    JPanel p2=new JPanel();
    p2.setLayout(new GridLayout(1,3,5,5));
    b1=new JButton("BackSpace");
    b2=new JButton("CE");
    b3=new JButton("C");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);   
    p2.add(b1);p2.add(b2);p2.add(b3);


    JPanel p3=new JPanel();
    p3.setLayout(new GridLayout(1,6,5,5));
    b4=new JButton("MC");
    b5=new JButton("7");
    b6=new JButton("8");
    b7=new JButton("9");
    b8=new JButton("/");
    b9=new JButton("sqrt");
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);    
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    p3.add(b4);p3.add(b5);p3.add(b6);p3.add(b7);p3.add(b8);p3.add(b9);

    JPanel p4=new JPanel();
    p4.setLayout(new GridLayout(1,6,5,5));
    b10=new JButton("MR");
    b11=new JButton("4");
    b12=new JButton("5");
    b13=new JButton("6");
    b14=new JButton("x");
    b15=new JButton("%");
    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);
    b14.addActionListener(this);
    b15.addActionListener(this);  
    p4.add(b10);p4.add(b11);p4.add(b12);p4.add(b13);p4.add(b14);p4.add(b15);

    JPanel p5=new JPanel();
    p5.setLayout(new GridLayout(1,6,5,5));
    b16=new JButton("MS");
    b17=new JButton("1");
    b18=new JButton("2");
    b19=new JButton("3");
    b20=new JButton("-");
    b21=new JButton("1/x");
    b17.addActionListener(this);
    b18.addActionListener(this);
    b19.addActionListener(this);
    b20.addActionListener(this);
    b21.addActionListener(this);
    b16.addActionListener(this);
    p5.add(b16);p5.add(b17);p5.add(b18);p5.add(b19);p5.add(b20);p5.add(b21);

    JPanel p6=new JPanel();
    p6.setLayout(new GridLayout(1,6,8,8));
    b22=new JButton("M+");
    b23=new JButton("0");
    b24=new JButton("+/-");
    b25=new JButton(".");
    b26=new JButton("+");
    b27=new JButton("=");
    b22.addActionListener(this);
    b23.addActionListener(this);
    b24.addActionListener(this);
    b25.addActionListener(this);
    b26.addActionListener(this);
    b27.addActionListener(this);
    p6.add(b22);p6.add(b23);p6.add(b24);p6.add(b25);p6.add(b26);p6.add(b27);

    JPanel p1=new JPanel();
    p1.setLayout(new GridLayout(5,1,5,5));
    p1.add(p2);p1.add(p3);p1.add(p4);p1.add(p5);p1.add(p6);
    add(p1);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent ae)
  { if(ae.getSource()==b23) s=s+"0";
    if(ae.getSource()==b17) if(opstate==0) s=s+"1"; else { s="1"; opstate=0; }
    if(ae.getSource()==b18) if(opstate==0) s=s+"2"; else { s="2"; opstate=0; }
    if(ae.getSource()==b19) if(opstate==0) s=s+"3"; else { s="3"; opstate=0; }
    if(ae.getSource()==b11) if(opstate==0) s=s+"4"; else { s="4"; opstate=0; }
    if(ae.getSource()==b12) if(opstate==0) s=s+"5"; else { s="5"; opstate=0; }
    if(ae.getSource()==b13) if(opstate==0) s=s+"6"; else { s="6"; opstate=0; }
    if(ae.getSource()==b5) if(opstate==0) s=s+"7"; else { s="7"; opstate=0; }
    if(ae.getSource()==b6) if(opstate==0) s=s+"8"; else { s="8"; opstate=0; }
    if(ae.getSource()==b7) if(opstate==0) s=s+"9"; else { s="9"; opstate=0; }

    if(ae.getSource()==b26) 
    { if(op==1) { a+=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==2) { a-=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==3) { a*=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==4) { a/=Integer.parseInt(s); s=String.valueOf(a); }
      else a=Integer.parseInt(s);
      op=1;
      opstate=1;
    }
    if(ae.getSource()==b20) 
    { if(op==1) { a+=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==2) { a-=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==3) { a*=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==4) { a/=Integer.parseInt(s); s=String.valueOf(a); }
      else a=Integer.parseInt(s);
      op=2;
      opstate=1;
    }
    if(ae.getSource()==b14) 
    { if(op==1) { a+=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==2) { a-=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==3) { a*=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==4) { a/=Integer.parseInt(s); s=String.valueOf(a); }
      else a=Integer.parseInt(s);
      op=3;
      opstate=1;
    }
    if(ae.getSource()==b8) 
    { if(op==1) { a+=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==2) { a-=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==3) { a*=Integer.parseInt(s); s=String.valueOf(a); }
      else if(op==4) { a/=Integer.parseInt(s); s=String.valueOf(a); }
      else a=Integer.parseInt(s);
      op=4;
      opstate=1;
    }

    if(ae.getSource()==b27)
    { b=Integer.parseInt(s); 
      switch(op)
      { case 1 : c=a+b; break;
        case 2 : c=a-b; break;
        case 3 : c=a*b; break;
        case 4 : c=a/b; break;
       }
       s=String.valueOf(c);
    }
    t1.setText(s);
  }
}
public class Calc
{ public static void main(String[] args)
  { 
    C1 o1=new C1();
  }
}