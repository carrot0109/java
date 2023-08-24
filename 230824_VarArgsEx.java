class Hello {
        public static void main(String[] args){
            // 기존에는 메서드의 개개변수 개수가 고정적이었으나 JDK1.5부터 동적으로 지정해 줄 수 있게 되었으며, 이 기능을 가변인자 라고 함
            String[] strArr = {"100","200","300"};

            System.out.println(con("", "100", "200", "300"));
            System.out.println(con("-",strArr));
            System.out.println(con(",",new String[]{"1","2","3"}));
            System.out.println("[" + con(",", new String[0]) + "]");
            System.out.println("[" + con(",")+"]");
        }

        static String con(String delim, String...args) {
            String result = "";

            for(String str : args) {
                // System.out.println(str);
                result += str + delim;
            }
            return result;
        }

}
