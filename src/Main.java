public class Main {
    public static void main(String[] args) {
        summa(7,5);
        vichit(9,1);
        ymnoj(3,4);
        delen(48,6);
    }
    static void summa(int a,int b){
        int r = a+b;
        System.out.println(r);
    }
    static void vichit(int a,int b){
        int r = a-b;
        System.out.println(r);
    }
    static void ymnoj(int a,int b){
        int r = a*b;
        System.out.println(r);
    }
    static void delen(int a,int b){
        int r = a/b;
        System.out.println(r);
    }
}