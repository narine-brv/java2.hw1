package com.narine;

public class Severus_Snape extends Dumblеdore {

    private String team;
    private Patronus patronus;

    public Severus_Snape () {
    }

    public Severus_Snape(String name, int age, String wizard, String team, Patronus patronus) {
        super(name, age, wizard);
        this.team = team;
        this.patronus = patronus;
    }



    public void useASpell (String team, int number) {
        if (team == "Death eaters") {
            for (int i = 0; i < number; i++) {
                System.out.println("Avada Kedavra");
            }
        }
        if (team == "Dementors") {
            for (int i = 0; i < number; i++) {
                System.out.println("Expecto Patronum");
            }

        } else {
            System.out.println("Expelliarmus");
        }
    }

    public void useASpell (int number, String team){
        if (team == "Death eaters") {
            for (int i = 0; i < number; i++) {
                System.out.println("Avada Kedavra");
            }
        }
        if (team == "Dementors") {
            for (int i = 0; i < number; i++) {
                System.out.println("Expecto Patronum");
            }
        }
    }

    public final void useASpell (String team) {
        if (team == "Order of Pheonix") {
            System.out.println("Welcome, friends!");
        }
    }

    public String getInfo () {
        return super.getInfo() + "\nTeam: " + team + "\nPatronus name: " + patronus.getName() +
                "\nPatronus power: " + patronus.getPower();
    }

    public String getTeam() {
        return team;
    }

    public Patronus getPatronus() {
        return patronus;
    }
}
