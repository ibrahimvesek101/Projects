package j28_Interface;

public interface DısDonanım {
    void  kapı();//public abstarct meth
    //public  abstract void  kaporta();
     void  kaporta();
     // String  renk = "gırmızııı";
   // int age;->fianl variable initial edilmezse CTE
  public final static    String  RENK = "gırmızııı";//public static final initial varibale

    public default String sisLamp(){//public default concrete meth.->obj.call
        return "sisli havada mutlaka kuallanılmalı";
    }

    public  static void anten(){//public static cobcrete meth->interacename.call
        System.out.println("Agam yine antin kuntin işlerdesin :( ");
    }

  //  public static void main(String[] args) {//interface main meth tanımlanabilir ama BAD PRACTICE
  //      anten();//meth call
  //     // sisLamp();nan-statcik meth  objszcall edilemez
  //  }
 //   DısDonanım obj=new DısDonanım();//ınterface obj create edemzzzzzz
}
