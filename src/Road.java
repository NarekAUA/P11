public class Road {
    public double lightDuration, intersectionDist;

    public Road(){
        lightDuration = 4.5; // between 2 and 5, we give the values and test
        intersectionDist = 5; // between 5 and 20
    }

    public double getDuration(){
        return lightDuration;
    }
    public void setDuration(double d){
        lightDuration = d;
    }

    public double getIntersection(){
        return intersectionDist;
    }

    public void setIntersection(double i){
        intersectionDist = i;
    }


    public double createRand(double min, double max){ // just in case we want to try random values
        if(min >= max){
            System.out.println("Wrong arguments");
        }
        double random = min + Math.random() * (max - min);
        return random;
    }
}
