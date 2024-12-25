public class Explosion implements Sound {
    private String name;
    private String personality;

    public Explosion(String name, String personality) {
        this.name = name;
        this.personality = personality;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void Sound(String n) {
        System.out.println("Раздался " + n);
    }
}
