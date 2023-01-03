import enums.*;
import exceptions.HumanlocationException;
import foods.AppleCasserole;
import foods.Food;
import humans.*;
import items.*;

public class Main {
    public static void main(String[] args) {
        try {
            Place in_door = Place.IN_THE_DOORWAY;
            Place in_room = Place.IN_THE_ROOM;
            Place near_window = Place.NEAR_THE_WINDOW;
            Place on_roof = Place.ON_THE_ROOF;
            Place in_kitchen = Place.IN_THE_KITCHEN;
            Place at_table = Place.AT_THE_TABLE;
            Place other = Place.OTHER_PLACE;
            Human dad = new OtherHuman("папа", 40, other, EmotionalCondition.CALMNESS);
            Human mom = new OtherHuman("мама", 35, other, EmotionalCondition.CALMNESS);
            Human bosse = new OtherHuman("Боссе", 15, other, EmotionalCondition.CALMNESS);
            Human bethan = new OtherHuman("Бетан", 14, other, EmotionalCondition.CALMNESS);
            Human fr_bok = new FrekenBok("Фрекен Бок", 60, in_kitchen, EmotionalCondition.CALMNESS);
            Human kid = new Kid("Малыш", 7, in_room, EmotionalCondition.CALMNESS);
            Human carlson = new Carlson("Карлсон", 45, on_roof, EmotionalCondition.CALMNESS);
            SoundMakingItem bell = new Bell("Колокольчик", on_roof, ActivationState.NOT_ACTIVATED, Sound.RINGING);
            AttachedItem cord = new Cord("Шнур", near_window, ActivationState.NOT_ACTIVATED, bell);
            AccommodatingItem dish = new Dish("Блюдо", in_kitchen, ActivationState.NOT_ACTIVATED,new String[0],2000);
            AccommodatingItem table = new Table("Стол", at_table, ActivationState.NOT_ACTIVATED, new String[0]);
            AccommodatingItem pelvis = new Pelvis("Тазик", in_kitchen, ActivationState.NOT_ACTIVATED, new String[0]);
            Food apple_casserole = new AppleCasserole("Яблочная запеканка", 1500);
            kid.locate();
            fr_bok.locate();
            ((FrekenBok) fr_bok).cook(apple_casserole);
            ((AppleCasserole) apple_casserole).addVanillaSauce();
            dish.addContent(apple_casserole.getName(),apple_casserole);
            table.addContent(dish.toString(),dish);
            fr_bok.move(at_table);
            kid.move(at_table);
            ((Table) table).addHumanContent(fr_bok);
            ((Table) table).addHumanContent(kid);
            //Команды вызывающие ошибку:
            /*((Table) table).addHumanContent(dad);
            ((Table) table).addHumanContent(mom);
            ((Table) table).addHumanContent(bosse);
            ((Table) table).addHumanContent(bethan);*/
            kid.feel(EmotionalCondition.SADNESS);
            table.beUsed();
            fr_bok.move(in_kitchen);
            ((Kid) kid).waitTime();
            Human.BodyParts fr_bok_legs = fr_bok.new BodyParts("большие босые ноги");
            pelvis.addContent(fr_bok_legs.getBodyPartName(),fr_bok_legs);
            fr_bok_legs.wash(pelvis);
            fr_bok.move(in_door);
            carlson.locate();
            cord.locate();
            bell.locate();
            fr_bok.move(in_room);
            kid.look(fr_bok.getName());
            fr_bok.look(kid.getName());
            kid.feel(EmotionalCondition.FEAR);
            fr_bok.feel(EmotionalCondition.ANGER);
            kid.haveFeelingsForSomeone(fr_bok);
            kid.look(fr_bok_legs.getBodyPartName());
            fr_bok.move(near_window);
            kid.move(near_window);
            kid.use(cord);
            cord.beUsed();
            cord.activateAttachedItem();
            bell.beUsed();
            bell.makeSound(bell.getSound());
            fr_bok.hear(Sound.RINGING);
            kid.hear(Sound.RINGING);
            carlson.hear(Sound.RINGING);
            ((Carlson) carlson).turnIntoGhost();
            ((Carlson) carlson).fly(near_window);
            kid.look(carlson.getName());
            fr_bok.look(carlson.getName());
            fr_bok.feel(EmotionalCondition.FEAR);
            kid.feel(EmotionalCondition.EXCITEMENT);
            Food.Recipe recipe = new AppleCasserole.AppleCasseroleRecipe();
            recipe.howToCook();
            // проверка equals, hashCode, toString
            System.out.println(kid.hashCode());
            System.out.println(bell.hashCode());
            System.out.println(kid.equals(kid));
            System.out.println(cord.equals(bell));
            System.out.println(kid);
            System.out.println(cord);
        } catch (HumanlocationException e){
            System.out.println(e.getName() + " " + e.getMessage());
        }
    }
}