class Parent {
    int age;
}

class Child extends Parent {
    Child() {
        this.age = 13;
    }
    void play() {
        System.out.println("놀");
    }
}

class Hello {
        public static void main(String[] args){
            Child c = new Child();
            System.out.println(c.age);
            c.play();
        }

}
