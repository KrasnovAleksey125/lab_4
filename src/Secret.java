public class Secret implements Reveal{
    String name;
    private String personality;

    public Secret(String name, String personality) {
        this.name = name;
        this.personality = personality;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void Reveal(String n) {
        System.out.print(n + " невесомости была раскрыта");
    }
}
