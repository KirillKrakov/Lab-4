package items;

import enums.ActivationState;
import enums.Place;
import exceptions.ContentTypeException;
import exceptions.HumanlocationException;
import humans.Human;

public class Table extends AccommodatingItem{
    private String[] humanContent;
    public Table(String name, Place location, ActivationState state, String[] content){
        super(name,location,state, content);
        this.humanContent = new String[0];
    }
    public String[] getHumanContent(){
        return humanContent;
    }

    public void addHumanContent(Human o) throws HumanlocationException{
        if (o.getLocation() == this.getLocation()) {
            humanContent = append(humanContent, o.getName());
            this.setState(ActivationState.ACTIVATED);
            System.out.println(o.getName() + " сел за стол");
        } else{
            throw new HumanlocationException("отсутствует за столом", o.getName());
        }
    }

    @Override
    public void addContent(String s,Object o) {
        if (o instanceof Dish){
            super.addContent(s,o);
            ((Item) o).setLocation(Place.AT_THE_TABLE);
            System.out.println(o + " поставлено на стол");
        } else {
            throw new ContentTypeException("На столе должны стоять блюда!");
        }
    }

    @Override
    public void beUsed() {
        if (this.getState() == ActivationState.ACTIVATED){
            System.out.println(String.join(", ", getHumanContent()) + " едят " + String.join(", ", getContent()) + " " + getLocation());
        }
    }
}
