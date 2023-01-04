package foods;

import interfaces.SauceAddable;

public class AppleCasserole extends Food {
    public AppleCasserole(String name, int capacity){
        super(name, capacity);
    }
    public void addVanillaSauce(){
        SauceAddable vanillaSauce = new SauceAddable() {
            @Override
            public void addSauce() {
                System.out.println("В " + AppleCasserole.this.getName() + " добавляется ванильный соус");
                AppleCasserole.this.setName(AppleCasserole.this.getName() + " c ванильным соусом");
            }
        };
        vanillaSauce.addSauce();
    }
    public static class AppleCasseroleRecipe extends Recipe{
        String[] ingredients = {"Сливочное масло 10 шт", "яблоко 4 шт.", "пшеничная мука 4 ст.л.", "молоко 250 мл", "куриное яйцо 4 шт.", "сахарная пудра 6 ст.л.", "соль щеп."};

        @Override
        public String getIngredients() {
            return String.join(", ",ingredients);
        }

        @Override
        public void howToCook() {
            System.out.println("Рецепт яблочной запеканки.\n" + "Чтобы приготовить это блюдо нужны: " + getIngredients() + "\n" + "1 Яблоки почистить, удалить сердцевину и косточки, нарезать небольшими кубиками.\n" +
                    "2 В кастрюльке растопить 75 г сливочного масла, добавить яблоки и тушить на среднем огне около 10 минут.\n" +
                    "3 Взбить яйца, добавить 4 столовые ложки сахарной пудры, соль, просеянную муку, очень хорошо перемешать венчиком и постепенно добавлять молоко, продолжая мешать, чтобы не было комочков.\n" +
                    "4 В конце добавить яблоки (остывшие).\n" +
                    "5 Все перемешать и вылить смесь в форму, смазанную остатком сливочного масла (около 15 г).\n" +
                    "6 Выпекать в разогретой до 180 градусов духовке около 30 минут.\n" +
                    "7 Подавать пирог горячим или теплым, присыпав оставшейся сахарной пудрой.");
        }
    }
}
