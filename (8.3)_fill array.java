import java.util.*;

class Hello {

    public static void main(String[] args){
        int[] code = {1,3,5,8,15};
        int[] arr = new int[10];

        for(int i=0;i<arr.length;i++){
            int tmp = (int)(Math.random()*code.length);     // 0~4까지 랜덤으로 수를 tmp에 저장
            arr[i] = code[tmp];                             // 임의로 저장된 tmp를 활용해 arr배열에 1,3,5,8,15 중의 수를 복사
        }

        System.out.println(Arrays.toString(arr));
    }
}

