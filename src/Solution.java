import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
       String[] arr={"Salam","Samir","Sabir"};
        System.out.println(longestCommonPrefix(arr));

    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];//Salam
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;

    }
}