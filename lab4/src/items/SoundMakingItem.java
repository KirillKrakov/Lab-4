package items;

import enums.ActivationState;
import enums.Place;
import enums.Sound;
import interfaces.SoundMaker;

public abstract class SoundMakingItem extends Item implements SoundMaker {
    private Sound sound;

    public SoundMakingItem(String name, Place location, ActivationState state, Sound sound) {
        super(name, location, state);
        this.sound = sound;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void makeSound(Sound sound) {
        System.out.println(getName() + " создаёт " + sound);
    }
}
