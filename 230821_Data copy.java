class Data { int x; }

class Hello {
        public static void main(String[] args){
            Data d = new Data();
            d.x = 10;

            Data d2 = copy(d);      // 복사된 Data 반환받음
            System.out.println("d.x =" + d.x);
            System.out.println("d2.x =" + d2.x);
       }

       static Data copy(Data d){
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp; 
       }
}
