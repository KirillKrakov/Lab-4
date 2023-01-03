package items;

import enums.ActivationState;
import enums.Place;
import exceptions.CapacityException;
import exceptions.ContentTypeException;
import foods.Food;

public class Dish extends AccommodatingItem{
    private int capacity;
    public Dish(String name, Place location, ActivationState state, String[] content, int capacity){
        super(name,location,state, content);
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    @Override
    public void addContent(String s, Object o) {
        if (o instanceof Food){
            if (this.capacity >= ((Food) o).getCapacity()) {
                super.addContent(s,o);
                capacity -= ((Food) o).getCapacity();
                this.beUsed();
            } else {
                throw new CapacityException("Ёмкости блюда не хватает для такого количества еды");
            }
        } else{
            throw new ContentTypeException("В содержимом блюда должна быть еда!");
        }
    }

    @Override
    public void beUsed() {
        System.out.println(String.join(",", getContent()) + " наложены в блюдо");
    }

    @Override
    public String toString() {
        return this.getName() + " под названием " + String.join(", ", getContent());
    }
}
