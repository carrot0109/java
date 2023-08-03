import java.util.Arrays;


class Hello {

    public static void main(String[] args){
       int[] numArr = new int[10];
       int[] counter = new int[10];     // numArr배열에 저장되어있는 수들의 빈도를 저장하기 위한 배열

       for(int i=0;i<numArr.length;i++){
        numArr[i] = (int)(Math.random()*10);
        System.out.print(numArr[i]);
       }
       System.out.println();

       for(int i=0;i<numArr.length;i++){
        counter[numArr[i]]++;
       }

       for(int i=0;i<numArr.length;i++){
        System.out.println(i + "의 개수: "+ counter[i]);
       }
    }
}

