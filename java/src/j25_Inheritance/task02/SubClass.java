package j25_Inheritance.task02;

public class SubClass extends SuperClass {

    int sayi= 17;
  public static void main(String[] args) {
      SubClass obj = new SubClass();
      obj.javaCAN();//obj ile non-satatic meth. call
     // javaCAN-> non-static meth.obj olmadan doğrudan call edilemz
  }//main sonu
public  void  javaCAN(){
    System.out.println(this.ebikGabık());//subClass meth call-> child meth call
    System.out.println(super.ebikGabık());//superClass meth call->parent meth call
    System.out.println("sayi = " + this.sayi);//child variable call
    System.out.println("super.sayi = " + super.sayi);//parent variable call
}
    @Override
    public String ebikGabık() {
        return   "Agam SubClass'dan selam dewamkeee. ";
    }
}//Class sonu
