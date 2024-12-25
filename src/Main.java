import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randomValue = random.nextInt(101);

        String[] location = {"Космический город", "лаборатория", "Лос-Паганос"};

        Intruders intruders = new Intruders("злоумышленники", "злые");
        Shorties shorties = new Shorties("коротышки", "добрые");
        Znayka znayka = new Znayka("Знайка", 18);
        Professor professor = new Professor("Профессор Звёздочкин", 60 );
        Spaceship spaceship = new Spaceship(3000, "Вверх");
        Vintic vintic = new Vintic("Винтик", 16);
        Shpuntic shpuntic = new Shpuntic("Шпунтик", 17);
        Doctor doctor = new Doctor("Доктор Пилюлькин", 47);
        News novost = new News("Новость", "Радостная");
        Neznaika neznaika = new Neznaika("Незнайка", 19);
        Joy joy = new Joy("Радость", "радостная");
        Astronomer astronomer = new Astronomer("Альфа", 30);
        Lunologist lunologist = new Lunologist("Мемега", 35);
        Physicist kvantic = new Physicist("Квантик", 26);
        Physicist kvintic = new Physicist("Квинтик", 26);
        Goat goat = new Goat("Козлик", 3);
        Sineglazka sineglazka = new Sineglazka("Синеглзака", 18);
        They they = new They("они", 4);
        Planet earth = new Planet("Земля");
        Secret secret = new Secret("тайна", "тайный");
        Flight flight = new Flight("полёты", "высокие");
        Astronauts astronauts = new Astronauts("астронавты", 2);
        Fuksia fuksia = new Fuksia("Фуксия", 16);
        Seledochka seledochka = new Seledochka("Селедочка", 15);
        Check check = new Check("проверка", "тщательная");
        Spruts spruts = new Spruts("Спрутс", "хитрый", 31);
        Zulio zulio = new Zulio("Жулио", "глупый", 32);
        Explosion explosion = new Explosion("взрыв", "громкий");
        Engineer engineer = new Engineer("Кепка", 41);
        Ponchik ponchik = new Ponchik("Пончик", 12);
        Neelovtsi neelovtsi = new Neelovtsi("нееловцы", 100);
        Propeller propeller = new Propeller("пропеллер", "крутящийся");

        vintic.RollOut(vintic.getName(), "из гаража ", Tools.ВЕЗДЕХОД);
        shpuntic.RollOut(shpuntic.getName(), "из гаража ",Tools.ВЕЗДЕХОД);
        vintic.Take(vintic.getName(), goat.getName());
        shpuntic.Teach(shpuntic.getName(), goat.getName(), Tools.ВЕЗДЕХОД);
        System.out.print("И все трое покатили в ");
        System.out.println(location[2]);
        doctor.Call(doctor.getName(), neznaika.getName(), "обратный путь");
        novost.Delight(novost.getName(), "обрадовала", neznaika.getName());
        neznaika.GetUp(neznaika.getName(), Tools.КРОВАТЬ);
        neznaika.Speak(neznaika.getName(), doctor.getName(), sineglazka.getName());
        neznaika.Sing(neznaika.getName(), "принялся петь");
        doctor.Speak(doctor.getName(), neznaika.getName());
        System.out.println("Так как его организм ослаблен болезнью и ему нужно беречь силы");
        System.out.print("Вскоре ");
        joy.Subside(joy.getName(), neznaika.getName());
        neznaika.Lie(neznaika.getName(), Tools.КРОВАТЬ);
        System.out.print("Спустя минуту ");
        neznaika.GetUp(neznaika.getName(), Tools.КРОВАТЬ);
        System.out.print("В те дни ");
        astronomer.Visit(astronomer.getName(), location[0]);
        lunologist.Visit(lunologist.getName(), location[0]);
        kvantic.Visit(kvantic.getName(), location[0]);
        kvintic.Visit(kvintic.getName(), location[0]);
        they.Arrive(they.getName(), Tools.РАКЕТА, Tools.СКАФАНДР);
        System.out.print("Так как ");
        they.Build(they.getName(), Tools.РАКЕТА, earth.getName());
        System.out.print("Теперь когда ");
        secret.Reveal(secret.getName());
        System.out.println(" и ");
        flight.Become(flight.getName());
        znayka.Give(znayka.getName());
        System.out.println(" и ");
        znayka.Order("велел");
        astronomer.Speak(astronomer.getName(), znayka.getName());
        astronauts.Decided(astronauts.getName(), earth.getName());
        System.out.println(znayka.getName() + " " + fuksia.getName() + " и " +
                seledochka.getName() + " отправились в ангар проверять " + Tools.РАКЕТА);
        System.out.println("В проверке участвовали " + astronomer.getName() + " " +
                lunologist.getName() + " " + kvantic.getName() + " и " + kvintic.getName());
        System.out.println(astronomer.getName() + " и " + lunologist.getName() + " совершат " +
                "полёт на " + Tools.РАКЕТА);
        check.Spend(check.getName());
        astronauts.GoOut(astronauts.getName());
        astronauts.Close(astronauts.getName());
        astronauts.Go(astronauts.getName(), location[0]);
        intruders.Show("Из за забора", intruders.getName());
        System.out.println("Это были " + spruts.getName() + " и " + zulio.getName());
        spruts.Up(spruts.getName(), "забор");
        zulio.Transfer(zulio.getName(), spruts.getName(), Tools.ЯЩИК);
        spruts.Drop(spruts.getName(), Tools.ЯЩИК);
        intruders.Try(intruders.getName(), Tools.ДВЕРЬ);
        intruders.Include(intruders.getName()," потайной ", Tools.ФОНАРЬ);
        intruders.Sit(intruders.getName(), " стены ");
        intruders.PullOut(intruders.getName(), " карманов ", Tools.НОЖИ);
        intruders.Dig(intruders.getName(), Tools.НОЖИ);
        shorties.Sleep(shorties.getName(), "спали ", location[0]);
        znayka.Sleep(znayka.getName(), "работал", location[1]);
        professor.Sleep(professor.getName(),"работал", location[1]);
        znayka.Calculate(znayka.getName(), "математическими расчётами");
        professor.Calculate(professor.getName(), "математическими расчётами");
        System.out.print("Чтобы ");

        if (spaceship.trajectory().equals("Вверх")) {
            System.out.println("Корабль взлетел");
        }

        if (randomValue <= 50) {
            System.out.print("Корабль попал в отверстие");
        } else {
            System.out.print("Корабль не попал в отверстие");
        }

        System.out.println(" в лунной сфере");

        if (randomValue <= 50) {
            System.out.println("Корабль выбрался на поверхность");
        } else {
            System.out.println("Корабль не выбрался на поверхность");
        }

        znayka.Finish(znayka.getName(), "расчёты");
        professor.Finish(professor.getName(), "расчёты");
        znayka.Off(znayka.getName(), "электричество");
        znayka.Lie(znayka.getName(), Tools.КРОВАТЬ);
        explosion.Sound(explosion.getName());
        System.out.println("Стены затряслись, " + Tools.КРОВАТЬ + " перевернулась");
        znayka.GetUp(znayka.getName(), Tools.КРОВАТЬ);
        professor.GetUp(professor.getName(), Tools.КРОВАТЬ);
        znayka.Wrap(znayka.getName(), Tools.ОДЕЯЛО);
        znayka.GoOut(znayka.getName());
        znayka.See(znayka.getName(), "огонь и пламя");
        professor.Go(professor.getName(), "месту где раньше стоял ангар");
        znayka.Go(znayka.getName(), "месту где раньше стоял ангар");
        professor.See(professor.getName(), "развалины");
        shorties.Go(shorties.getName(), "развалинам");
        shorties.See(shorties.getName(), "ракету перевернуло на бок");
        System.out.println("Ракета была повреждена");
        fuksia.Go(fuksia.getName(), "кабине ракеты");
        seledochka.Go(seledochka.getName(), " кабине ракеты");
        fuksia.Push(fuksia.getName(), "кнопку открывающую дверь");
        System.out.println(Tools.ДВЕРЬ + " не открывалась");
        engineer.Go(engineer.getName(), "кабину");
        engineer.Open(engineer.getName(), Tools.ДВЕРЬ);
        engineer.Fix(engineer.getName(), "электромотор");
        shorties.PullOut(shorties.getName(), "вытаскивать и проверять", Tools.СКАФАНДР);
        vintic.Comeback(vintic.getName(), location[0]);
        shpuntic.Comeback(shpuntic.getName(), location[0]);
        goat.Comeback(goat.getName(), location[0]);
        ponchik.Comeback(ponchik.getName(), location[0]);
        astronauts.Start(astronauts.getName(), "отлёту");
        neelovtsi.Go(neelovtsi.getName(), "друзьями");
        neelovtsi.Cry(neelovtsi.getName());
        neelovtsi.Kiss(neelovtsi.getName(), znayka.getName());
        neelovtsi.Kiss(neelovtsi.getName(), shorties.getName());
        shpuntic.Give(shpuntic.getName(), Tools.ВЕЗДЕХОД, goat.getName());
        neznaika.Cry(neznaika.getName());
        neznaika.Lie(neznaika.getName(), Tools.ЗЕМЛЯ);
        doctor.Help(doctor.getName(), neznaika.getName());
        System.out.println(neznaika.getName() + " был бледен");
        shorties.PutOn(shorties.getName(), Tools.СКАФАНДР);
        vintic.PutOm(vintic.getName(), Tools.СКАФАНДР, neznaika.getName());
        propeller.Fly(propeller.getName(), Tools.СКАФАНДР);

    }
}