public class Main {
    public static void main(String[] args){
        Car c = new Car();
        Road r = new Road();

        int z = ifAccelerate(c, r);
        System.out.println(z);

    }

    public static int ifAccelerate(Car c, Road r){
        double  vInit = c.getSpeed();
        double  t = r.getDuration();
        double  aPos = c.getPosAcc();
        double  aNeg = c.getNegAcc();
        double  x = c.getDist();
        double  inters = r.getIntersection();

        System.out.println("Speed: " + vInit + ". Initital Distance: " + x + ". Positive a: " + aPos + ". Negative a: " + aNeg);
        System.out.println("Light Duration: " + t + ". Intersection Distance: " + inters + ".");

        double dist1, dist2;
        dist1 = (vInit * t) + (aPos * t * t/2);
        dist2 = (vInit * t) - (aNeg * t * t/2);
        System.out.println("Distance with negative a is " + dist2 + ". Distance with positive a is " + dist1 + ".");

        if(dist1 >= x + inters){
            return 1;
        } else if(dist2 <= x){
            return 0;
        } else {
            System.out.println("Danger zone");
            return -1;
        }
    }
}
