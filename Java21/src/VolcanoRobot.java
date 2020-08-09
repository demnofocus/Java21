class VolcanoRobot{
    String status;
    int speed;
    float temperature;

    VolcanoRobot() {
    }
    
    void checkTemperature(){
        if(temperature>660){
            status = "returning home";
            speed = 5;
        }
    }
    
    void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
    
    //Day 05
    VolcanoRobot(String status, int speed, float temperature){
        this.status = status;
        this.speed = speed;
        this.temperature = temperature;
    }
}