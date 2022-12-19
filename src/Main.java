public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Myrka", 4, "Dima"))
                .addAnimal(new Cat("Laki",4,"Nata"))
                .addAnimal(new Dog("Sharik",4,"Antom"))
                .addAnimal(new Dog("Fox", 4, "Ira"))
                .addAnimal(new Duck("Donald",2,"Ivan"))
                .addAnimal(new Eagle("Tom",2,"Alex"))
                .addAnimal(new Сrocodiles("Gena",4,"Sveta"))
                .addAnimal(new Shark("Pila",0,"Lena"));
        System.out.println(zoo.toString());
        System.out.println("Говор животных:");
        System.out.println(zoo.talk());
        System.out.println("Скорость  животных:");
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.toString() + "-" + i.runSpeed() + "km/h");
        }
        System.out.println("Спринтер");
        System.out.println(zoo.getChampSpeed());
        System.out.println("Скорость полета");
        for (Flyable i: zoo.getFlyable()) {
            System.out.println(i.toString() + "-" + i.flySpeed() + "km/h");
        }
        System.out.println("Скорость плаванья");
        for (Swimable i: zoo.getSwimSpeed()) {
            System.out.println(i.toString() + "-" + i.swimSpeed() + "km/h");
        }
        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        SaveManagerAnimals.save(zoo.getAnimals());
    }
}