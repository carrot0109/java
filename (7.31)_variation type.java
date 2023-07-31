class Hello {
    public static void main(String[] args){
        byte b = 1;
        short s = 2;
        char c = 'A';
        
        int finger = 10;
        long big = 100_000_000_000L;            // L -> long type
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;           // 8진수 10, 10진수로는 8
        int hexNum = 0x10;          // 16진수 10, 10진수로는 16
        int binNum = 0b10;          // 2진수 10, 10진수로는 2

        System.out.printf("b=%d%n", b);     // %n -> 줄바꿈 지시자. \n 과 동일
        System.out.printf("s=%d\n", s);     // printlin 이런 형식에서는 사용 불가능
        System.out.printf("c=%c, %d \n",c ,(int)c );
        System.out.printf("finger=[%5d]\n",finger);
        System.out.printf("finger=[%-5d]\n",finger);
        System.out.printf("finger=[%05d]\n",finger);
        System.out.printf("big=%d\n",big);
        System.out.printf("hex=%x%n",hex);      // #은 접두사(16진수 0x, 8진수 0)
        System.out.printf("octNum=%o, %d\n",octNum,octNum);
        System.out.printf("hexNum=%x, %d\n",hexNum,hexNum);
        System.out.printf("binNum=%s, %d\n",Integer.toBinaryString(binNum),binNum);   
    }
}

