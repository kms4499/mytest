public class SupersonicAirPlaneExample {
    public static void main(String[] args){
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeoff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.normal;
        sa.fly();
        sa.land();
    }
    
}
