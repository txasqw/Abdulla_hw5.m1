public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDefense("Magic");
        boss.setHelf(600);
        boss.setUron(70);

        System.out.println("Босс: " + " \nЗдоровье: " + boss.getHelf() + " Урон: " + boss.getUron() +" Тип защиты: " + boss.getDefense());


        Hero[] Heroes = createHeroes();

        for (Hero hero: Heroes
        ) {
            System.out.println(" Здоровье: " + hero.getHelf() + " Урон: " + hero.getUron() + " Супер сила: " + hero.getSeperPauer());

        }


    }

    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(200,30, "87");
        Hero hero2 = new Hero(200,30, "87");
        Hero hero3 = new Hero(200,30);

        Hero[] Heroes = {hero1,hero2,hero3};

        return Heroes;
    }

}
