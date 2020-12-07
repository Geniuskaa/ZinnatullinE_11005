package TransportProject;


import java.util.ArrayList;

public class Route {
    private TypeOfTransport typeOfTransport;
    private int lengthOfRoute;
    private static double percentOfTransportAtTheRoute = 0.8;
    public int countOfTransportAtPark;

    Route(TypeOfTransport typeOfTransport, int lengthOfRoute){
        this.typeOfTransport = typeOfTransport;
        this.lengthOfRoute = lengthOfRoute;
    }

    int firstInterval(ArrayList<Transport> camp, TypeOfTransport type){
        if(TypeOfTransport.BUS == type){
            this.countOfTransportAtPark = TransportCamp.b - startOfDriversDay(camp);
            System.out.println("В парке " + this.countOfTransportAtPark + " автобусов");
            return formulaOfInterval(TransportCamp.b - this.countOfTransportAtPark, Bus.speed);
            // Формула интервала: (длину пути / кол-во транспорта / скорость)
            // Интервал сейчас выводится в минутах
        } else if(TypeOfTransport.TROLLEYBUS == type) {
            this.countOfTransportAtPark = TransportCamp.trol - startOfDriversDay(camp);
            System.out.println("В парке " + this.countOfTransportAtPark + " троллейбусов");
            return formulaOfInterval(TransportCamp.trol - this.countOfTransportAtPark, Trolleybus.speed);

        } else if(TypeOfTransport.TRAM == type){
            this.countOfTransportAtPark = TransportCamp.tram - startOfDriversDay(camp);
            System.out.println("В парке " + this.countOfTransportAtPark + " трамваев");
            return formulaOfInterval(TransportCamp.tram - this.countOfTransportAtPark, Tram.speed);
        }
        return 9999;
    }

    private int formulaOfInterval(int countOfTransport, int speed){
        double interval = ((double)(this.lengthOfRoute * 1000) / (double)(countOfTransport)/ 100 / (3600.0 / (double)((speed) * 1000)));
        return (int)(interval/60);
    }

    int interval(){
        if(this.typeOfTransport == TypeOfTransport.BUS){
            if (this.countOfTransportAtPark > 0) {
                return formulaOfInterval(TransportCamp.b - this.countOfTransportAtPark, Bus.speed);
            } else {
                return formulaOfInterval(TransportCamp.b, Bus.speed);
            }

            // Формула интервала: (длину пути / кол-во транспорта / скорость)
            // Интервал сейчас выводится в минутах
        }
        else if(this.typeOfTransport == TypeOfTransport.TROLLEYBUS) {
            if (this.countOfTransportAtPark > 0) {
                return formulaOfInterval(TransportCamp.trol - this.countOfTransportAtPark, Trolleybus.speed);
            } else {
                return formulaOfInterval(TransportCamp.trol, Trolleybus.speed);
            }

        }else if(this.typeOfTransport == TypeOfTransport.TRAM){
            if (this.countOfTransportAtPark > 0) {
                return formulaOfInterval(TransportCamp.tram - this.countOfTransportAtPark, Tram.speed);
            } else {
                return formulaOfInterval(TransportCamp.tram, Tram.speed);
            }
        }
        return 0;
    }


    private int startOfDriversDay(ArrayList<Transport> campOfTransport){
        int counterOfNumberOfCertainTransport = 0;
        // Выводит на маршрут percentOfTransportAtTheRoute транспорта
        for(int i = 0; i < campOfTransport.size(); i++){
            if(this.typeOfTransport.equals(campOfTransport.get(i).typeOfTransport)){
                counterOfNumberOfCertainTransport++;
            }
        }
        counterOfNumberOfCertainTransport = (int)((double)counterOfNumberOfCertainTransport * percentOfTransportAtTheRoute);
        return counterOfNumberOfCertainTransport;
    }
}
