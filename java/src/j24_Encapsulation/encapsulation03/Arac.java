package j24_Encapsulation.encapsulation03;

public class Arac {//pojo Class
    /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
   olan Araba  isimli bir class cretae ediniz.
   2- bütün fieldları parametre alan bir constructor tanımlayınız.
   3- Runner isminde main için bir class oluşturunuz.
   4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
   5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
     */
    //1- private fields->step1
  private String model;
  private String renk;
  private int yıl;
  private int motor;
    //2- constructor

    public Arac() {//p'siz sefil cons.->step4
    }

    public Arac(String model, String renk, int yıl, int motor) {//full p'li cons.-> step2
        this.model = model;
        this.renk = renk;
        //this.yıl = yıl;
        setYıl(yıl);
       // this.motor = motor;
        setMotor(motor);
    }

    //3- getter setter method

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public void setYıl(int yıl) {
        if (yıl<=1886){
            this.yıl = Math.abs(yıl);
            System.out.println("agam o yıl araba vardı da biz mi binmedik :( ");
            System.out.println("arac yılını hatalı giridiniz düzeltin ");
        }else this.yıl =yıl;
    }
    public String getRenk() {
        return renk;
    }



    public int getYıl() {
        return yıl;
    }



    public int getMotor() {

        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000) {
            this.motor = 1001;
            System.out.println("Agam bisiklete bineydin daha çabuk  varırdın ");
        }else this.motor = motor;

    }

    //4- toString method

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yıl=" + yıl +
                ", motor=" + motor ;
    }
}//class sonu
