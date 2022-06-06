package ss7_abstract_class_interface.thuc_hanh.class_animal_and_interface_edible;

import ss7_abstract_class_interface.thuc_hanh.class_animal_and_interface_edible.animal.Animal;
import ss7_abstract_class_interface.thuc_hanh.class_animal_and_interface_edible.animal.Chicken;
import ss7_abstract_class_interface.thuc_hanh.class_animal_and_interface_edible.animal.Tiger;
import ss7_abstract_class_interface.thuc_hanh.class_animal_and_interface_edible.edible.Edible;
import ss7_abstract_class_interface.thuc_hanh.class_animal_and_interface_edible.fruit.Apple;
import ss7_abstract_class_interface.thuc_hanh.class_animal_and_interface_edible.fruit.Fruit;
import ss7_abstract_class_interface.thuc_hanh.class_animal_and_interface_edible.fruit.Orange;

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
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1.howToEat());

        }
    }
}
