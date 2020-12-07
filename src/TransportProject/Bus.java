package TransportProject;

public class Bus extends Transport {
    public boolean status = true;
    public static int speed = 60;

    Bus(TypeOfTransport type){
        super(type);
    }

    public int getSpeed() {
        return speed;
    }

    public void setStatus(boolean value) {
        this.status = value;
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
