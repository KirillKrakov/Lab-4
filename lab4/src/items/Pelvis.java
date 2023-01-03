package items;

import enums.ActivationState;
import enums.Place;
import exceptions.ContentTypeException;
import humans.Human;

public class Pelvis extends AccommodatingItem{
    public Pelvis(String name, Place location, ActivationState state, String[] content) {
        super(name, location, state, content);
    }

    @Override
    public void addContent(String s, Object o) {
        if (o instanceof Human.BodyParts){
            super.addContent(s,o);
            this.beUsed();
        } else{
            throw new ContentTypeException("В тазике помещают части тела!");
        }
    }

    @Override
    public void beUsed() {
        System.out.println(String.join(", ", getContent()) + " помещены в тазик");
    }
}
