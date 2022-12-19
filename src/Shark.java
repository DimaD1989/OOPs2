public class Shark extends Animal implements Speakable,Runable,Flyable,Swimable {

    public Shark(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 0;
    }

    @Override
    public Integer runSpeed() {
        return 0;
    }

    @Override
    public String speak() {
        return "pa-pa";
    }

    @Override
    public int swimSpeed() {
        return 100;
    }

    @Override
    public String toString() {
        return "Shark" + super.toString();
    }
}
