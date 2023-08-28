class Tv {
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUP() {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class Hello {
        public static void main(String[] args){
            CaptionTv ctv = new CaptionTv();
            ctv.channel = 10;
            ctv.channelUP();
            System.out.println(ctv.channel);
            ctv.displayCaption("Hello, World");
            ctv.caption = true;
            ctv.displayCaption("Hello, World");
        }

}
