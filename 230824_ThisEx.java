class Car{
    String color;
    String gearType;
    int door;
    
    Car() {
        this("white","auto",4);        // this는 class 내부에서 targeting 하는 역할로 사용
    }
    Car(String color){
        this(color, "auto",4);
    }
    Car(String color, String gearType, int door){
        
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class Hello {
        public static void main(String[] args){
            Car c1 = new Car();            // 첫째 car() -> 셋째 car() -> 받은 인자들을 통해 car의 color, gearType, door 에 값 저장
            Car c2 = new Car("blue");      // 둘째 car() -> 셋째 car() -> 동일
            
            System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ". dppr=" + c1.door);
            System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ". dppr=" + c2.door);
        }

}
