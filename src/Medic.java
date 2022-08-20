public class Medic extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Medic подлечил" + "ВОИНА");



    }



    private int healPoints = 40;


    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
    public void increaseExperience() {
        healPoints = healPoints + (healPoints * 10) / 100;
        System.out.println("количество единиц лечения состовляет: " + healPoints);
    }




}
