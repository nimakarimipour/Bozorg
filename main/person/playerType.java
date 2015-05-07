package person;

/**
 * Created by nima on 5/6/15.
 */

enum playerType {

    SAMAN("SAMAN", 0, 100, 2, 3, 5) {

    },
    JAFAR("JAFAR", 1, 0, 2, 6, 4) {

    },
    REZA("REZA", 2, 10, 2, 3, 5) {

    },
    HASIN("HASIN", 3, 5, 3, 3, 1) {

    };

    playerType(String n, int i, int f, int s, int v, int p) {
        name = n;
        id = i;
        numberOfFans = f;
        speed = s;
        vision = v;
        power = p;
    }

    String name;
    int id;
    int numberOfFans, power, vision, speed;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfFans() {return numberOfFans;}

    public int getPower() { return power;}

    public int getVision(){ return vision;}

    public int getSpeed() { return speed;}

    playerType getById(int i) {
        for (playerType p : playerType.values()) {
            if (p.getId() == i) {
                return p;
            }
        }
        return null;
    }
}
