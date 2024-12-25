public class Joy implements Subside {
    private String name;
    private String personality;

    public Joy(String name, String personality) {
        this.name = name;
        this.personality = personality;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public void Subside(String n, String a) {
        System.out.println(n + " " + a + " утихла");
    }
}