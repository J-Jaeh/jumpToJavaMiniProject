public class Car implements CarInterface {

    int maxSpeed;
    String oilType;
    int oilMount;
    int speed;

    public Car(int maxSpeed, String oilType, int oilMount, int speed) {
        this.maxSpeed = maxSpeed;
        this.oilType = oilType;
        this.oilMount = oilMount;
        this.speed = speed;
    }
    @Override
    public int on(int speed) {
        return speed;
    }

    @Override
    public int changeSpeed(int changespeed) {
        if(changespeed<=maxSpeed){
            speed = changespeed;
            return  speed ;
        }else{
            return maxSpeed;
        }
    }
    @Override
    public int breakCar() {
        return speed =0;
    }
    @Override
    public int off(){
        return speed=0;
    }
    public int chargingOil(int oil){
        return  oilMount + oil;
    }
    public void movingCar(int oil){
        if (oilMount>=0){
            oilMount-=oil;
        }else {
            System.out.println("please charging oil");
        }
    }

}



