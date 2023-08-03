import java.util.Arrays;

class Hello {

    public static void main(String[] args){
        int[] iarr1 = new int[10];
        int[] iarr2 = new int[10];
        // int[] iarr3 = new int[]{100,95,80,70,60};
        int[] iarr3 = {100,95,80,70,60};        
        char[] charr = {'a','b','c','d'};

        for(int i = 0 ;i<iarr1.length;i++){
            iarr1[i] = i + 1;
        }
        for(int i = 0 ;i<iarr2.length;i++){
            iarr2[i] = (int)(Math.random()*10)+1;   // 1부터 10의 값 임의로 저장.Math -> 0.0 ~ 10.0
        }
        
        for(int i=0;i<iarr1.length;i++){
            System.out.print(iarr1[i]+",");
        }

        System.out.println();
        System.out.println(Arrays.toString(iarr2));     // 숫자로 이뤄진 배열은 문자로 바꿔서 출력해야한다
        System.out.println(Arrays.toString(iarr3));     // 문자열로 바꿔주는 tostring을 거치면 출력 시 []와 같은 흔적이 남는다
        System.out.println(Arrays.toString(charr));     
        
        System.out.println(iarr3);                      // 숫자로 이루어진 배열을 그대로 출력시 오류가 난다
        System.out.println(charr);                      // 문자열은 그대로 출력해도 됨
    }
}

