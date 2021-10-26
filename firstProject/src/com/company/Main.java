package com.company; // cia url atvirksciai

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main { //cia failo pavadinimas

    public static void main(String[] args) {//cia f-ja kuri paleidzia viska
        System.out.println("Hello World");
        String oo = "-------------------------------------------------------------------------------------------------------------------------------------------------";

        String tekstas = "kazkoks tekstas";  //Stringas rasosi is diziosios (tik jis vienintelis)
        tekstas = "kitoks tekstas";
        tekstas += " prailgintas";


//        int sk = 7;
//        double skDouble = 7.2;
//        float skFloat = 7.2f;
//        char raide = 'k';
//        boolean truFalse = true;
//
//        String zodis = "zodis";
//        System.out.println(zodis);
//        System.out.println(4 + zodis);
//        System.out.println(zodis + 4);
//        System.out.println(4 + 4 + zodis);
//        System.out.println(zodis + 4 + 4);

// matematika veikia tik iki tol kol atsiranda tekstas

//        if (true) {
//            System.out.println("if veikia");
//        }
//        } else {
//            System.out.println("else veikia");
//        }
//
//        for (  ; true  ;  ) {
//        System.out.println("for veikia");
//        }
//        while (true) {
//        System.out.println("while veikia");
//        }
//
//        switch () {
//        }
//        do {
//        } while (true)
//        function() {
//            System.out.println("funkcija veikia");
//        }
//        if (true) {
//         System.out.println("if veikia");
//
//    }
//
//        for (int i = 0; i<10; i++) {
//    }

//        int y = 0;
//        while( y < 5 ){
//            System.out.println("atspek skaiciu");
//            //magija kuri priima mano skaiciu ir nustato ar as atspejau
//            y++;
//        }

//
//        System.out.println(" \" "); // backslash'as skipina sekanti stringo simboli kaip sintakses elementa

        System.out.println(oo);
        System.out.println("1.1 uzduotis");
        System.out.println("Vardas, Pavarde, gimimo metai ir šie metai, paskaiciuojam amziu");
        String myName = "Tosisi";
        String lastName = "Tokaka";
        int born = 1946;
        int now = 2021;
        System.out.println("\"Aš esu " + myName + " " + lastName + ". Man yra " + (now - born) + " metai(ų)\".");


        // pseudo random'as, grazina skaiciu 0 =< x < 1    pvz  0.00000000001, 0.999999999

//        System.out.println(Math.random());
//        System.out.println(Math.random()*4);
//        System.out.println(Math.random()*49 + 1); // nuo 1 iki 50
//        System.out.println(Math.random()*6 + 2); // nuo 2 iki 7
//        double rnd = Math.random()*4;
//        int rndInt = (int) rnd;  // castinimas is double i int 3.9999999  gausis 3
//        System.out.println(rndInt);
//
//        System.out.println(rnd + " + " + rndInt); //sitaip galim skirtungus skaicius atspausdinti kartu
//

//  MATH RANDOM
        System.out.println(oo);
        System.out.println("1.2 uzduotis");
        System.out.println("2x Math.random(0-4). Didesnis / mazesnio (2sk po kablelio");
        double rnd2_1 = Math.random() * 5;
        double rnd2_2 = Math.random() * 5;

        double isBigger = rnd2_1 > rnd2_2 ? rnd2_1 : rnd2_2;
        System.out.println("Pirmas: " + rnd2_1 + "; antras: " + rnd2_2);
        System.out.println("Didesnis gaunasi: " + isBigger);
        double result = isBigger / (rnd2_1 + rnd2_2 - isBigger);
        System.out.println("Didesni padalinus is mazesnio gauname (suapvalinus): " + (double) Math.round(result * 100) / 100);


//        if (rnd2_1 > rnd2_2){
//            rnd2_1 / rnd2_2
//        } else {rnd2_2 / rnd2_1
//        }


//        double num = 3.6189165;
//        double rouded = (double) ( (int) (num * 100) ) / 100;
//        double rounded2 = Math.floor(num*100)/100;
//        int sk = 7;
//        System.out.println(rounded2);

        System.out.println(oo);
        System.out.println("1.3 uzduotis");
        System.out.println("3x Math.random(0-25). Print vidurini");
        int a = (int) (Math.random() * 26);
        int b = (int) (Math.random() * 26);
        int c = (int) (Math.random() * 26);
        System.out.println("Pirmas: " + a + ", Antras: " + b + ", Trecias: " + c);

        if (a > b && b > c) {
            System.out.println("Vidurinis gaunasi - " + b);
        }
        if (a > c && c > b) {
            System.out.println("Vidurinis gaunasi - " + c);
        }
        if (b > a && a > c) {
            System.out.println("Vidurinis gaunasi - " + a);
        }


        System.out.println(oo);
        System.out.println("1.4 uzduotis");
        System.out.println("3x Math.random(0-10). Print ar paeis trikampis");
        int x = (int) (Math.random() * 10) + 1;
        int y = (int) (Math.random() * 10) + 1;
        int z = (int) (Math.random() * 10) + 1;
        System.out.println("Pirma krastine: " + x + ", Antra krastine: " + y + ", Trecia krastine: " + z);

        if (x + y > z && x + z > y && z + y > x) {
            System.out.println("trikampis galimas");
        } else {
            System.out.println("trikampis nesigaus");
        }

        System.out.println(oo);
        System.out.println("1.5 uzduotis");
        System.out.println("4x Math.random(0-2). Print kiek kiekvieno issisuko");
        int aa = (int) (Math.random() * 3);
        int bb = (int) (Math.random() * 3);
        int cc = (int) (Math.random() * 3);
        int dd = (int) (Math.random() * 3);
        int nuliai = 0;
        int vienetai = 0;
        int dvejetai = 0;
        System.out.println("Pirmas - " + aa + "; antras - " + bb + "; trecias - " + cc + "; ketvirtas - " + dd);

        if (aa == 0) {
            nuliai = nuliai + 1;
        } else if (aa == 1) {
            vienetai = vienetai + 1;
        } else {
            dvejetai = dvejetai + 1;
        }

        if (bb == 0) {
            nuliai = nuliai + 1;
        } else if (bb == 1) {
            vienetai = vienetai + 1;
        } else {
            dvejetai = dvejetai + 1;
        }

        if (cc == 0) {
            nuliai = nuliai + 1;
        } else if (cc == 1) {
            vienetai = vienetai + 1;
        } else {
            dvejetai = dvejetai + 1;
        }

        if (dd == 0) {
            nuliai = nuliai + 1;
        } else if (dd == 1) {
            vienetai = vienetai + 1;
        } else {
            dvejetai = dvejetai + 1;
        }

        System.out.println("Nuliu yra - " + nuliai + " vnt; vienetu - " + vienetai + " vnt; ir dvejetu gauname - " + dvejetai + " vnt.");


        System.out.println(oo);
        System.out.println("1.6 uzduotis");
        System.out.println("3x Math.random(-10-10). Print x < 0 < x skirtinguose skliaustuose");
        int aaa = -10 + (int) (Math.random() * 21);
        int bbb = -10 + (int) (Math.random() * 21);
        int ccc = -10 + (int) (Math.random() * 21);

        String AAA = "";
        if (aaa == 0) {
            AAA = "( " + aaa + " )";
        } else if (aaa < 0) {
            AAA = "[ " + aaa + " ]";
        } else {
            AAA = "{ " + aaa + " }";
        }
        String BBB = "";
        if (bbb == 0) {
            BBB = "( " + bbb + " )";
        } else if (bbb < 0) {
            BBB = "[ " + bbb + " ]";
        } else {
            BBB = "{ " + bbb + " }";
        }
        String CCC = "";
        if (ccc == 0) {
            CCC = "( " + ccc + " )";
        } else if (ccc < 0) {
            CCC = "[ " + ccc + " ]";
        } else {
            CCC = "{ " + ccc + " }";
        }

        System.out.println("Random sk. nuo -10 iki 10: Pirmas: " + aaa + "; antras: " + bbb + "; trecias: " + ccc);
        System.out.println("Keiciasi sklaustai: Pirmas: " + AAA + "; antras: " + BBB + "; trecias: " + CCC);


        System.out.println(oo);
        System.out.println("7-a uzduotis");
        System.out.println("Zvakes po eura. 1K> 3% ir 2K> 4%. Math.random(5-3000). Print nuolaidele");
        int amount = 4 + (int) (Math.random() * 3001);
        int price = 1;
        int sum = price * amount;
        double discount1 = amount / 100 * 3;
        double discount2 = amount / 100 * 4;

        if (amount > 2000) {
            System.out.println("Zvakes kaina: " + price + " eur/vnt." + "; Uzsakymo apimtis: " + amount + " vnt.; Uzsakymo suma: " + sum + " eur");
            System.out.println("Oho.. 2K ant zvakiu - cia jau tikrai rimta. Todel jums pritaikeme 4% (" + discount2 + " eur) nuolaida. Nuplesim tik " + Math.round((sum - discount2) * 100) / 100 + " eur. Aciu kad pirkote, greit turbut negrisit.... ");
        } else if (amount > 1000) {
            System.out.println("Zvakes kaina: " + price + " eur/vnt." + "; Uzsakymo apimtis: " + amount + " vnt.; Uzsakymo suma: " + sum + " eur");
            System.out.println("Kadngi virsyjote 1000 eur. - jums pritaikeme 3% (" + discount1 + " eur) nuolaida. Dabar mokesite tik: " + Math.round((sum - discount1) * 100) / 100 + " eur");
        } else {
            System.out.println("Zvakes kaina: " + price + " eur/vnt." + "; Uzsakymo apimtis: " + amount + " vnt.; Uzsakymo suma: " + sum + " eur");
            System.out.println("O va jei pirktum daugiau... Gal pritaikytumem ir kokia nuolaidele...");
        }


        // STRINGAI  - TEKSTO MANIPULIACIJOS ///////////////////////////////


//        String str = "labas as krabas";
//        System.out.println(str.length());
//        //pajuodintos funkcijos - pagrindines

        System.out.println(oo);
        System.out.println("2.1 uzduotis");
        String actName = "Leonardisimo";
        String actSurname = "DiCaprio";
        if (actName.length() > actSurname.length()) {
            System.out.println(actSurname);
        } else {
            System.out.println(actName);
        }

        System.out.println(oo);
        System.out.println("2.2 uzduotis");
        String actName2 = "Silvestras";
        String actSurname2 = "Stalilionis";
        System.out.println(actName2.toUpperCase()+" "+actSurname2.toLowerCase());


        System.out.println(oo);
        System.out.println("2.3 uzduotis");
        String actName3 = "Brudas";
        String actSurname3 = "Pitas";
        String initials = actName3.charAt(0) + "" + actSurname3.charAt(0);
        System.out.println(initials);


        System.out.println(oo);
        System.out.println("2.4 uzduotis");
        String actName4 = "Penzelis";
        String actSurname4 = "Vašingtonas";
        String lastLetters = actName4.substring(actName4.length()-3) + actSurname4.substring(actSurname4.length()-3);
        System.out.println(lastLetters);


        System.out.println(oo);
        System.out.println("2.5 uzduotis");
        String eilute = "An American in Paris";
        System.out.println("An American in Paris".replaceAll("[Aa]","*"));
        System.out.println(eilute.replaceAll("[Aa]","*"));


        System.out.println(oo);
        System.out.println("2.6 uzduotis");
        System.out.println(eilute.replaceAll("[AEIOUaeiou]",""));
        String eilute2 = "Breakfast at Tiffany's";
        String eilute3 = "2001: A Space Odyssey";
        String eilute4 = "It's a Wonderful Life";
        System.out.println(eilute2.replaceAll("[AEIOUaeiou]",""));
        System.out.println(eilute3.replaceAll("[AEIOUaeiou]",""));
        System.out.println(eilute4.replaceAll("[AEIOUaeiou]",""));


        System.out.println("2.7 uzduotis");
    //        String gen = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
    //        System.out.println(gen);
    //        gen = gen.replaceAll("[^0-9]+", " ");
    //        System.out.println(Arrays.asList(gen.trim().split(" ")));
        String starWars = "Star Wars: Episode "+" ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println("The episode is "+starWars.replaceAll("[^\\d]", " ").trim());

        System.out.println("The episode is "+starWars.replaceAll("[!a-zA-Z: ]", ""));


        /// SCANNER /////////////////////////////////////////////


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Kuo tu vardu?");
//        String name = scanner.nextLine();
//        //ties nextLine JAVA sustoja ir laukia input'o (turi zinoti tiksliai kokio tipo duomenis bus paduoti)
//        System.out.println("oba, mano vardas irgi "+name);


        // ivestas textas atvirksciai, ir prasideda didziaja // + new StringBuilder(name).reverse().toString() //


//        surinkti duomenis: vardas, pavarde, amzius, ar mokosi programuoti, surinktus duomenis atspausdinti


        //Apsauga per TRY CATCH - try gaut ko nori, else

//        try {
//            scanner.nextInt();
//            System.out.println("Pavyko gauti skaiciu");
//
//        } catch (Exception e) {
//            System.out.println("Nepavyko gauti skaiciaus");
//        }


//// Timestamp /////////////////

//        System.out.println(new java.sql.Timestamp(System.currentTimeMillis()).getTime());
//
//        long currentTime = new java.sql.Timestamp(System.currentTimeMillis()).getTime();
//        System.out.println(currentTime/1000/60/60/24/365);


////Naujas scaneris - naujam inputui

//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Parasyk savo varda");
//        long t1 = new java.sql.Timestamp(System.currentTimeMillis()).getTime();
//        scanner2.nextLine();
//        long t2 = new java.sql.Timestamp(System.currentTimeMillis()).getTime();
//        System.out.println("Parasyti savo varda uztrukai " +(t2-t1)+ " milisekundziu");


//        //////////  SALYGINIAI SAKINIAI - ale CIKLAI, LOOP'ai ////////////////////


//        int count = 0;

//
//        /// net nesudirbs
//        while (false) {
//            System.out.println("tiesa");
//        }
//
//        // sudirbs 1 karta
//        do {
//
//        } while(false);


//        int numb = 7;
//        while(numb > 0) {
//            numb-=3;
//        }


//        Scanner scanner = new Scanner(System.in);
//        int numb = 7;
//        boolean badNumber = true;
//        System.out.println("prasau iveskite skaiciu");
//        while(badNumber) {
//            int input = scanner.nextInt();
//            if (input >0 && input<5){
//                badNumber = false;
//                System.out.println("pagaliau, aciu");
//            }else{
//                System.out.println("Ivesk skaiciu teisingai. TARP 0 ir 5");
//            }
//        }
//        System.out.println("skaicius priimtas");


//         String tekstux = "Labas";
//        for (int i=0; i<tekstux.length(); i++) {
//            System.out.println(tekstux.charAt(i));
//        }


        System.out.println();
        System.out.println("---------------------CIKLAI---------------------------");
        System.out.println();


        System.out.println("3.1 uzduotis");

        int totalA = 0;
        int more150 = 0;
        String textaz = "";

        for (int i = 0; i < 300; i++) {
            int aAa = (int) (Math.random() * 301);
            totalA++;
            if (aAa > 275) {
                textaz = textaz + ("[" + aAa + "] ");
            } else {
                textaz += (aAa + " ");
            }
            if (aAa > 150) {
                more150 += 1;
            }
        }
        System.out.println(textaz);
        System.out.println("viso priskaldem " + totalA + " skirtingu skaiciu tarp 0 ir 300");
        System.out.println("visi kurie didesni uz 275 - apsklausti [ ]");
        System.out.println("aptikom: " + more150 + " vnt. didesniu nei 150");
        System.out.println(oo);


        System.out.println("3.2 uzduotis");
        String textaz3000 = "";
        for (int i = 1; i < 3001; i++) {
            if (i % 77 == 0) {
                textaz3000 += i + ",";
            }
        }
        System.out.println("Skaiciai iki 3K, kurie dalinasi is 77, atskirti kableliais, paskutinis kablelis ne prie chebros");
        System.out.print(textaz3000.substring(0, textaz3000.length() - 1));
        System.out.println();
        System.out.println(oo);


        System.out.println("3.3 uzduotis");
        System.out.println("kvadratas kurio krastines sudaro 100 gviazdu");
        for (int i = 1; i < 101; i++) {
            System.out.println("");
            for (int iy = 1; iy < 101; iy++) {
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.println(oo);


        System.out.println("3.4 uzduotis - papildoma");
        int zInc = 1;
        int wDec = 100;
        for (int i = 1; i < 101; i++) {
            System.out.println("");
            for (int iy = 1; iy < 101; iy++) {
                if (i==iy || i==100-iy) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
        }
        System.out.println();


        System.out.println();
        System.out.println(oo);




// Metam monetą. stabdome:
//Iškritus herbui;
//Tris kartus iškritus herbui;
//Tris kartus iš eilės iškritus herbui;

        System.out.println("3.5 uzduotis");
        System.out.println(oo);
        System.out.println("•1• Pametyk moneta kol iskris herbas");
        System.out.print("Iskrito: ");

        int H = 0;
        int S = 1;
        int counterH1 = 0;
        int counter1 = 0;

        do {
            int coin = (int) (Math.random() * 2);
            if (S == coin) {
                System.out.print("Skaicius ");
                counter1 += 1;
            } else {
                System.out.print("Herbas ");
                counterH1 += 1;
                counter1 += 1;
            }
        } while (counterH1 == 0);
        System.out.println();
        if (counter1 == 1) {
            System.out.println("Uzteko " + counter1 + " karto. Esi laimes kudikis.");
        } else {
            System.out.println("Kol iskrito herbas teko mesti " + counter1 + " kartus");
        }

        System.out.println();
        System.out.println("•2• Pametyk moneta kol herba isridensi tris kartus ");
        System.out.print("Iskrito: ");
        int counterH2 = 0;
        int counter2 = 0;

        do {
            int coin2 = (int) (Math.random() * 2);
            if (S == coin2) {
                System.out.print("S ");
                counter2 += 1;
            } else {
                System.out.print("H ");
                counterH2 += 1;
                counter2 += 1;
            }
        } while (counterH2 <= 2);

        System.out.println();
        if (counter2 <= 9) {
            System.out.println("Kol 3 kartus iskrito herbas teko mesti " + counter2 + " kartus");
        } else {
            System.out.println("Kad 3 kartus isridentum herba prireike net " + counter2 + " bandymu");
        }


        System.out.println();
        System.out.println("•3• Pametyk moneta kol herba isridensi tris kartus is eiles ");
        System.out.print("Iskrito: ");
        int counterH3 = 0;
        int counter3 = 0;

        do {
            int coin3 = (int) (Math.random() * 2);
            if (S == coin3) {
                System.out.print("S ");
                counterH3 = 0;
                counter3 += 1;
            } else {
                System.out.print("H ");
                counterH3 += 1;
                counter3 += 1;
            }
        } while (counterH3 <= 2);
        System.out.println();

        if (counter3 <= 5) {
            System.out.println("Kad 3 kartus is eiles iskristu herbas uzteko " + counter3 + " metimu. Sekme tau sypsosi.");
        } else {
            System.out.println("Kad 3 kartus is eiles isridentum herba prireike " + counter3 + " bandymu");
        }

        System.out.println(oo);
        System.out.println("3.6 uzduotis");
        System.out.println(oo);
        System.out.println("Kazys ir Petras sėdo ant šaškių:");
        String nameK = "Kazys";
        String nameP = "Petras";
        int totalKazys = 0;
        int totalPetras = 0;
        int game = 0;

        do {
            game += 1;
            int kazysRnd = (int) (5 + (Math.random() * 21));
            int petrasRnd = (int) (10 + (Math.random() * 11));

            totalKazys += kazysRnd;
            totalPetras += petrasRnd;

            if (kazysRnd == petrasRnd) {
                System.out.println(game + " partija " + nameK + " ir " + nameP + " suzaide lygiosiomis: " + kazysRnd + " : " + petrasRnd + "      - viso: " + nameK + " " + totalKazys + " : " + totalPetras + " " + nameP);
            } else if (kazysRnd > petrasRnd) {
                System.out.println(game + " partija laimejo " + nameK + " rezultatu: " + kazysRnd + " : " + petrasRnd + "      - viso: " + nameK + " " + totalKazys + " : " + totalPetras + " " + nameP);
            } else {
                System.out.println(game + " partija laimejo " + nameP + " rezultatu: " + petrasRnd + " : " + kazysRnd + "      - viso: " + nameK + " " + totalKazys + " : " + totalPetras + " " + nameP);
            }
            ;
        } while (totalKazys <= 221 && totalPetras <= 221);

        if (totalKazys == totalPetras) {
            System.out.println("Zaidimui prireike " + game + " partiju ir nugalejo draugyste. Galutinis rezultatas: " + totalKazys + " : " + totalPetras);
        } else if (totalKazys > totalPetras) {
            System.out.println("Zaidima laimejo " + nameK.toUpperCase() + " rezultatu: " + totalKazys + " : " + totalPetras + " - alaus stato " + nameP + ", vyriokai is viso sumete - " + game + " partiju");
        } else {
            System.out.println("Zaidima laimejo " + nameP.toUpperCase() + " rezultatu: " + totalPetras + " : " + totalKazys + " - alaus stato " + nameK + ", vyriokai is viso sumete - " + game + " partiju");
        }
        ;

        System.out.println(oo);
        System.out.println("3.7 uzduotis - pazengusiems");
        System.out.println(oo);

        System.out.println("3.8 uzduotis");
        System.out.println(oo);
        System.out.println("A) Kalsim... penkias 8,5cm vinis, mazais smugiais.");
        System.out.println(oo);

        int ilgisLight = 85;
        int kiekisLight = 0;
        int counterLight = 0;

        do {
            kiekisLight += 1;
            System.out.print(kiekisLight + "-a vinis: ");
            do {
                int light = (int) (5 + (Math.random() * 21));
                counterLight += 1;
                ilgisLight -= light;
                if (ilgisLight > 0) {
                    System.out.print(counterLight + "-as - " + light + " mm (liko: " + ilgisLight + "mm ); ");
                } else {
                    System.out.println();
                    System.out.println("Paskutinis stuktelejimas - " + light + " mm, jo pakanka sulygint vini su lentos pavirsiumi.");
                    System.out.println(kiekisLight + "-ajai ikalti reikejo " + counterLight + " smugiu.");
                    System.out.println();
                }
            } while (ilgisLight > 0);
            ilgisLight = 85;
            counterLight = 0;

        } while (kiekisLight < 5);

        System.out.println(oo);
        System.out.println("B) dabar vanosim penkias 8,5cm vinis, rimtais smugiais 50% taiklumu.");
        System.out.println(oo);

        int ilgisHard = 85;
        int kiekisHard = 0;
        int counterHard = 0;
        int counterMiss = 0;

        do {
            kiekisHard += 1;
            System.out.print(kiekisHard + "-a vinis: ");
            do {
                int taiklumas = (int) (Math.random() * 2);
                if (taiklumas == 1) {
                    int hard = (int) (20 + (Math.random() * 11));
                    counterHard += 1;
                    ilgisHard -= hard;
                    if (ilgisHard > 0) {
                        System.out.print(counterHard + "-as - " + hard + " mm (liko: " + ilgisHard + "mm ); ");
                    } else {
                        System.out.println();
                        System.out.println("Paskutinis smugis - " + hard + " mm, sugruda vini i lenta.");
                        System.out.println(kiekisHard + "-ajai ikalti prireike " + counterHard + " smugiu. (Is ju " + counterMiss + " buvo pro sali).");
                        System.out.println();
                    }
                } else {
                    int hard = (int) 0;
                    counterHard += 1;
                    counterMiss += 1;
                    System.out.print(counterHard + "-a pramazinom... ; ");
                }
            } while (ilgisHard > 0);
            ilgisHard = 85;
            counterHard = 0;
            counterMiss = 0;

        } while (kiekisHard < 5);
        System.out.println(oo);


        System.out.println("3.9 uzduotis");
        System.out.println(oo);
        System.out.println("Generuojam stringa is 50 random nesikartojanciu skaiciu nuo 1 iki 200, atskiriam tarpais");

        int countDigits = 50;
        String digits = "";

        do {
            String lastDigit = "";
            boolean itContains = digits.contains(lastDigit);

            do {
                int digitRand = (int) (1 + (Math.random() * 200));
                lastDigit = digitRand + "";
            } while (itContains == false);

            countDigits--;
            digits = digits + lastDigit + " ";

        } while (countDigits > 0);
        System.out.println(digits);
        System.out.println(oo);

        System.out.println("paliekam tik pirminius skaičius (kurie dalinasi be liekanos tik iš 1 ir patys savęs). Ddidėjimo tvarka, nuo mažiausio iki didžiausio. ");
        String primeDigits = "";
        String lastPrime = "";
        String[] arrOfdigits = digits.split(" ");

        int size = arrOfdigits.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            //// NEPAMIRSK!!!!!!!!!!!  reik dar idet kad prametytu ne pirminius /////////////////////////////////////////////////////////////////////////
            arr[i] = Integer.parseInt(arrOfdigits[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


//
//        System.out.println(arrOfdigits);
//        System.out.println(arrowOfDigits);
//        System.out.println(arrOfdigits[0]);
//        int check = parseInt(arrOfdigits[0]);
//        System.out.println(parseInt(arrOfdigits[arrOfdigits.length-1]));
//        System.out.println(check);
//
//


//////////////////// ARRAY's /////////////////////////

//  int sk = 5;
//  int[] numArr = new int[5];
//  int[] nA = {5,7,14,3,8};
//  nA = int sk = 5;  int sk = 5;   int sk = 5;   int sk = 5;   int sk = 5;
//  nA[2];     //3-ias yra = 14
//  nA[2] = 14;


// int [][] arr2d;
// arr2d [4][2] = nA[2];

//arr3d[][][]=
//arr4d[][][]=
//arrXd[][][]= neribota, bet duomenu kiekis auga eksponentiskai

//        int[] randomNumbers = {618, 5, 57, 51, 586, 498, 489, 9, 948, 49, 49, 49, 94384, 816, 16};
////
////        for (int i = 0; 1 < randomNumbers.length; i++) {
////            System.out.println(randomNumbers[i]);
////            System.out.println(randomNumbers[i] + " ");
////         }
//
//
//        // kanoninis sortinimas per TMP papildoma elementa (cia kaip su puodeliais vandens sukeitinejam)
//        int countTmp = 0;
//        for (int s = 0; s < randomNumbers.length; s++) {
//            for (int i = 0; i < randomNumbers.length - 1; i++) {
//                if (randomNumbers[i] > randomNumbers[ i + 1 ]) {
//                    int tmp = randomNumbers[i];
//                    randomNumbers[i] = randomNumbers[i + 1];
//                    randomNumbers[i + 1] = tmp;
//                }
//                countTmp++;
//            }
//        }
//        System.out.println();
//        System.out.println(countTmp);
//        for (int i = 0; i < randomNumbers.length; i++) {
//            System.out.print(randomNumbers[i]+ " ");
//        }
//
//        // Bubble sortinimas - 2x greiciau, nes nebesuka jau surastu iteraciju
//        int countBbl = 0;
//        for (int f = 0; f < randomNumbers.length; f++) {//10
//            for (int i = f+1; i < randomNumbers.length; i++) { //11-15
//                if (randomNumbers[f] > randomNumbers[ i ]) {
//                    int tmp = randomNumbers[f];
//                    randomNumbers[f] = randomNumbers[i];
//                    randomNumbers[i] = tmp;
//                }
//                countBbl++;
//            }
//        }
//        System.out.println();
//        System.out.println(countBbl);
//
//        for (int i = 0; i < randomNumbers.length; i++) {
//            System.out.println(randomNumbers[i]+ " ");
//        }


        //////////////// Uzduotys ////////////////////////////////
        System.out.println(oo);
        System.out.println("4.1 uzduotis");
        System.out.println("masyvas iš 30 elementų (indeksai nuo 0 iki 29), atsitiktiniai skaičiai nuo 5 iki 25.");

        int[] numArr30 = new int[30];
        for (int i = 0; i < numArr30.length; i++) {
            numArr30[i] = (int) (5 + (Math.random() * 21));
            System.out.print(numArr30[i] + " ");
        }
        System.out.println();
        System.out.println(oo);
        System.out.println("4.2 uzduotis");
        System.out.println("A) Suskaičiuokite kiek masyve yra reikšmių didesnių už 10;");
        int counter10 = 0;
        for (int i = 0; i < numArr30.length; i++) {
            if (numArr30[i] > 10) {
                counter10++;
            }
        }
        System.out.println("Didesniu uz 10 gauname: " +counter10 + " vnt.");

        System.out.println(oo);
        System.out.println("B) Randam didžiausią masyvo reikšmę ir jos indeksą arba indeksus ");
        int maxNumber = numArr30[0];
        for (int i = 0; i < numArr30.length; i++) {
            if (numArr30[i] > maxNumber) {
                maxNumber = numArr30[i];
            }
        }
        for (int i = 0; i < numArr30.length; i++) {
            if (maxNumber == numArr30[i]) {
                System.out.print("yra indekse [" + i + "] ");
            }
        }
            System.out.println("\nMaksimali reiksme yra = " + maxNumber);


        System.out.println(oo);
        System.out.println("C) Skaičiuojame visų porinių (lyginių) indeksų reikšmių sumą ");
        System.out.print("Poriniai indeksai yra: ");
        int sumEven = 0;
        for (int i = 0; i < numArr30.length; i+=2) {
            sumEven = sumEven + numArr30[i];
            System.out.print ( "[" + i + "] ");

        }

        System.out.println("\nVisų porinių (lyginių) indeksų reikšmių suma yra = "+ sumEven);

        System.out.println(oo);
        System.out.println("D) Kuriam naują masyvą, kurio reikšmės yra 1 uždavinio masyvo reikšmes minus tos reikšmės indeksas ");
        int arrMinus[] = new int[30];
        for (int i = 0; i < arrMinus.length; i++) {
            arrMinus[i] = numArr30[i] - i;
            System.out.print (arrMinus[i] + " ");
        }
        System.out.println();
        System.out.println(oo);
        System.out.println("E) Papildom masyvą +10 elementų su reikšmėmis nuo 5 iki 25 ");
        int arrPlus[] = new int[40];
        for (int i = 0; i < arrPlus.length; i++) {
            if (i < arrMinus.length) {
                arrPlus[i] = arrMinus[i];
            } else {
                arrPlus[i] = (int) (5 + (Math.random() * 21));
            }
        }
        arrMinus = arrPlus;
        for (int i=0; i < arrMinus.length; i++) {
            System.out.print(arrMinus[i] + " ");
        }

        System.out.println();
        System.out.println(oo);
        System.out.println("F) Padalinam i du naujus masyvus. Vienas iš neporinių indekso reikšmių, o kitas iš porinių");

        int oddLength = 0;
        int evenLength = 0;
        int arrOdd[] = new int[20];
        int arrEven[] = new int[20];
        for (int i = 0; i < arrMinus.length; i++) {
            if (i%2 == 0) {
                arrEven[i-evenLength] = arrMinus[i];
                oddLength++;
            } else {
                arrOdd[i-oddLength] = arrMinus[i];
                evenLength++;
            }
        }
        System.out.print("Pirmas is neporiniu: ");
        for (int i=0; i < arrOdd.length; i++) {
            System.out.print(arrOdd[i] + " ");
        }
        System.out.print("\nAntras is poriniu: ");
        for (int i=0; i < arrEven.length; i++) {
            System.out.print(arrEven[i] + " ");
        }
        System.out.println();



        System.out.println(oo);
        System.out.println("G) Pirminio masyvo elementus su poriniais indeksais padarom lygius 0 jeigu jie didesni už 15");
        int arrZeros[] = new int[30];
        for (int i=0; i<arrZeros.length; i++){
            if (i%2 == 0 && numArr30[i]>15) {
                arrZeros[i] = 0;
            } else {
                arrZeros[i] = numArr30[i];
            }
        }
        System.out.print("Pirminis masyvas: ");
        for (int i=0; i < numArr30.length; i++) {
            System.out.print(numArr30[i] + " ");
        }
        numArr30 = arrZeros;
        System.out.print("\nSu nuliais: ");
        for (int i=0; i < arrZeros.length; i++) {
            if (numArr30[i]>0) {
                System.out.print(numArr30[i] + " ");
            } else {
                System.out.print("(" + numArr30[i] + ") ");
            }
        }
        System.out.println();
        System.out.println(oo);
        System.out.println("H) Ieskom pirmo (mažiausio) indekso, kurio elemento reikšmė didesnė už 10");
        for (int i=0; i<numArr30.length; i++){
            if (numArr30[i]>10){
                System.out.println("Pirmas maziausias indeksas didesnis uz 10 yra : [" + i + "] , jo reiksme: "+ numArr30[i]);
                break;
            }
        }



        System.out.println(oo);
        System.out.println("4.3 uzduotis");
        System.out.println("Masyvas, is random A, B, C ir D, ilgis 200. Suskaičiuokite kiek yra kiekvienos raidės.");

        String chracters = "ABCD";
        Random rand = new Random();
        char[] text = new char[200];

        for (int i=0; i < 200; i++) {
            text[i] = chracters.charAt(rand.nextInt(chracters.length()));
        }

        int counterCharA = 0;
        int counterCharB = 0;
        int counterCharC = 0;
        int counterCharD = 0;

        for (int i=0; i < text.length; i++) {
            if (text[i] == chracters.charAt(0)) {
                counterCharA++;
            } else if (text[i] == chracters.charAt(1)){
                counterCharB++;
            } else if (text[i] == chracters.charAt(2)){
                counterCharC++;
            } else {
                counterCharD++;
            }
        }
        System.out.println(text);
        System.out.println("Gauname kad yra: A - " + counterCharA + " vnt. B - "+ counterCharB + " vnt. C - "+ counterCharC + " vnt. D - "+ counterCharD+" vnt.");

        System.out.println(oo);
        System.out.println("4.4 uzduotis");
        System.out.println("Išrūšiuojam 3 uždavinio masyvą pagal abecėlę.");
        char textSorted[] = text;

        for (int f = 0; f < textSorted.length; f++) {
            for (int i = f+1; i < textSorted.length; i++) {
                if (textSorted[f] > textSorted[i]) {
                    char tmp = textSorted[f];
                    textSorted[f] = textSorted[i];
                    textSorted[i] = tmp;
                }
            }
        }
        System.out.println(textSorted);

        System.out.println(oo);
        System.out.println("4.5 uzduotis");
        System.out.println("Sugeneruokite 3 masyvus pagal 3 uždavinio sąlygą.");
        char[] textUno = new char[200];
        char[] textDuos = new char[200];
        char[] textTres = new char[200];
//        int counterWTF = 0;

        for (int i=0; i < 200; i++) {
            textUno[i] = chracters.charAt(rand.nextInt(chracters.length()));
            textDuos[i] = chracters.charAt(rand.nextInt(chracters.length()));
            textTres[i] = chracters.charAt(rand.nextInt(chracters.length()));
        }
        char textTripple[][] = new char[200][3];

        for (int i=0; i < 200; i++) {
            textTripple[i][0] = textUno[i];
            textTripple[i][1] = textDuos[i];
            textTripple[i][2] = textTres[i];
        }

        System.out.print(textUno);
        System.out.println();
        System.out.print(textDuos);
        System.out.println();
        System.out.print(textTres);
        System.out.println();

        for (int i=0; i < 200; i++) {
            System.out.print(textTripple[i][0]);
            System.out.print(textTripple[i][1]);
            System.out.print(textTripple[i][2]+" ");
        }
//        int counterUnic = 0;
//        for (int i=0; i < textTripple.length; i++) {
//
//
//        }





// textTripple[0][i] = textUno[i];



 //       if (textTripple[i][0] && textTripple[i][1] && textTripple[i][2])

























    }
}







///


// Kabliataskiai - PRIVALOMI
// - error 500 - serverio klaida, 404 - puslapis nerastas
//  Kintamieji
// CRUD - create, read, update, delete
// w3scools.com
// stackoverflow.com - didziausia pasauline programuotoju bendruomene
// baeldung.com - Specializuota JAVA programuotoju bendruomene


