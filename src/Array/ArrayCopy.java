package Array;

public class ArrayCopy {
    public static void main(String[] args) {
arrayClone();
    }
    public static void arrayCopy(){
        int a[]={1,2,3};
        int[] b=new int[a.length];
        b=a;
        b[0]++;
        for (int c:a){
            System.out.print(c+" ");
        }
        System.out.println();
        for (int s:b){
            System.out.print(s+" ");
        }


    }
    public static void arrayCopy1(){
        int a[]={1,2,3,4};
        int b[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }
        b[0]++;
        for(int z:a){
            System.out.print(z+" ");
        }
        System.out.println();
        for (int x:b){
            System.out.print(x+" ");
        }

    }
    public static void arrayClone(){
        int[] a={1,2,3};
        int[] b=a.clone();
        b[0]++;
        for (int c:a){
            System.out.print(c+" ");
        }
        System.out.println();
        for (int x:b){
            System.out.print(x+" ");
        }

    }
}
