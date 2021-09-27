public class Cat extends Animal{

    public void display(){
        System.out.println("Benim adım " + name);
    }

    @Override
    public void eat() {
        System.out.println("Yaş mama yiyebilirim");
    }
}
