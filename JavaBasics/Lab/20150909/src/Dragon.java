import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;


public class Dragon {
    private final int AGE_DEATH = 6;
    private final int AGE_LAY_EGGS_START = 3;
    private final int AGE_LAY_EGGS_END = 4;

    private String name;
    private int age;
    private List<Egg> eggs;
    private boolean isAlive;
    private List<Dragon> childrens;

    public Dragon(String name, int age) {
        this.name = name;
        this.age = age;
        this.isAlive = true;
        this.eggs = new ArrayList<>();
        this.childrens = new ArrayList<>();
    }

    public void lay(Egg egg) {
        this.eggs.add(egg);
    }

    public void lay() {
        if (this.age >= AGE_LAY_EGGS_START && this.age <= AGE_LAY_EGGS_END) {
            Egg egg = new Egg(-1, this);
            this.eggs.add(egg);
        }
    }

    public void age() {
        if (this.isAlive) {
            this.age++;
        }
        if (this.age == AGE_DEATH) {
            this.isAlive = false;
        }
    }

    public void increaseOffspring(Dragon baby) {
        this.childrens.add(baby);
    }

    public String getName() {
        return this.name;
    }

    public Iterable<Egg> getEggs() {
        return this.eggs;
    }

    public Iterable<Dragon> getChildren() {
        return this.childrens;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    @Override
    public String toString() {
        if (this.getIsAlive()) {
            return this.name;
        }
        return null;
    }

    public static int dragonsCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int dragonsStart = Integer.parseInt(sc.nextLine());

        List<Dragon> dragons = new ArrayList<>();

        for (int i = 1; i <= dragonsStart; i++) {
            Dragon dragon = new Dragon("Dragon_" + i, 0);

            int eggs = Integer.parseInt(sc.nextLine());
            for (int eggCount = 0; eggCount < eggs; eggCount++) {
                Egg egg = new Egg(0, dragon);
                dragon.lay(egg);
            }

            dragons.add(dragon);
        }

        dragonsCount = dragonsStart + 1;

        int years = Integer.parseInt(sc.nextLine());

        for (int year = 1; year <= years; year++) {
            String yearType = sc.nextLine();
            YearType yearFactor = YearType.valueOf(yearType);

            for (Dragon dragon : dragons) {
                passAge(dragon, yearFactor);
            }
        }

        for (Dragon dragon : dragons) {
            printAllDragons(dragon,"");
        }
    }

    public static void printAllDragons(Dragon dragon, String str) {
        if (dragon.getIsAlive()){
            out.println(str+dragon.getName());
        }
        for (Dragon child : dragon.getChildren()) {
            printAllDragons(child,str+"  ");
        }
    }

    public static void passAge(Dragon dragon, YearType factor) {
        dragon.age();
        dragon.lay();

        if (dragon.getIsAlive()) {
            for (Egg egg : dragon.getEggs()) {
                egg.setYearFactor(factor);

                egg.age();
                egg.hatch();
            }
        }

        for (Dragon child : dragon.getChildren()) {
            passAge(child, factor);
        }
    }
}

class Egg {
    private final int AGE_HATCH = 2;

    private int age;
    private Dragon parent;
    private YearType yearFactor;

    public Egg(int age, Dragon parent) {
        this.age = age;
        this.parent = parent;
    }

    public void age() {
        this.age++;
    }

    public void hatch() {
        if (this.age == AGE_HATCH) {
            int yearFactor = this.yearFactor.ordinal();
            for (int i = 0; i < yearFactor; i++) {
                Dragon baby = new Dragon(
                        this.parent.getName()
                                + "/"
                                + "Dragon_"
                                + Dragon.dragonsCount, -1);
                this.parent.increaseOffspring(baby);
                Dragon.dragonsCount++;
            }
        }
    }

    public void setYearFactor(YearType yearFactor) {
        this.yearFactor = yearFactor;
    }
}

enum YearType {
    Bad,
    Normal,
    Good
}
