abstract class car{
    car(){
        System.out.println("Car is much importent for us");
    }
    public  abstract void speed();

    }
// 2 ta class ar same property hole abstract class hobe
class bmw extends car{
    bmw(){
        super();
    }
        public void speed(){ //aikane abstract use hoy na!!!
            System.out.println("bmw is 3000cc");
        }
}
class audi extends car{
    audi(){
        super();
    }
    public void  speed(){
        System.out.println("audi is  powerful");
    }

}

public class abstractor {
    public static void main(String[] args) {
        bmw b=new bmw();    //object created.
        audi a=new audi();
        b.speed();
        a.speed();
    }

}
