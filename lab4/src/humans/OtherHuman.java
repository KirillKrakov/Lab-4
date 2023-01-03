package humans;

import enums.EmotionalCondition;
import enums.Place;

public class OtherHuman extends Human{
    public OtherHuman(String name, int age, Place location, EmotionalCondition condition){
        super(name,age,location,condition);
    }

    @Override
    public void haveFeelingsForSomeone(Human otherHuman) {
        System.out.println(this.getName() + " испытывает чувства из-за " + otherHuman.getName());
    }
}
