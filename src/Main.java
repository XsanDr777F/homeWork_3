public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
        task_8();
    }

    private static void task_1() {
        System.out.println("Задача 1");

        int appleHarvest = 15000;
        byte tempSouth = -67;
        short firstMoney = 16254;
        long govCreditUsa = 31275000L;
        float pi = 3.1415F;
        double piLong = 3.1415926535;

        System.out.println("Значение переменной " + "appleHarvest " + "с типом " + "int " + "равно " + appleHarvest);
        System.out.println("Значение переменной " + "tempSouth " + "с типом " + "byte " + "равно " + tempSouth);
        System.out.println("Значение переменной " + "firstMoney " + "с типом " + "short " + "равно " + firstMoney);
        System.out.println("Значение переменной " + "govCreditUsa " + "с типом " + "long " + "равно " + govCreditUsa);
        System.out.println("Значение переменной " + "pi " + "с типом " + "float " + "равно " + pi);
        System.out.println("Значение переменной " + "piLong " + "с типом " + "double " + "равно " + piLong);
    }

    private static void task_2() {
        System.out.println("Задача 2");

        float x1 = 27.12F;
        long x2 = 987678965549L;
        double x3 = 2.786;
        short x4 = 569;
        short x5 = -159;
        int x6 = 27897;
        byte x7 = 67;

        System.out.println("Без вывода значения.");
    }

    private static void task_3() {
        System.out.println("Задача 3");

        byte ludPav = 23;
        byte annSer = 27;
        byte ekaAnd = 30;
        short paper = 480;

        float paperStudent = paper / (ludPav + annSer + ekaAnd);

        System.out.println("На каждого Ученика рассчитано " + paperStudent + " листов бумаги.");
    }

    private static void task_4() {
        System.out.println("Задача 4");
        byte kpdPer2Min = 16;
        byte kpdPer1Min = (byte) (kpdPer2Min / 2);

        short kpdPer20Min = (short) (kpdPer1Min * 20);
        short kpdPerDay = (short) (kpdPer1Min * 60 * 24);
        int kpdPer3Day = kpdPer1Min * 3 * 60 * 24;
        int kpdPerJune = kpdPer1Min * 60 * 24 * 30;

        System.out.println("За 20 минут машина произведет " + kpdPer20Min + " бутылок");
        System.out.println("За 1 сутки машина произведет " + kpdPerDay + " бутылок");
        System.out.println("За 3 дня машина произведет " + kpdPer3Day + " бутылок");
        System.out.println("За июнь машина произведет " + kpdPerJune + " бутылок");
    }

    private static void task_5() {
        System.out.println("Задача 5");
        byte allTin = 120;
        byte whiteTin = 2;
        byte brounTin = 4;

        byte classRoom = (byte) (allTin / (whiteTin + brounTin));
        byte allWhite = (byte) (classRoom * whiteTin);
        byte allBroun = (byte) (classRoom * brounTin);

        System.out.println("В школе, где " + classRoom + " классов, нужно " + allWhite + " банок белой краски и " + allBroun + " банок коричневой краски.");
    }

    private static void task_6() {
        System.out.println("Задача 6");
        short bananaWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short icecreamWeight = 2 * 100;
        short eggWeight = 4 * 70;

        short allWeightGramm = (short) (bananaWeight + milkWeight + icecreamWeight + eggWeight);
        double allWieghtKg;
        allWieghtKg = allWeightGramm / 1000;

        System.out.println("Вес завтрака спортсмена " + allWeightGramm + " грамм.");
        System.out.println("Вес завтрака спортсмена " + allWieghtKg + " килограмм");
    }

    private static void task_7() {
        System.out.println("Задача 7");
        short weightDeport = 7 * 1000;
        short weightMin = 250;
        short weightMax = 500;

        byte dayMinW = (byte) (weightDeport / weightMin);
        byte dayMaxW = (byte) (weightDeport / weightMax);
        byte dayAvarge = (byte) ((dayMaxW + dayMinW) / 2);

        System.out.println("При похудении на " + weightMin + " грамм в день, потребуется " + dayMinW + " дней");
        System.out.println("При похудении на " + weightMax + " грамм в день, потребуется " + dayMaxW + " дней");
        System.out.println("В среднем для похудения потребуется " + dayAvarge + " день.");
    }

    private static void task_8() {
        System.out.println("Задача 8");
        int mashaBefore = 67760;
        int denisBefore = 83690;
        int kristinaBefore = 76230;

        int mashaAfter = mashaBefore + ((mashaBefore / 100) * 10);
        int denisAfter = denisBefore + ((denisBefore / 100) * 10);
        int kristinaAfter = kristinaBefore + ((kristinaBefore / 100) * 10);

        int mashaYearChange = mashaAfter * 12 - mashaBefore * 12;
        int denisYearChange = denisAfter * 12 - denisBefore * 12;
        int kristinaYearChange = kristinaAfter * 12 - kristinaBefore * 12;

        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " + mashaYearChange + " рублей.");
        System.out.println("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + denisYearChange + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaAfter + " рублей. Годовой доход вырос на " + kristinaYearChange + " рублей.");
    }

}