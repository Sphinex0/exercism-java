class Darts {
    int score(double xOfDart, double yOfDart) {
        double distance = Math.sqrt(Math.pow(xOfDart,2.0)+Math.pow(yOfDart,2.0));
        if (distance <= 1.0){
            return 10;
        }else if (distance <= 5.0){
            return 5;
        }else if (distance <= 10.0){
            return 1;
        }
        return 0;
    }
}
