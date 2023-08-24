class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {
        value = x;
    }
}

class Hello {
        public static void main(String[] args){
            // 생성자는 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드' 임
            /*
             * 생성자의 조건
             * 1. 생성자의 이름은 클래스의 이름과 같아야 함
             * 2. 생성자의 리턴 값이 없음
             */

             Data1 d1 = new Data1();
             Data2 d2 = new Data2();                // <-- Data2(int x)가 실행되기 위해서는 x라는 인자가 필요함. 
        }

}
