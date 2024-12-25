public class Propeller implements Fly {
    private String name;
    private String personality;

    public Propeller(String name, String personality) {
        this.name = name;
        this.personality = personality;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public void Fly(String n, Tools tool) {
        System.out.println(n + " на " + tool + " позволял летать и смягчал падение");
    }
}
