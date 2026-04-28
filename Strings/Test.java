package Strings;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int[] empty = Arrays.copyOf(flowerbed, flowerbed.length);
        for(int i=0;i<empty.length;i++){
            if(empty[i] == 1){
                if(i==0){
                    empty[i+1]=1;
                }else if(i==empty.length-1){
                    empty[i=1]=1;
                }else{
                    empty[i+1] = 1;
                    empty[i-1] = 1;
                }
            }
        }
        System.out.println(Arrays.toString(empty));
    }
}
