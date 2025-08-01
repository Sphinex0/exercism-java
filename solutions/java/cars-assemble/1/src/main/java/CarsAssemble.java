public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double max = speed * 221;
        if (speed <=4){
            return max;
        }else if (speed<=8){
            return max * 0.9;
        }else if (speed == 9){
            return max * 0.8;
        }
            return max * 0.77;
        
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
