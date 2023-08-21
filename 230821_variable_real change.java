class Data { int x; }

class Hello {
        public static void main(String[] args){
            Data d = new Data();
            d.x = 10;
            System.out.println("main() : x = " + d.x);

            change(d);
            System.out.println("after change(d)");
            System.out.println("main() : x = " + d.x);
        }

        static void change(Data d) {            // Data d를 인자로 직접적으로 받음
            d.x = 1000;
            System.out.println("change() : x = " + d.x);     
        }
}
