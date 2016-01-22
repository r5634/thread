package OuterInner;

public class OuterInner {
private int n=0;

 class Inner{
       int ten =10;
       void setNToTen(){
              n=ten;
       }
}
void setN(){
       Inner in=new Inner();
       System.out.println(" n "+n);
       in.setNToTen();
}
public static void main (String args[]){
       //Inner in = new Inner();
       //in.setNToTen();
       OuterInner oi = new OuterInner();
       oi.setN();
       System.out.println(" ten "+oi.n);
       OuterInner.Inner in1 = oi.new Inner();
       System.out.println(" in1 "+in1.ten);
       OuterInner.Inner in2 = new OuterInner().new Inner();
       System.out.println(" in2 "+in2.ten);
}
}
