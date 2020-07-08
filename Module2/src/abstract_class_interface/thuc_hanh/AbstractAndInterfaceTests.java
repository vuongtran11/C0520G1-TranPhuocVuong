package abstract_class_interface.thuc_hanh;

import abstract_class_interface.thuc_hanh.animal.Animal;
import abstract_class_interface.thuc_hanh.animal.Chicken;
import abstract_class_interface.thuc_hanh.animal.Tiger;
import abstract_class_interface.thuc_hanh.edible.Edible;
import abstract_class_interface.thuc_hanh.fruit.Apple;
import abstract_class_interface.thuc_hanh.fruit.Fruit;
import abstract_class_interface.thuc_hanh.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }

            Fruit[] fruits = new Fruit[2];
            fruits[0] = new Orange();
            fruits[1] = new Apple();
            for (Fruit fruit : fruits) {
                System.out.println(fruit.howToEat());
            }
        }
    }
}
