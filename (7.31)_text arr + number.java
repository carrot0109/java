class Hello {
    public static void main(String[] args){
        String name = "Ja" + "va";      // String은 문자열 데이터 유형
        String str = name + 8.0;

        System.out.println(name); 
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");     
        System.out.println("" + 7 + 7);     // 연산은 앞에서부터 처리되기 때문에 첫 번째 7을 먼저 문자로 만든다   
    }
}

