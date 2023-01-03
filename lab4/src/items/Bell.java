package items;

import enums.ActivationState;
import enums.Place;
import enums.Sound;

public class Bell extends SoundMakingItem {
    public Bell(String name, Place location, ActivationState state, Sound sound) {
        super(name, location, state, sound);
    }
    public void beUsed() {
        if (getState() == ActivationState.ACTIVATED) {
            System.out.println(getName() + " звенит " + getLocation());
        }
    }
}
