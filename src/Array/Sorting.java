package Array;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] arr=new int[]{1,5,2,7,4};//1 2 4 5 7
        Arrays.sort(arr);
        int first=0;
        int last=arr.length-1;
        int search=5;
        int result=binarySearch(arr,first,last,search);
        System.out.println(result);
    }
    public static void bubbleSort(){
        /*
        1 8 2 5 9
        1 2 5 8 9
        ona gore n-i-1 yazrqki her defe ededi sona qoyur novbeti defe artq hemin hisseye getmir

         */
        int[] arr=new int[]{9,5,2,1,1};
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(){
        int[] arr=new int[]{1,3,7,4,2};
        int min;
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            min=i;
            for (int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int binarySearch(int[] arr,int first,int last,int search){
        if(last>=first){
            int mid=first+(last-first)/2;
            if(arr[mid]==search){
                return mid;
            }
            if(arr[mid]>search){
                return binarySearch(arr,first,mid-1,search);
            }
           return binarySearch(arr,mid+1,last,search);
        }

     return -1;
    }
}
