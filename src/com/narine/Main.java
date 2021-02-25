package com.narine;

public class Main {

    public static void main(String[] args) {

        Dumblеdore dumblеdore = new Dumblеdore("Dumbledore", 70, "Yes");
        System.out.println(dumblеdore.getInfo());

        System.out.println("-------------------------");

        Patronus patronusSnape = new Patronus("Doe", 100);
        Severus_Snape severus_snape = new Severus_Snape("Severus Snape",35, "Yes",
                "Order of Pheonix", patronusSnape);
        System.out.println(severus_snape.getInfo());

        severus_snape.useASpell("Order of Pheonix");
        severus_snape.useASpell(3,"Death eaters");
        severus_snape.useASpell("Dementors", 2);

        System.out.println("-------------------------");

        Patronus patronusHarry = new Patronus("Deer", 100);
        Wizard_student harry_potter = new Wizard_student("Harry Potter", 17, "Yes",
                "Order of Pheonix", patronusHarry, Faculty.GRYFFINDOR);
        System.out.println(harry_potter.getInfo());

        harry_potter.useASpell(3, "Order of Pheonix");

        System.out.println("-------------------------");

        Patronus patronusMalfoy = new Patronus("Dragon",80);
        Wizard_student malfoy = new Wizard_student("Malfoy", 17,"Yes",
                "Death eaters", patronusMalfoy, Faculty.SLYTHERIN);
        System.out.println(malfoy.getInfo());

        System.out.println("-------------------------");

        Wizard_student copy = new Wizard_student();
        malfoy.copyMetod(harry_potter);
        System.out.println(malfoy.getInfo());
        copy.useASpell("Dementors", 5);






    }


}
