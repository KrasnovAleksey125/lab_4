public class News implements Delight {
    private String name;
    private String personality;

    public News(String name, String personality) {
        this.name = name;
        this.personality = personality;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void Delight(String n, String a, String b) {
        System.out.println("Эта "+ n + " " + a + " " + b);
    }
}
