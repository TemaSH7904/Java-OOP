package inheritance;

public class CatFamily {

    protected int legs;
    protected int eyes;
    protected boolean eatPeople;

    public CatFamily(int legs, int eyes, boolean eatPeople) {
        this.legs = legs;
        this.eyes = eyes;
        this.eatPeople = eatPeople;
    }
    public void eat(){
        System.out.println("Кушаю");
    }

        public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setEatPeople(boolean eatPeople) {
        this.eatPeople = eatPeople;
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isEatPeople() {
        return eatPeople;
    }
}
