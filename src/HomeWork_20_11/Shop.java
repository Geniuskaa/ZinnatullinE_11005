package HomeWork_20_11;

import java.util.Scanner;

public class Shop {
    public void start(){
        Scanner in = new Scanner(System.in);
        Buyer firstBuyer = new Buyer("Emil", 20, "man");
        Order[] historyOfOrders = new Order[10]; // история покупок


        Product[] shop = new Product[4]; // ассортимент магазина
        shop[0] = new Product("Iphone 12", 900, "U.S.A");
        shop[1] = new Product("Iphone 12 mini", 650, "U.S.A");
        shop[2] = new Product("Iphone 12 pro", 1000, "U.S.A");
        shop[3] = new Product("Iphone 12 pro Max", 1200, "U.S.A");

        System.out.print("Введите имя пользователя: ");
        String name = in.nextLine();
        System.out.println("----------------------------------------------");
        // Если у нас будет массив клиентов то пробежимся по нему в поисках этого имени
        if (name.equals(firstBuyer.getName())) {
            System.out.println("Здравствуйте, " + name + "!");
            for(int t=0; t > -1; t++) {
                System.out.println("Что вы желаете купить? Для выбора товара введите номер его позиции!");
                for (int i = 0; i < shop.length; i++) {
                    System.out.print((i + 1) + ".");
                    System.out.println(shop[i].getNameOfProduct());
                }
                System.out.println("----------------------------------------------");
                System.out.print("Мой выбор: ");
                int choose = in.nextInt();
                choose--;
                int i = 0;
                while (historyOfOrders[i] != null) {
                    i++;
                }
                historyOfOrders[i] = new Order(firstBuyer, shop[choose]);
                // Если есть строчка 38 то надобность 40-ой отпадает?
                //historyOfOrders[i].purchase(historyOfOrders, i);
                System.out.println("");
                System.out.println("Вы успешно совершили покупку! В скором времени мы доставим вам её!");
                System.out.println("Хотите купить чего-нибудь ещё? Введите 'Да' или 'Нет'.");
                String answer = in.next().toLowerCase();
                if (answer.equals("нет")) {
                    System.out.println("Благодарим вас за покупку! Будем рады видеть вас снова!");
                    //return;
                    break;
                }
            }
        }else{
            System.out.println("Такого пользователя не существует. Пройдите регистрацию или попробуйте ввести имя ещё раз!");
        }

        historyOfOrders[0].display();
    }
}
