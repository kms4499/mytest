public class SupersonicAirplane extends Airplane {
    public static final int normal =1;
    public static final int SUPERSONIC =2;

    public int flyMode = normal;

    public void fly(){
        if(flyMode == SUPERSONIC){
            System.out.println("초음속비행합니다.");
        }else{
            super.fly();
        }
    }
}
