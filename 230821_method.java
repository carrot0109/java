class MyMath {                        // 메서드 생성
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long subtract(long a,long b) { return a - b; }
    long multiply(long a,long b) { return a * b; }
    double divide(long a, long b) { return a / b; }
}

class Hello {
        public static void main(String[] args){
          MyMath mm = new MyMath();      // 인스턴스 생성
          long value = mm.add(1l,2l);    // 메서드 호출
          System.out.println(value);
        }
}
