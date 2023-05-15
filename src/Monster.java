public class Monster {

    int hands;
    int eye;
    int foot;

    Monster(int hands, int eye, int foot){
        this.hands = hands;
        this.eye = eye;
        this.foot = foot;
    }
    Monster(int atm){
        this(atm, atm, atm);
    }
    Monster(){
        this(2);
    }

    void voice(){
        voice(1);
    }
    void voice(int count){
        voice(count,"Grrrrrrrr");
    }
    void voice(int count, String word){
        for (int i = 0; i < count; i++){
            System.out.println(word);
        }
    }
}
