class Time {
    private int hour;
    private int minute;
    private float second;

    public int gethour() { return hour; }
    public int getMinute() { return minute; }
    public float getSecond() { return second; }

    public void setHour(int h){
        if(h<0 || h>23) return;
        hour = h;
    }

    public void setMinte(int m){
        if(m<0 || m>59) return;
        minute = m;
    }

    public void setSecond(float s){
        if(s<0.0f || s>59.99f) return;
        second = s;
    }    
}

class Hello {
        public static void main(String[] args){
           Time t = new Time();
           t.setHour(22);
           // System.out.println(t.hour); --> private int hour 를 외부에서 접촉했기 때문에 오류
           System.out.println(t.gethour());
        }
}
