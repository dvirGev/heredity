public class App {
    public static void main(String[] args) {
        Animal nisim = new Animal("nisim", 5);
        Animal shalom = new Animal("shalom", 10);
        nisim.eat("aplle");
        shalom.breathe();

        Dog rexi = new Dog("rexi", 17);
        rexi.breathe();
        rexi.eat("bone");
        rexi.bark();//this function onli Dog can do


        Animal copyRexi = new Animal(rexi);// I can do it because Dog is a Animal
        Animal[] animals = new Animal[4];
        animals[0] = nisim;
        animals[1] = shalom;
        animals[2] = copyRexi;
        animals[3] = rexi; //again Dog is animal
        
        Animal larry = new Cat("Larry", 3);
        //larry can't sleep evan if he is a cat
        if (larry.getClass() == Cat.class) {
            Cat larrCat = (Cat)larry;
            larrCat.sleep();
        }
    }
}
