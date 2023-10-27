public class Main {

    public static void main(String[] args) {
        System.out.println("Привет Мир!");
        System.out.println("Hello world!");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var commonMass = boxer1 + boxer2;
        var difference = boxer1 - boxer2;
        System.out.println(commonMass);
        System.out.println(difference);

        var difference2 = boxer2 - boxer1;
        System.out.println(difference2);
        var ostatok = boxer2 % boxer1;
        System.out.println(ostatok);

        var hours = 640;
        var rab = 8;
        var sum = hours / rab;
        System.out.println("Всего работников в компании - " + sum + " человек");
        System.out.println("Если в компании работает " + sum + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");

        zad6();
        zad7();
        zad8();
        zada6();
        zada7();
        var1();
        var2();
        var3();
        var4();
        var5();
        var6();
        var7();
        var8();
    }

    // HomeworkHard 1.2 Переменные
    public static void zad6() {

        var a = 12;
        var b = 27;
        var c = 44;
        var d = 15;
        var e = 9;

        var result = a * (b + (c - d * e));
        System.out.println(result);
        result = -result;
        System.out.println(result);
    }

    public static void zad7() {
        var a = 5;
        var b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void zad8() {
        var a = 173;
        var b = (a / 10) % 10;
        System.out.println(b);
    }

    // HomeworkHard 1.3 Условные операторы
    public static void zada6() {
        int age = 19;
        int salary = 58_000;
        double limit;

        if (age >= 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }

        if (salary >= 50_000) {
            limit = limit * 1.2;
        }

        if (salary >= 80_000) {
            limit = limit * 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");


    }

    public static void zada7() {
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        double rate = 0.1;
        double maxPay = salary / 2;

        if (age < 23) {
            rate = rate + 0.01;
        } else if (age < 30) {
            rate = rate + 0.005;
        }

        if (salary > 80_000) {
            rate = rate - 0.007;
        }

        double minPay = (wantedSum * rate + wantedSum) / 12;

        if (minPay > maxPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. Платеж по кредиту " + minPay + " рублей. Отказано.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. Платеж по кредиту " + minPay + " рублей. Одобрено.");
        }

    }

    public static void var1() {
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 1_000_000L;
        float f = 6.3f;
        double g = 123456.7;

        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной v с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной g с типом double равно " + g);
    }
    public static void var2(){
        float q = 27.12f;
        long w = 987_678_965_549L;
        double e = 2.786f;
        short r = 569;
        int t = -159;
        char y = 27897;
        byte u = 67;
    }
    public static void var3(){
        int luda = 23;
        int anna = 27;
        int katya = 30;
        int paper = 480;
        int student = paper/(luda + anna + katya);
        System.out.println("На каждого ученика рассчитано " + student + " листов бумаги");
    }
    public static void var4(){
        int machine = 16;
        int time = 2;
        int perMinute = machine / time;
        int time20 = perMinute * 20;
        int day = perMinute * 1440;
        int day3 = day * 3;
        int month = day3 *10;

        System.out.println("За 20 минут машина произвела " + time20 + " штук бутылок");
        System.out.println("За день машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

    }

    public static void var5(){
        int need = 120;
        int white = 2;
        int brown = 4;
        int classRoom = white + brown;
        int classRoomQuantity = need / classRoom;
        System.out.println("В школе, где " + classRoomQuantity + " классов, нужно " + classRoomQuantity * white + " банок белой краски и " + classRoomQuantity * brown + " банок коричневой краски");
    }
    public static void var6(){
        int banana = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int cocktailGram = banana + milk + iceCream + eggs;
        float cocktailKilo = (float) cocktailGram / 1000;
        System.out.println(cocktailGram);
        System.out.println(cocktailKilo);
    }

    public static void var7(){
        int result = 7;
        int min = 250;
        int max = 500;
        int daysMin = result * 1000 / min;
        int daysMax = result * 1000 / max;
        System.out.println(daysMin);
        System.out.println(daysMax);
    }

    public static void var8(){

        int rate = 10;
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int year = 12;


        int newMasha = (masha * rate) / 100 + masha;
        int newDenis = (denis * rate) / 100 + denis;
        int newKris = (kris * rate) / 100 + kris;
        int oldYearMasha = masha * year;
        int oldYearDenis = denis * year;
        int oldYearKris = kris * year;
        int newYearMasha = newMasha * year;
        int newYearDenis = newDenis * year;
        int newYearKris = newKris * year;
        int difMasha = newYearMasha - oldYearMasha;
        int difDenis = newYearDenis - oldYearDenis;
        int difKris = newYearKris - oldYearKris;

        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + difMasha + " рублей");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + difDenis+ " рублей");
        System.out.println("Кристина теперь получает " + newKris + " рублей. Годовой доход вырос на " + difKris + " рублей");


        }
    }


