package bai4;

import javax.swing.JOptionPane;

public class Complex {
	private double phanThuc;
    private double phanAo;
    public void setPhanThuc(double phanThuc){
        this.phanThuc=phanThuc;
    }
    public void setPhanAo(double phanAo){
        this.phanAo=phanAo;
    }
    public double getPhanPhuc(){
        return phanThuc;
    }
    public double getPhanAo(){
        return phanAo;
    }
    public Complex(){
        setPhanThuc(0);
        setPhanAo(0);
    }
    public void nhapSoPhuc(Complex cmp){
        String strThuc,strAo;
        strThuc = JOptionPane.showInputDialog(null,"Nhap phan thuc: ",JOptionPane.INFORMATION_MESSAGE);
        strAo = JOptionPane.showInputDialog(null,"Nhap phan ao: ",JOptionPane.INFORMATION_MESSAGE);
        cmp.phanThuc = Double.parseDouble(strThuc);
        setPhanThuc(cmp.phanThuc);
        cmp.phanAo = Double.parseDouble(strAo);
        setPhanAo(cmp.phanAo);
    }
    // public void nhapSoPhuc(Complex cmp){
    //     String so, strThuc,strAo;
    //     so = JOptionPane.showInputDialog(null,"Nhap so: ",JOptionPane.INFORMATION_MESSAGE);
    //     StringTokenizer sk= new StringTokenizer(so,",.");
    //     strThuc=sk.nextToken(",.");
    //     strAo=sk.nextToken(",.");
    //     cmp.phanThuc = Integer.parseInt(strThuc);
    //     setPhanThuc(cmp.phanThuc);
    //     cmp.phanAo = Integer.parseInt(strAo);
    //     setPhanAo(cmp.phanAo);
    // }
    public void hienThi(){
        Double a=getPhanAo();
        if(a<0){
            JOptionPane.showMessageDialog(null, "SoPhuc: "+ getPhanPhuc()  + getPhanAo() + "i");
        }
        else
            JOptionPane.showMessageDialog(null, "SoPhuc: "+ getPhanPhuc()+"+" + getPhanAo() + "i" );
    }

    public Complex congHaiSoPhuc(Complex cmp1, Complex cmp2){
        Double Thuc,Ao;
        Complex cmp=new Complex();
        Thuc=cmp1.phanThuc+cmp2.phanThuc;
        Ao=cmp1.phanAo+cmp2.phanAo;
        cmp.phanThuc=Thuc;
        setPhanThuc(cmp.phanThuc);
        cmp.phanAo=Ao;
        setPhanAo(cmp.phanAo);
        return cmp;
    }
    
    public Complex truHaiSoPhuc(Complex cmp1, Complex cmp2){
        Double Thuc,Ao;
        Complex cmp=new Complex();
        Thuc=cmp1.phanThuc-cmp2.phanThuc;
        Ao=cmp1.phanAo-cmp2.phanAo;
        cmp.phanThuc=Thuc;
        setPhanThuc(cmp.phanThuc);
        cmp.phanAo=Ao;
        setPhanAo(cmp.phanAo);
        return cmp;
    }
    public Complex nhanHaiSoPhuc(Complex cmp1, Complex cmp2){
        Double Thuc,Ao;
        Complex cmp=new Complex();
        Thuc=(cmp1.phanThuc*cmp2.phanThuc)-(cmp1.phanAo*cmp2.phanAo);
        Ao=(cmp1.phanAo*cmp2.phanThuc)+(cmp1.phanThuc*cmp2.phanAo);
        cmp.phanThuc=Thuc;
        setPhanThuc(cmp.phanThuc);
        cmp.phanAo=Ao;
        setPhanAo(cmp.phanAo);
        return cmp;
    }
    public Complex chiaHaiSoPhuc(Complex cmp1, Complex cmp2){
        Double Thuc,Ao,a;
        a=Math.pow(cmp2.phanThuc,2)+Math.pow(cmp2.phanAo,2);
        Complex cmp=new Complex();
        Thuc=((cmp1.phanThuc*cmp2.phanThuc)+(cmp1.phanAo*cmp2.phanAo))/a;
        Ao=((cmp1.phanAo*cmp2.phanThuc)-(cmp1.phanThuc*cmp2.phanAo))/a;
        cmp.phanThuc=Thuc;
        setPhanThuc(cmp.phanThuc);
        cmp.phanAo=Ao;
        setPhanAo(cmp.phanAo);
        return cmp;
    }

}
