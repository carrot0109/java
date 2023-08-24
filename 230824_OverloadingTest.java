import javax.imageio.stream.MemoryCacheImageInputStream;

class Hello {
        public static void main(String[] args){
            // 메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 구별될 수 있어야 하기 때문에 각기 다른 이름을 가져야 함
            // 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도 메게변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메서드를 정의 할 수 있음
            // 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 메서드 오버로딩이라고 함    ex) println(int) & println(float)
            
            MyMath3 mm = new MyMath3();
            System.out.println("mm.add(3, 3)    결과:" + mm.add(3, 3));
            System.out.println("mm.add(3L, 3)   결과:" + mm.add(3L, 3));
            System.out.println("mm.add(3, 3L)   결과:" + mm.add(3, 3L));
            System.out.println("mm.add(3L, 3L)  결과:" + mm.add(3L, 3L));

            int[] a = {100, 200, 300};
            System.out.println("mm.add(a)       결과:" + mm.add(a));
          }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b)     -   ");
        return a+b;
    }

    long add(int a, long b) {
        System.out.print("int add(int a, long b)    -   ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("int add(long a, int b)    -   ");
        return a+b;
    }

    long add(long a, long b) {
        System.out.print("int add(long a, long b)   -   ");
        return a+b;
    }
    int add(int[] a) {
        System.out.print("int add(int[] a)          -   ");
        int result = 0;
        for(int i=0;i<a.length;i++) {
            result += a[i];                 // 배열의 요소들을 모두 더함
        }   
        return result;
    }

}
