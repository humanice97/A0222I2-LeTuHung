package ss7_abstract_class_interface.thuc_hanh.class_animal_and_interface_edible.animal;

import ss7_abstract_class_interface.thuc_hanh.class_animal_and_interface_edible.edible.Edible;

public class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: Roarrrr!";
    }
}
