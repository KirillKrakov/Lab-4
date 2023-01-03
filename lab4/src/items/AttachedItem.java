package items;

import enums.ActivationState;
import enums.Place;
import interfaces.Attachable;

public abstract class AttachedItem extends Item implements Attachable {
    private Item ConnectedItem;
    public AttachedItem(String name, Place location, ActivationState state, Item ConnectedItem){
        super(name, location, state);
        this.ConnectedItem = ConnectedItem;
    }
    public Item getConnectedItem() {
        return ConnectedItem;
    }

    public void setConnectedItem(Item otherItem) {
        this.ConnectedItem = otherItem;
    }

    @Override
    public void activateAttachedItem() {
        if (getState() == ActivationState.ACTIVATED){
            this.ConnectedItem.setState(ActivationState.ACTIVATED);
        }
    }
}