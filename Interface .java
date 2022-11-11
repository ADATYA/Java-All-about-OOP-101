import java.util.Scanner;

interface client{
    void input();
    void output();
}
class bikrom implements client{
    String name;
    double sal;
   public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter user name:");
        name=sc.nextLine();

        System.out.print ("Enter client Salary:");
        sal=sc.nextDouble();
    }
    public  void output(){
        System.out.println(name+" "+sal);
    }

    public static void main(String[] args) {
        client c=new bikrom();
        c.input();
        c.output();
    }
}
