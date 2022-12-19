public class Сrocodiles extends Animal implements Speakable,Runable,Flyable,Swimable {
    public Сrocodiles(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 1;
    }

    @Override
    public Integer runSpeed() {
        return 55;
    }

    @Override
    public String speak() {
        return "Klac-klac";
    }

    @Override
    public int swimSpeed() {
        return 90;
    }

    @Override
    public String toString() {
        return "Crocodile" + super.toString();
    }
}
