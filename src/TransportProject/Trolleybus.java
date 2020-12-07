package TransportProject;

public class Trolleybus extends Transport{
    public boolean status = true;
    public static int speed = 55;

    Trolleybus(TypeOfTransport type){
        super(type);
    }

    public int getSpeed() {
        return speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void display() {
        if (status == true) {
            System.out.println("Автобус полностью исправен.");
        }else {
            System.out.println("Автобус сломался и направлен в ремонт.");
        }

        System.out.println("Максимальноразрешённая скорость = " + speed + " км/ч.");
    }

}
