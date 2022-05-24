class Animal {
    private String name;
    private int age;
    
    //Regular Constructor
    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }
    //Copy Constructor
    public Animal(Animal other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age <= 0) {
            throw new RuntimeException("the age must be positive");
        }
        this.age = age;
    }

    //All Animal Are Do
    public void eat(String food) {
        System.out.println(getName() + " is eating an " + food + " now!");
    }
    public void breathe() {
        System.out.println(getName() + " is breathing now!");
    }
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }
    public void bark() {
        System.out.println(getName() + "barks really loud!");
    }
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }
    
    public void sleep() {
        System.out.println(getName() + " is sleeping now!");
    }
}