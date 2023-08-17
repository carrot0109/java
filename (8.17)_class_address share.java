import javax.swing.plaf.synth.SynthStyle;

class Tv {
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}


class Hello {
        public static void main(String[] args){
            Tv t1 = new Tv();                              
            Tv t2 = new Tv();                  
            System.out.println("t1의 channel값은 " + t1.channel + "입니다");
            System.out.println("t2의 channel값은 " + t2.channel + "입니다");

            t1 = t2;        // t1이 첫 번째 주소값을 가지고 있다고 생각하면 됨 -> 따라서 주소값을 대입함으로써 주소값을 공유하는 것과 같음
            t1.channel = 7;
            System.out.println("t1의 channel값을 7로 변경하였습니다.");

            System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
            System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        }
}
