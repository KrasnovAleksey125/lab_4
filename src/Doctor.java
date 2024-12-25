public class Doctor extends Essence implements Call, Speak, Help {
    private String name;
    private Integer age;

    public Doctor(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public void Call(String n, String a, String b) {
        System.out.println(n + " позвал " + a + " в " + b );
    }

    @Override
    public void Speak(String n, String a) {
        System.out.println(n + " сказал " + a + " вести себя спокойнее" );
    }

    @Override
    public void Speak(String n, String a, String b) {
    }

    @Override
    public void Help(String n, String a) {
        System.out.println(n + " помог " + a);
    }
}
