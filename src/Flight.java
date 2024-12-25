public class Flight implements Become{
    private String name;
    private String personality;

    public Flight(String name, String personality) {
        this.name = name;
        this.personality = personality;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public void Become(String n) {
        System.out.println("космические " + n + " стали доступны лунатикам");
    }
}
