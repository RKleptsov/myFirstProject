public class Main {
    public static void main(String[] args) {

        System.out.println(info(""));
        System.out.println(summa(7,5));
        System.out.println(vichit(9,1));
        System.out.println(ymnoj(3,4));
        System.out.println(delen(48,6));
        System.out.println(sum(3,2));
    }
    static int summa(int a,int b){
        int r = a+b;
        return r;
    }
    static int vichit(int a,int b){
        int r = a-b;
        return r;
    }
    static int ymnoj(int a,int b){
        int r = a*b;
        return r;
    }
    static int delen(int a,int b){
        int r = a/b;
        return r;
    }
    static String info(String text){
        String r1 = "Alolololo";
        String r2 ="Oxoxo";
        String r3 =r1+"/"+r2;
        return r3;
    }
    static int sum(int a, int b){
        return a + b;//это ж тож самое, но лучше, т.к. 1 строка вместо 2?
    }
}