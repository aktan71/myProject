package OOP;
public class Computer {
    private String name;
    private int ram;
    private int hdd;
    private double weight;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getRam(){
        return ram;
    }

    public void setRam(int newRam){
        if(newRam>0) {
            ram = newRam;
        }else {
            System.out.println("gg");
        }
    }

    public int getHdd(){
        return hdd;
    }
    public void setHdd(int newHdd){
        hdd = newHdd;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double newWeight){
        weight = newWeight;
    }

    public void on(){
        print("Я включился");
    }
    public void off(){
        print("Я выключился");
    }
    public void load(){
        print("Идет загрузка");
    }
    private void print(String str){
        System.out.println(str);
    }

}
