public class Car {
    public double speed, init_distance, aPos, aNeg;

    public double createRand(double min, double max){
        if(min >= max){
            System.out.println("Wrong arguments");
        }
        double random = min + Math.random() * (max - min);
        return random;
    }

    public Car(){
        speed = 5.5; // Speed is between 5.5 and 22.2 mps, we can change here to test and gather data
        init_distance = 10; // between 10 and 150
        aPos = 1; //between 1 and 3
        aNeg = 1; //between 1 and 3
    }

    public double getSpeed(){
        return speed;
    }
    public double getDist(){
        return init_distance;
    }
    public double getPosAcc(){
        return aPos;
    }
    public double getNegAcc(){
        return aNeg;
    }
    public void setNegAcc(double d){
        aNeg = d;
    }
    public void setPosAcc(double d){
        aPos = d;
    }
    public void setSpeed(double d){
        speed = d;
    }
    public void setDist(double d){
        init_distance = d;
    }

}
