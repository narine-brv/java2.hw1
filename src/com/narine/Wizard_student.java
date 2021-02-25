package com.narine;

public final class Wizard_student extends Severus_Snape {

    private Faculty faculty;

    public Wizard_student () {
    }

    public Wizard_student(String name, int age, String wizard, String team, Patronus patronus, Faculty faculty) {
        super(name, age, wizard, team, patronus);
        this.faculty = faculty;
    }

    public void copyMetod (Wizard_student student) {
        this.faculty = student.getFaculty();
    }

    @Override
    public void useASpell(int number, String team) {
        super.useASpell(number, team);
        if (team == "Order of Pheonix") {
            for (int i = 0; i < number; i++) {
                System.out.println("Dumbledore is dead");
            }
        }
    }

    public final String getInfo () {
        return super.getInfo() + "\nFaculty: " + faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }


}
