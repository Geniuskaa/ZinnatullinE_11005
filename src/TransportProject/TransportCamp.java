package TransportProject;

import java.util.ArrayList;

public class TransportCamp { // Нормально ли использовать 3 static`а в полях?
    public static int countOfTransport = 33;
    public static int numberOfTypesOfTransport = 3;
    private static ArrayList<Transport> camp = new ArrayList<>();
    static int b;
    static int trol;
    static int tram;


    public void buyPublicTransport(){
        b = 0;
        trol = 0;
        tram = 0;

        for (int i = 0; i < countOfTransport; i++){
            int random = (int) (Math.random() * ((numberOfTypesOfTransport - 1) + 1));
            switch (random){
                case 0:
                    b++;
                    camp.add(new Bus(TypeOfTransport.BUS));
                    break;
                case 1:
                    trol++;
                    camp.add(new Trolleybus(TypeOfTransport.TROLLEYBUS));
                    break;
                case 2:
                    tram++;
                    camp.add(new Tram(TypeOfTransport.TRAM));
                    break;
            }
        }

        System.out.println("Городом былло закуплено: ");
        System.out.println(b + " - автобусов");
        System.out.println(trol + " - троллейбусов");
        System.out.println(tram + " - трамваев");
        Main.printStars();
        }


    public ArrayList<Transport> getCamp() {
        return camp;
    }

    void display(){
        System.out.println(camp);
    }

}
