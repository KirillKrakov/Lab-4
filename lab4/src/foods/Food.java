package foods;

import humans.Human;

import java.util.Objects;

public abstract class Food {
    private String name;
    private int capacity;
    public Food(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCapacity(){
        return capacity;
    }

    @Override
    public String toString() {
        return "Еда, называемая " + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Food i = (Food) o;
        if (!(Objects.equals(capacity,i.capacity))){
            return false;
        }
        return Objects.equals(this.name,i.name);
    }

    public abstract static class Recipe{
        private String[] ingredients;
        public void setIngredients(String[] ingredients){
            this.ingredients = ingredients;
        }
        public String getIngredients(){
            return String.join(", ", ingredients);
        }
        public abstract void howToCook();
    }
}
