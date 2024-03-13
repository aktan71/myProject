package OOP;
public class Computer {
    public String name;
    public int ram;
    public int hdd;
    public double weight;

    public void on(){
        System.out.println("Я включился" + name);
    }
    public void off(){
        System.out.println("Я выключился");
    }
    public void load(){
        System.out.println("Идет загрузка");
    }
}
