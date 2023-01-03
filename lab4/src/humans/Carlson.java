package humans;

import enums.EmotionalCondition;
import enums.Place;
import interfaces.Flyable;

public class Carlson extends Human implements Flyable {
    public Carlson(String name, int age, Place location, EmotionalCondition condition){
        super(name,age,location,condition);
    }

    @Override
    public void haveFeelingsForSomeone(Human otherHuman) {
        if (this.getCondition() == EmotionalCondition.JOY){
            System.out.println(this.getName() + "кувыркался в воздухе от радости из-за" + otherHuman.getName());
        }
    }

    @Override
    public void fly(Place location) {
        System.out.println(getName() + " летает " + location);
    }
    public void turnIntoGhost(){
        class Ghost{
            private String ghostName;
            private Human alterEgo;
            Ghost(String ghostName, Human alterEgo){
                this.ghostName = ghostName;
                this.alterEgo = alterEgo;
            }
            public void turning(){
                System.out.println(alterEgo.getName() + " превращается в " + ghostName);
                alterEgo.setName(ghostName);
            }
        }
        Ghost ghost = new Ghost("Привидение из Вазастана",this);
        ghost.turning();
    }
}
