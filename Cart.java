import java.util.HashMap;

public class Cart {
    private HashMap<Menu, Integer> menuList = new HashMap<Menu, Integer>();
    private int totalAmount = 0;
    private int currentItemCount = 0;

    // 장바구니에 메뉴 담기
    boolean addMenu(Menu menu) {
        if (menuList.containsKey(menu)) {
            menuList.put(menu, menuList.get(menu)+1);
        } else {
            menuList.put(menu, 1);
        }
        totalAmount += menu.getMenuPrice();
        return true;
    }

    // Payment에서 requestPayment할때 Cart 클래스 자체를 넘긴다고 했을때, 총 금액 정보만 가져갈 수 있도록 함수 추가
    int getTotalAmount() {
        return  totalAmount;
    }

    // 카트에 담긴 항목 보기(없으면 비었다는 문자열, 있으면 카트 항목 가공한 문자열 리턴)
    // '2. 장바구니 보기' 때문에 추가
    String showCartInfo() {
        return "";
    }

    String showCartList() {
        return "주문 목록: ";
    }
}
