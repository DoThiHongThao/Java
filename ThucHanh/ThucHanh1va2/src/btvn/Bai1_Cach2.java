package btvn;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public class Bai1_Cach2 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 1L;
    private JTextField a, b, c, Ketqua;
 
    public Bai1_Cach2() {
        // ------------ create JFrame ------------ //
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));
 
        // ------------ add content ------------ //
        int size = 15;
        add(new JLabel("Nhap a"));
        a = new JTextField(size);
        add(a);
 
        add(new JLabel("Nhap b"));
        b = new JTextField(size);
        add(b);
 
        add(new JLabel("Nhap c"));
        c = new JTextField(size);
        add(c);
 
        add(new JLabel("Ket qua"));
        Ketqua = new JTextField(size);
        Ketqua.setEditable(false);// khong cho phep nhap du lieu
        add(Ketqua);
 
        add(createJButton("Tính"));
        add(createJButton("Nhập lại"));
 
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
    private JButton createJButton(String buttonName) {
        JButton btn = new JButton(buttonName);
        btn.addActionListener(this);
        return btn;
    }
 
    public static void main(String[] args) {
        new Bai1_Cach2();
    }
 
    private void Tinh() {
        // check data
        String text = a.getText();
        double a1 = 0, b1 = 0, c1 = 0;
 
        //a
        if (text.equals("")) {
            a.requestFocus(); // nhay den de nhap a
        } else {
            a1 = Double.parseDouble(text);
 
            // b
            text = b.getText();
            if (text.equals("")) {
                b.requestFocus(); // nhay den de nhap b
            } else {
                b1 = Double.parseDouble(text);
 
                // c
                text = c.getText();
                if (text.equals("")) {
                    c.requestFocus(); // nhay den de nhap c
                } else {
                    c1 = Integer.parseInt(c.getText());
                }
            }
        }
        Double denta=(b1*b1)-(4*a1*c1);
        Double x;
        if(denta<0){
            Ketqua.setText("Phuong trinh vo nghiem");
        }
        if(denta==0){
            x=(-b1/(2*a1));
            Ketqua.setText("x= "+String.valueOf(x));
        }
        if(denta>0){
            Double x1=(double)(-b1+Math.sqrt(denta))/(2*a1);
            x=(double)(-b1-Math.sqrt(denta))/(2*a1);
            Ketqua.setText("x1= "+ String.valueOf(x)+" va x2= "+String.valueOf(x1));
        }
     // hien thi ket qua
    }
 
    private void clear() {
        a.setText("");
        b.setText(""); 
        c.setText("");
        Ketqua.setText("");
    }
 
    @Override
    public void actionPerformed(ActionEvent evt) {
        String command = evt.getActionCommand();
        if (command == "Tính") {
            Tinh();
        }
        if (command == "Nhập lại") {
            clear();
        }
    }
}
