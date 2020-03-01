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

        // This block is for assuming Vmax is bounded

        double vfinal1 = vInit + aPos * t; // Final Velocity should be between 13.8 and 27.8 mps
        double vfinal2 = vInit - aNeg * t;
        System.out.println("Final speed is " + vfinal1);

        if(vfinal1 > 27.8){
            aPos = (27.8 - vInit)/t;
            if(aPos < 1){
                aPos = 1;
            }
            if(aPos > 3){
                aPos = 3;
            }
            System.out.println("New Positive Acceleration is " + aPos);
        }
        if(vfinal2 < 13.8){
            aNeg = (13.8 - vInit)/t;
            if(aNeg < 1){
                aNeg = 1;
            }
            if(aNeg > 3){
                aNeg = 3;
            }
            System.out.println("New Negative Acceleration is " + aNeg);
        }

        // End of the block

        // This block is for assuming there are 2 cars
        // Also in an ideal case there would be another function that would take 2nd car as an argument, but here I'll just create the car

        Car c2 = new Car();
        c2.setDist(c.getDist() + 20); // I could add any value between 10 and 100

        // The rest of the code will almost be the same except we'll only discuss the case when car 1 accelerates,
        // because if it stops, car 2 will have to stop.

        //End of this block

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
