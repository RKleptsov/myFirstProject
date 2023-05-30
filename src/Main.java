public class Main {
    public static void main(String[] args) {

    System.out.println(info("Рустам", "Клепцов"));
    System.out.println(summa(7, 5));
    System.out.println(vichit(9, 1));
    System.out.println(ymnoj(3, 4));
    System.out.println(delen(48, 6));

    int[] array1 = new int[] {7,9,3,48};
    int[] array2 = new int[] {5,1,4,6};
    int[] array3 = new int[] {10,50,100,11};
    int[] array4 = new int[] {2,5,25,1};
    int[] array5 = new int[] {57,22,31,5};
    int[] array6 = new int[] {43,21,9,2};
    int[] array7 = new int[] {96,90,102,77};
    int[] array8 = new int[] {16,15,2,7};

        for (int i=0; i < array1.length;i++) {
            System.out.print(summa(array1[i],array2[i])+" ");
        }
        System.out.println();

        for (int i=0; i<array3.length;i++) {
            System.out.print(ymnoj(array3[i],array4[i])+" ");
        }
        System.out.println();

        int i = 0;
        while (i<array5.length) {
            System.out.print(vichit(array5[i],array6[i])+" ");
            i++;
        }
        System.out.println();

        int ii = 0;
        while (ii<array7.length) {
            System.out.print(delen(array7[ii],array8[ii])+" ");
            ii++;
        }
    }
    static int summa(int a,int b) {
        return a + b;
    }
    static int vichit(int a,int b) {
        return a - b;
    }
    static int ymnoj(int a,int b) {
        return a * b;
    }
    static int delen(int a,int b) {
        return a / b;
    }
    static String info(String text1,String text2) {
        return text1 +" Sudjuk "+ text2;
    }

}