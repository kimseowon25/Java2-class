// 1. 상영관 이름 배열
String[] screenTypes = {"일반 2D", "입체 3D", "IMAX", "4DX"};
//2. 기본 티켓 가격 배역
int[] basePrices = {14000, 16000, 22000, 20000};

// 3. 예외처리
final int ERROR = -9;
String ERROR001 = "잘못된 상영관 선택입니다.";
String ERROR002 = "잘못된 가격 선택입니다.";

int getPrice ( int selectedType)
{
    return basePrices[selectedType];
}

int getTimeOptionName ( int timeCode)
{
    return 0;
}

int getTimeOptionPrice(int timeCode)
{
    switch (timeCode)
    {
        case 1 :
            return -3000; // 조조할인
        case 2 :
            return 2000; // 프라임타임/주말 피크
        case 3 :
            return -2000; // 심야 할인
        case 4 :
            return 0; // 일반 시간대
        default:
            return 0; // 그 외
    }
}




void main() {
    // 4. switch문을 사용해서 추가 요금을 반환하기

    // 5. 영수증 출력
    int timeCode = 1;
    int count = 2;
}