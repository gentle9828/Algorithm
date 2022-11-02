package task;

/* 객체지향적 분석
/ 협동, 책임, 역할
/ 아는 것, 할 수 있는 것

 고객이 메뉴를 정하고 돈을 준비해서 캐셔에게 전달한다.
 캐셔는 돈을 확인하고 음료를 만들어달고 하고 주문한다.
 제작된 음료를 캐셔가 제공한다.
 ---------------------------------------
고객
아는 것 - 소지금, 소지물품
할 수 있는 것 - 구매 요청, 제품 인수

캐셔
아는 것 - 물품 금액, 제품,
할 수 있는 것 - 요금 검사, 제품 요구, 제품 인계

바리스타
아는 것 - 제품, 재고
할 수 있는 것 - 제품 제작, 제품 인계
*/

class Buyer {
    private int money;  // 소지금
    private String inventory; // 소지물품

    public void get_Product(int money, String product)
    {
        this.money -= money;
        this.inventory += product;
    }

    public int get_Money() {
        return money;
    }

    public String toString() {
        return "소지금 : " + money + "\t\t보유물품 : " + inventory;
    }

    Buyer(int money)
    {
        this.money = money;
        this.inventory = "";
    }
}

class Casher {
    private int salesVolume;

    void getSalesVolume() {
        System.out.println("매상 : " + salesVolume);
    }

    // 바리스타로부터 아메리카노를 받는다.
    public int casher_getCoffee(Barista barista) {
        return barista.makeComplete_coffee();
    }

    // 바리스타로부터 라떼를 받는다.
    public int casher_getMilk(Barista barista) {
        return barista.makeComplete_milk();
    }

    // 바리스타로부터 녹차를 받는다.
    public int casher_getGreentea(Barista barista) {
        return barista.makeComplete_greentea();
    }

    // 바리스타로부터 유자차를 받는다.
    public int casher_getYujutea(Barista barista) {
        return barista.makeComplete_yujutea();
    }

    String buy(int money, String name) {
        if(money >= 4000 && name.equals("아메리카노"))
        {
            salesVolume += 4000;
            return "아메리카노";
        }
        else if(money >= 5000) {
            if(name.equals("유자차"))
            {
                salesVolume += 5000;
                return "유자차";
            }
            else
                return "미등록상품";
        }
        else if(money >= 4500) {
            if(name.equals("라떼"))
            {
                salesVolume += 4500;
                return "라떼";
            }
            else if(name.equals("녹차"))
            {
                salesVolume += 4500;
                return "녹차";
            }
            else
            {
                return "미등록상품";
            }
        }
        else
            return null;
    }

    public String toString() {
        return "매출액 : " + salesVolume;
    }

    Casher(int salesVolume) {
        this.salesVolume = salesVolume;
    }
}


class Barista {
    private int coffee; // 제품, 재고
    private int milk; // 제품, 제고
    private int greentea; // 제품, 제고
    private int yujutea; // 제품, 제고

    // boolean에서 String으로 형을 변환하여 코드 수정
    public String Make_Tea(String product)
    {
        if(product.equals("아메리카노") && coffee >= 1)
            return "아메리카노";
        else if(product.equals("라떼") && milk >= 1)
            return "라떼";
        else if(product.equals("녹차") && greentea >= 1)
            return "녹차";
        else if(product.equals("유자차") && yujutea >= 1)
            return "유자차";
        else
            return null;
    }

    // 재고를 파악하기 위해 음료 제작후 수량을 빼주는 코드
    public int substractStock(String product) {
        if(product.equals("아메리카노"))
            return this.coffee -= 1;
        else if(product.equals("라떼"))
            return this.milk -= 1;
        else if(product.equals("녹차"))
            return this.greentea -= 1;
        else if(product.equals("유자차"))
            return this.yujutea -= 1;
        else
            return -1;
    }

    // 아메리카노 제작 완료
    public int makeComplete_coffee() {
        return coffee;
    }

    // 라떼 제작 완료
    public int makeComplete_milk() {
        return milk;
    }

    // 녹차 제작 완료
    public int makeComplete_greentea() {
        return greentea;
    }

    // 유자차 제작 완료
    public int makeComplete_yujutea() {
        return yujutea;
    }

    // 남은 재고를 출력하기 위한 코드
    public String toString() {
        return "남은 재고 \n" + "아메리카노 : " + coffee + "\n" + "라떼 : " + milk + "\n"
                + "녹차 : " + greentea + "\n" + "유자차 : " + yujutea + "\n";
    }

    Barista(int coffee, int milk, int greentea, int yujutea)
    {
        this.coffee = coffee;
        this.milk = milk;
        this.greentea = greentea;
        this.yujutea = yujutea;
    }

}

public class week7_2 {

    static int AMARICANO = 1, AMARICANO_COST = 4000;
    static int LATTE = 2, LATTE_COST = 4500;
    static int GREEN_TEA = 3, GREENTEA_COST = 4500;
    static int YUJU_TEA = 4, YUJUTEA_COST = 5000;

    public static void main(String[] args) {
        Buyer b = new Buyer(10000);
        Casher ch = new Casher(0);
        Barista ba = new Barista(10, 10, 10, 10);

        String want_drink = "유자차";
        System.out.println(want_drink + "를 구입합니다.");
        String order = ch.buy(b.get_Money(), want_drink);

        if(want_drink.equals(order)) {
            if(ba.Make_Tea(order).equals("아메리카노")) {
                System.out.println("커피제작 완료.");
                ba.substractStock(order);
                ch.casher_getCoffee(ba);
                b.get_Product(AMARICANO_COST, "아메리카노");
            }
            else if(ba.Make_Tea(order).equals("라떼")) {
                System.out.println("라떼제작 완료.");
                ba.substractStock(order);
                ch.casher_getMilk(ba);
                b.get_Product(LATTE_COST, "라떼");
            }
            else if(ba.Make_Tea(order).equals("녹차")) {
                System.out.println("녹차제작 완료.");
                ba.substractStock(order);
                ch.casher_getGreentea(ba);
                b.get_Product(GREENTEA_COST, "녹차");
            }
            else {
                System.out.println("유자차제작 완료.");
                ba.substractStock(order);
                ch.casher_getYujutea(ba);
                b.get_Product(YUJUTEA_COST, "유자차");
            }
        }

        System.out.println(b.toString());
        System.out.println(ch.toString());
        ch.getSalesVolume();
        System.out.println();
        System.out.println(ba.toString());


    }


}

