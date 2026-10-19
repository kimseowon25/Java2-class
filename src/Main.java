import java.util.*;

String[] menuName = {"아메리카노", "카페라떼", "바닐라라뗴"};
int[] menuPrice = {3000, 4000, 5000};

final int ERROR = -9;
final String ERROR001 = "ERROR001 : 잘못된 메뉴번호를 입력하셨습니다. 다시 입력해주세요";
final String ERROR002 = "ERROR002 : 잘못된 사이즈번호를 입력하셨습니다. 다시 입력해주세요.";

int getPrice(int menu)
{
    if(menu <= -1 || menu >= menuPrice.length)
        return ERROR;

    return menuPrice[menu];

}
int getSizePrice(int size)
{
    if(size < 0 | size >= 4)
        return ERROR;

    switch(size)
    {
        case 1:
            return 0; //톨
        case 2:
            return 500; //그란데
        case 3:
            return 1000; //벤티
        default :
            return ERROR;
    }
}

int calculateTotal(int price, int sizePrice, int quantity)
{
    return (price + sizePrice) * quantity;
}

void printReceipt(int menuChoice, int menuSize, int quantity, int total)
{
    String sizeName = "";
    switch(menuSize)
    {
        case 1:
            sizeName = "톨";
            break;
        case 2:
            sizeName = "그란데";
            break;
        case 3:
            sizeName = "벤티";
            break;
        default :
            System.out.println(ERROR002);
    }

    System.out.println("메뉴 : " + menuName[menuChoice]);
    System.out.println("크기 : " + sizeName);
    System.out.println("수량 : " + quantity);
    System.out.println("결제금액 : " + total);

}
void main()
{
    int menuChoice = 0; // 아메리카노
    int menuSize = 2; // 1: 톨/ | 2: 그란데/ | 3: 벤티
    int quantity = 2;

    int choicePrice = getPrice(menuChoice);
    if (choicePrice == ERROR)
    {
        System.out.println(ERROR001);
        return;
    }
    int sizePrice = getSizePrice(menuSize);
    if(sizePrice == ERROR)
    {
        System.out.println(ERROR002);
        return;
    }

    int totalPrice = calculateTotal(choicePrice, sizePrice, quantity);
    printReceipt(menuChoice, menuSize, quantity, totalPrice);
}
