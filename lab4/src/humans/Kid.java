package humans;

import enums.EmotionalCondition;
import enums.Place;

public class Kid extends Human{
    public Kid(String name, int age, Place location, EmotionalCondition condition){
        super(name,age,location,condition);
    }
    @Override
    public void look(String something) {
        if (this.getCondition() == EmotionalCondition.FEAR) {
            System.out.println(getName() + " робко смотрит на " + something);
        } else{
            System.out.println(getName() + " смотрит на " + something);
        }
    }
    @Override
    public void haveFeelingsForSomeone(Human otherHuman) {
        if (this.getCondition() == EmotionalCondition.FEAR){
            System.out.println(this.getName() + " трепещет из-за " + otherHuman.getName());
        }
    }
    public void waitTime(){
        System.out.println(getName() + " ждёт");
    }
}