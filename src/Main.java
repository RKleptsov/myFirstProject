public class Main {
    public static void main(String[] args) {
        summa(7,5);
        vichit(9,1);
        ymnoj(3,4);
        delen(48,6);
    }
    public static void summa(int a,int b){
        int r = a+b;
        System.out.println(r);
    }
    public static void vichit(int a,int b){
        int r = a-b;
        System.out.println(r);
    }
    public static void ymnoj(int a,int b){
        int r = a*b;
        System.out.println(r);
    }
    public static void delen(int a,int b){
        int r = a/b;
        System.out.println(r);
    }
}