class Time {
    private int hour;
    private int minute;
    private float second;
    static private float milisecond;      // static 변수는 동일한 주소값을 가지고 있기 때문에 t에서든 t2에서든 같은 값을 가짐

    public int gethour() { return hour; }
    public int getMinute() { return minute; }
    public float getSecond() { return second; }
    public float getMili() { return milisecond; }

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
    
    public void setMili(float s){
        if(s<0.0f || s>59.99f) return;
        milisecond = s;
    }  
}

class Hello {
        public static void main(String[] args){
           Time t = new Time();
           Time t2 = new Time();
           t.setHour(22);
           t.setMili(22.0f);
           System.out.println(t.gethour());
           System.out.println(t2.getMili());
        }
}
