import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int index = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[index];
    }

    String randomShipRegistryNumber() {
        int registryNumber = 1000 + random.nextInt(9000); // Generates a number between 1000 and 9999
        return "NCC-" + registryNumber;
    }

    double randomStardate() {
        return 41000.0 + (random.nextDouble() * 1000.0);
    }
}