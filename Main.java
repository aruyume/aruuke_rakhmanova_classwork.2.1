public class Main {
    public static void main(String[] args) {
        String[] commands = {"Sit", "Lie"};
        Shelter shelter = new Shelter("Peace", "Lenina 1");
        Dog dog = new Dog("Rex", "Seberra", commands, ColorEnum.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice(" Гав гав");

        System.out.println();

        Shelter shelter1 = new Shelter("Mirry", "Lenina 6");
        Dog dog1 = new Dog("Roxy", "Sierra", ColorEnum.BLACK, shelter1);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice(" Гав гав гав гав");
    }
}