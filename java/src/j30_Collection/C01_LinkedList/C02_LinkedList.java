package j30_Collection.C01_LinkedList;

import java.util.LinkedList;
import java.util.Objects;

public class C02_LinkedList {
    public static void main(String[] args) {
      //  LinkedList ll=new LinkedList<>();//DataType Object(Hz.Adem) -> ne olursan ol gel
        LinkedList<Object> ll=new LinkedList<>();//DataType Object(Hz.Adem) -> ne olursan ol gel-->GenericClass
       //BAD PRACTICE->app çoooğ yavaşlar :cısss

        ll.add(1905);
        ll.add("JavaCAN");
        ll.add('$');
        System.out.println("ll = " + ll);//[1905, JavaCAN, $]
    }
}
