class Mobile{
    String model;
    static int totalMobiles;

    Mobile(String model){
        this.model=model;
        totalMobiles++;
    }

    String getModel(){
        return model;
    }

    static int showTotalMobiles(){
        return totalMobiles;
    }
}

public class SimpleMobileTracker {
    public static void main(String argz[]){
    Mobile m1 = new Mobile("Samsung Galaxy M32");
    Mobile m2 = new Mobile("Redmi Note 12");

    System.out.println("Mobile1 model: "+m1.getModel());
    System.out.println("Mobile2 model: "+m2.getModel());

    System.out.println("Total Mobiles in stocks: "+Mobile.showTotalMobiles());
}
}
