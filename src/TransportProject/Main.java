package TransportProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int i = 1;
    static int whichTransportWillCrash;

    public static void main(String[] args) throws InterruptedException {
        printStars();
        TransportCamp kazanTransportCamp = new TransportCamp();
        kazanTransportCamp.buyPublicTransport();

        Route routeForBusses = new Route(TypeOfTransport.BUS, 74);
        Route routeForTrolleybusses = new Route(TypeOfTransport.TROLLEYBUS, 45);
        Route routeForTrams = new Route(TypeOfTransport.TRAM, 59);


        while (true) { // Симуляция дня
            if (i == 1){
                System.out.println("Текущее время - 5:00. Рабочий день водителей общественного транспорта начался.");
                System.out.println("Интервал автобусов: " + routeForBusses.firstInterval(kazanTransportCamp.getCamp(), TypeOfTransport.BUS) + " минут");
                System.out.println("Интервал троллейбусов: " + routeForTrolleybusses.firstInterval(kazanTransportCamp.getCamp(), TypeOfTransport.TROLLEYBUS) + " минут");
                System.out.println("Интервал трамваев: " + routeForTrams.firstInterval(kazanTransportCamp.getCamp(), TypeOfTransport.TRAM) + " минут");
                System.out.println(" ");
            }
            workDay(kazanTransportCamp.getCamp(), routeForBusses, routeForTrolleybusses, routeForTrams);

            System.out.println("Рабочих автобусов осталось: " + TransportCamp.b);
            System.out.println("Рабочих троллейбусов осталось: " + TransportCamp.trol);
            System.out.println("Рабочих трамваев осталось: " + TransportCamp.tram);
            i = 0;
            printStars();
            System.out.println("Хотите продолжить симуляцию транспортных развязок?");
            System.out.println("Введите 'Да' или 'Нет'");
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine().toLowerCase();
            if(answer.equals("нет")){
                return;
            }
        }


    }

    static void workDay(ArrayList<Transport> campOfTransport, Route rB, Route rTrol, Route rTram) throws InterruptedException {
            boolean crashed = false;
            int timeInMilSec = 2500;
            if(i == 0) {
                System.out.println("Текущее время - 5:00. Рабочий день водителей общественного транспорта начался.");
                System.out.println("Интервал автобусов: " + rB.interval() + " минут");
                System.out.println("Интервал троллейбусов: " + rTrol.interval() + " минут");
                System.out.println("Интервал трамваев: " + rTram.interval() + " минут");
                System.out.println(" ");
            }
            crashed = possibleCrash(campOfTransport);
            if(crashed == true){
                changeBrokenTransport(campOfTransport, rB, rTrol, rTram);
                // пересчёт интервала
            }else if(crashed == false){
                System.out.println("Весь транспорт полностью исправен.");
                printStars();
            }
            Thread.sleep(timeInMilSec);

            System.out.println("Текущее время - 8:00.");
            crashed = possibleCrash(campOfTransport);
            if(crashed == true){
                changeBrokenTransport(campOfTransport, rB, rTrol, rTram);
            }else if (crashed == false){
                System.out.println("Ни одно транспортное средство не сломалось.");
                printStars();
            }
            Thread.sleep(timeInMilSec);

            System.out.println("Текущее время - 11:00.");
            crashed = possibleCrash(campOfTransport);
            if(crashed == true){
                changeBrokenTransport(campOfTransport, rB, rTrol, rTram);
            }else if (crashed == false){
                System.out.println("Ни одно транспортное средство не сломалось.");
                printStars();
            }
            Thread.sleep(timeInMilSec);

            System.out.println("Текущее время - 14:00.");
            crashed = possibleCrash(campOfTransport);
            if(crashed == true){
                changeBrokenTransport(campOfTransport, rB, rTrol, rTram);
            }else if (crashed == false){
                System.out.println("Ни одно транспортное средство не сломалось.");
                printStars();
            }
            Thread.sleep(timeInMilSec);

            System.out.println("Текущее время - 17:00.");
            crashed = possibleCrash(campOfTransport);
            if(crashed == true){
                changeBrokenTransport(campOfTransport, rB, rTrol, rTram);
            }else if (crashed == false){
                System.out.println("Ни одно транспортное средство не сломалось.");
                printStars();
            }
            Thread.sleep(timeInMilSec);

            System.out.println("Текущее время - 20:00.");
            crashed = possibleCrash(campOfTransport);
            if(crashed == true){
                changeBrokenTransport(campOfTransport, rB, rTrol, rTram);
            }else if (crashed == false){
                System.out.println("Ни одно транспортное средство не сломалось.");
                printStars();
            }
            Thread.sleep(timeInMilSec);

            System.out.println("Текущее время - 23:00. Рабочий день подошёл к концу. Все автобусы отрправлены на базу.");
            printStars();
    }

    static boolean possibleCrash(ArrayList<Transport> camp){
        int percentageOfBroke;
        percentageOfBroke = (int) (Math.random() * (100 - 1) + 1);
        if (percentageOfBroke < 60){
            whichTransportWillCrash = (int) (Math.random() * (TransportCamp.countOfTransport - 1));
            camp.get(whichTransportWillCrash).setStatus(false); //Сломали транспорт тут
            return true;
        }else {
            return false;
        }
    }

    static void printIntervalsOfTransport(Route route){
        System.out.println("Интервал составляет: " + route.interval() + " минут");
        printStars();
    }

    static void changeBrokenTransport(ArrayList<Transport> campOfTransport, Route rB, Route rTrol, Route rTram){
        TypeOfTransport current = campOfTransport.get(whichTransportWillCrash).typeOfTransport;
        switch (current){
            case BUS:
                System.out.println("К несчастью, сломался автобус.");
                if(rB.countOfTransportAtPark > 0){
                    TransportCamp.b--;
                    rB.countOfTransportAtPark--;
                    System.out.println("Сломанное транспортное средство было заменено. Все интервалы остались прежними.");
                    printStars();
                    return;
                }else{
                    TransportCamp.b--;
                    System.out.println("К сожалению, в парке нет свободного транспорта, поэтому интвервал автобуса будет увеличен.");
                    System.out.println(" ");
                    printIntervalsOfTransport(rB);
                    return;
                }

            case TROLLEYBUS:
                System.out.println("К несчастью, сломался троллейбус.");
                if(rTrol.countOfTransportAtPark > 0){
                    TransportCamp.trol--;
                    rTrol.countOfTransportAtPark--;
                    System.out.println("Сломанное транспортное средство было заменено. Все интервалы остались прежними.");
                    printStars();
                    return;
                }else{
                    TransportCamp.trol--;
                    System.out.println("К сожалению, в парке нет свободного транспорта, поэтому интвервал троллейбуса будет увеличен.");
                    System.out.println(" ");
                    printIntervalsOfTransport(rTrol);
                    return;
                }

            case TRAM:
                System.out.println("К несчастью, сломался трамвай.");
                if(rTram.countOfTransportAtPark > 0){
                    TransportCamp.tram--;
                    rTram.countOfTransportAtPark--;
                    System.out.println("Сломанное транспортное средство было заменено. Все интервалы остались прежними.");
                    printStars();
                    return;
                }else{
                    TransportCamp.tram--;
                    System.out.println("К сожалению, в парке нет свободного транспорта, поэтому интвервал трамвая будет увеличен.");
                    System.out.println(" ");
                    printIntervalsOfTransport(rTram);
                    return;
                }
        }
    }

    static void printStars(){
            System.out.println("****************************************************************");
    }

}
