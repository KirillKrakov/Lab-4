package items;
import enums.ActivationState;
import enums.Place;
import interfaces.Accomodatable;

import java.util.Arrays;

public abstract class AccommodatingItem extends Item implements Accomodatable {
    private String[] content;
    public AccommodatingItem(String name, Place location, ActivationState state, String[] content){
        super(name, location, state);
        this.content = content;
    }
    public String[] getContent(){
        return content;
    }
    protected static <T> T[] append(T[] arr, T element)
    {
        T[] array = Arrays.copyOf(arr, arr.length + 1);
        array[arr.length] = element;
        return array;
    }

    @Override
    public void addContent(String s, Object o) {
        content = append(content,s);
        this.setState(ActivationState.ACTIVATED);
    }
}
