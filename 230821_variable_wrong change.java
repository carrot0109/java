class Data { int x; }

class Hello {
        public static void main(String[] args){
            Data d = new Data();
            d.x = 10;
            System.out.println("main() : x = " + d.x);

            change(d.x);
            System.out.println("after change(d.x)");
            System.out.println("main() : x = " + d.x);
        }

        static void change(int x) {
            x = 1000;
            System.out.println("change() : x = " + x);      // 복사본이 1000으로 변경된 것
        }
}
