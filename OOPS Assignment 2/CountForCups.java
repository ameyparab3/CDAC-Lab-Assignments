class TeaCup{
    String teaType;
    static int totalCups;
    TeaCup(String teaType){
        this.teaType = teaType;
        totalCups++;
    }
    String TeaCupGet(){
        return teaType;
    }
    static void showTotalCups(){
        System.out.println("Total cups made: "+totalCups);
    }
}

class CountForCups {
    public static void main(String argz[]){
        TeaCup c1 = new TeaCup("Masala Tea");
        TeaCup c2 = new TeaCup("Ginger Tea");
        TeaCup c3 = new TeaCup("Green Tea");

        System.out.println("Cup1 type: "+c1.TeaCupGet());
        System.out.println("Cup2 type: "+c2.TeaCupGet());
        System.out.println("Cup3 type: "+c3.TeaCupGet());

        TeaCup.showTotalCups();
    }
}