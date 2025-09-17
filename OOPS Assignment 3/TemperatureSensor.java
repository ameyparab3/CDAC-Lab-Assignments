// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class TemperatureSensor{
    private int temperature;
    void setTemp(int n){
        if(n>=0&&n<=100){
            this.temperature=n;
        }else{
            System.out.println("Invalid Temperature.");
            this.temperature=n;
        }
    }
    String getTemp(){
        String str="";
        if(this.temperature>=0&&this.temperature<=100){
            str="Temperature = "+Integer.toString(this.temperature);
        }else{
            str="Temperature out of range.";
        }
        return str;
    }
}

class TemperatureSensor {
    public static void main(String[] args) {
        TemperatureSensor e1 = new TemperatureSensor();
        TemperatureSensor e2 = new TemperatureSensor();
        e1.setTemp(-4);
        e2.setTemp(74);
        System.out.println(e1.getTemp());
        System.out.println(e2.getTemp());

    }
}
