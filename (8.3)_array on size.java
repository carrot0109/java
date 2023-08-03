import java.util.Arrays;


class Hello {

    public static void main(String[] args){
       int[] numArr = new int[10];
       for(int i=0;i<numArr.length;i++){
        System.out.print(numArr[i] = (int)(Math.random()*10));
       }
       System.out.println();

       for(int i=0;i<numArr.length-1;i++){
        boolean changed = false;        // 자리바꿈이 발생했는지 체크
        
        for(int j=0;j<numArr.length-1;j++){
            if(numArr[j]>numArr[j+1]){
                int tmp = numArr[j];
                numArr[j] = numArr[j+1];
                numArr[j+1] = tmp;
                changed = true;
            }
        }

        if(!changed) break;     // 코드가 반복되다 앞뒤 교환이 이루어지지 않는다면 changed는 false이고 따라서 break가 실행됨

        // for(int k=0;k<numArr.length;k++){
        //     System.out.print(numArr[k]);
        // }
        System.out.println(Arrays.toString(numArr));    // 배열 하나하나 출력하지 않고, 문자로 만들어서 배열 자체를 출력하면 더욱 편리함
       }
    }
}

