import java.util.Scanner;
public class Main {
    static int usalma(int taban,int us){
        if(us==0){
            return 1;
        }else {
            return taban*usalma(taban,us-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban,us;

        System.out.println("Taban sayısını giriniz:");
        taban=input.nextInt();
        System.out.println("Üs sayısını giriniz:");
        us=input.nextInt();

        System.out.println("Sonuç=" + usalma(taban,us));
    }
}