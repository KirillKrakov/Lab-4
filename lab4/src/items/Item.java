package items;

import enums.ActivationState;
import enums.Place;

import java.util.Objects;

public abstract class Item{
    private ActivationState state;
    private String name;
    private Place location;
    public Item(String name, Place location, ActivationState state){
        this.name = name;
        this.location = location;
        this.state = state;
    }

    public String getName(){
        return name;
    }

    public Place getLocation(){
        return location;
    }
    public void setLocation(Place location){
        this.location = location;
    }
    public void locate(){
        System.out.println(name + " находится " + location);
    }
    public ActivationState getState(){
        return state;
    }

    public void setState(ActivationState state){
        this.state = state;
    }
    public abstract void beUsed();

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Предмет под названием:" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item i = (Item) o;
        return Objects.equals(name,i.name);
    }
}