class Animal{
    void makeSound(){
        System.out.println("ANimal sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow");
    }
}

class AnimalSound {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        d1.makeSound();
        Animal c1 = new Cat();
        c1.makeSound();
    }
}
