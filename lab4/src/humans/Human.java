package humans;

import enums.ActivationState;
import enums.EmotionalCondition;
import enums.Sound;
import interfaces.*;
import items.Item;
import enums.Place;

import java.util.Objects;

public abstract class Human implements AbleToUse, Movable, SoundMaker, AbleToFeel {
    private String name;
    private int age;
    private Place location;
    private EmotionalCondition condition;

    public Human(String name, int age, Place location, EmotionalCondition condition) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Place getLocation() {
        return location;
    }
    public void setLocation(Place location) {
        this.location = location;
    }

    public EmotionalCondition getCondition() {
        return condition;
    }

    public void setCondition(EmotionalCondition condition) {
        this.condition = condition;
    }

    @Override
    public void feel(EmotionalCondition condition) {
        this.setCondition(condition);
        System.out.println(name + " испытывает " + this.condition);
    }

    public abstract void haveFeelingsForSomeone(Human otherHuman);

    public void locate() {
        System.out.println(name + " находится " + this.location);
    }

    @Override
    public void use(Item selectedItem) {
        if (selectedItem.getState() != ActivationState.UNUSABLE) {
            System.out.println(this.name + " использует " + selectedItem.getName());
            selectedItem.setState(ActivationState.ACTIVATED);
        }
    }

    @Override
    public void move(Place destination) {
        System.out.println(this.name + " перемещается в место: " + destination);
        this.setLocation(destination);
    }

    public void look(String something) {
        System.out.println(this.name + " смотрит на " + something);
    }

    public void hear(Sound sound) {
        System.out.println(this.name + " слышит " + sound);
    }
    @Override
    public void makeSound(Sound sound) {
        System.out.println(this.name + " создаёт " + sound);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Человек по имени:" + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human i = (Human) o;
        if (!(Objects.equals(age,i.age))){
            return false;
        }
        return Objects.equals(this.name,i.name);
    }
    public class BodyParts{
        private String bodyPartName;
        public BodyParts(String bodyPartName){
            this.bodyPartName = bodyPartName;
        }
        public String getBodyPartName(){
            return bodyPartName + " " + name;
        }
        public void wash(Item itemForWashing){
            System.out.println(Human.this.name + " моет " + bodyPartName + " в " + itemForWashing.getName() + " " + Human.this.location);
            this.bodyPartName = "чисто вымытые " + bodyPartName;
        }
    }
}
