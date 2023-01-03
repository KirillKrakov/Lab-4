package items;

import enums.ActivationState;
import enums.Place;

public class Cord extends AttachedItem {
    public Cord(String name, Place location, ActivationState state, Item ConnectedItem){
        super(name, location, state, ConnectedItem);
    }
    public void beUsed(){
        if (getState() == ActivationState.ACTIVATED) {
            System.out.println(getName() + " дёргается");
        }
    }
}