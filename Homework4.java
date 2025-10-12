import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수 2개를 입력: ");
        int a = sc.nextInt(); int b = sc.nextInt();
        System.out.printf("최대공약수: %d",gcd(a,b));

        System.out.println("-----");

    }

    static int gcd(int m, int n){
        if(n == 0){return m;}
        else if(m>n) {return gcd(n,m%n);}
        else{return gcd(m, n%m);}
    }
}
