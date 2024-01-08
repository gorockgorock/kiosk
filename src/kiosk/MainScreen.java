package kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class MainScreen {

    ArrayList<Burger> burger = new ArrayList<>();
    ArrayList<FrozenCustard> frozenCustards = new ArrayList<>();
    ArrayList<Drinks> drinks = new ArrayList<>();
    ArrayList<Beer> beer = new ArrayList<>();


        public static void showMainscreen() {

            Burger ShackBuger = new Burger("ShackBurger","토마토 양상,쉑소스 토핑된 치즈버거",6900);
            Burger SmokeShack = new Burger("SmokeShack","애플 우드 칩으로 훈연한 베이컨, 매콤한 체리 페에 쉑소스가 토핑된 치즈버거", 8900);
            Burger ShroomBuger = new Burger(" ShroomBuger","몬스터 치즈와 체다 치즈로 속을 채우고 바삭하게 튀겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쉑소스를 올린 베지테리언 버거", 9400);

            burger.add(ShackBuger);
            burger.add(SmokeShack);
            burger.add(ShroomBuger);

            FrozenCustard Shakes = new FrozenCustard("Shakes", "바닐라 초콜릿,솔티드 카라멜, 블랙&화이트,스트로베리,피넛버터, 커피", 59000);
            FrozenCustard ShakeOftheWeek = new FrozenCustard("ShakeOftheWeek", "특별한 커스터드 플레이버", 6500);
            FrozenCustard RedBeanShake = new FrozenCustard("RedBeanShake","신선한 커스터드와 함께 우유와 레드빈이 블랜딩 된 시그널 쉐이크",6500);
            frozenCustards.add(Shakes);
            frozenCustards.add(ShakeOftheWeek);
            frozenCustards.add(RedBeanShake);

            Drinks FiftyFifty = new Drinks("FiftyFifty", "레모네이드와 아이스티의 만남", 3500);
            Drinks AbitaRootBeer = new Drinks("AbitaRootBeer", "청량감있는 독특한 미국식 무알콜 탄산음료", 3300);
            Drinks BottledWater = new Drinks("BottledWater", "지리산 암반대수층으로 만든 프리미엄 생수", 10);
            drinks.add(FiftyFifty);
            drinks.add(AbitaRootBeer);
            drinks.add(BottledWater);

            Beer ShackMeisterAle = new Beer("ShackMeisterAle", "뉴욕 브루클린 브루어리에서 특별히 제조한 맥주", 9800);
            Beer MagpieBrewingCo = new Beer("MagpieBrewingCo", "드래프트 페일 에일", 6800);
            beer.add(ShackMeisterAle);
            beer.add(ShackMeisterAle);



            System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                    "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                    "\n" +
                    "[ SHAKESHACK MENU ]\n" +
                    "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                    "2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                    "3. kiosk.Drinks          | 매장에서 직접 만드는 음료\n" +
                    "4. kiosk.Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                    "\n" +
                    "[ ORDER MENU ]\n" +
                    "5. kiosk.Order       | 장바구니를 확인 후 주문합니다.\n" +
                    "6. Cancel      | 진행중인 주문을 취소합니다.");
            System.out.println("선택: ");
            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();

            switch (select) {
                case 1 :
                    System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                            "\n" +
                            "[ Burgers MENU ]\n" +
                            "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                            "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                            "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
                    System.out.println("선택 : ");
                    int selectBurger = sc.nextInt();
                    Burger selectb = burger.get(selectBurger-1);
                    System.out.println("\"" + selectb.getName() + "|" + selectb.getDescription() +"| " + selectb.getPrice() + "\"\n"  +
                            "위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                            "1. 확인        2. 취소");

                    int sselect = sc.nextInt();
                    if(sselect == 1) {
                        Order order = new Order(selectb);
                        Cart cart = new Cart();
                        cart.addOrder(order);


                    }


            }
        }


    }

