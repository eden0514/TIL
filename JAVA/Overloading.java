//오버로딩 : 같은 이름의 메서드를 중복 정의한 것.
//오버로딩 조건
//1. 메서드 이름 동일
//2. 매개변수의 개수 및 타입 상이

class Disply {
    static void display(int num1) { System.out.println(num1); }
   static void display(int num1, int num2) { System.out.println(num1 * num2); }
    static void display(int num1, double num2) { System.out.println(num1 + num2); }
}

public class Overloading {
  
    public static void main(String[] args) {

        Disply test = new Disply();

        test.display(10); // 1
        test.display(10, 20); //200
        test.display(10, 3.14); // int, double => 13.14
        test.display(10, 'a');//'a' 아스키코드 97 => 970
    }
}

//이름이 같고 매개변수가 다른 정적 메서드 오버로딩 가능
//main() 메서드도 오버로딩 가능
//사용자 정의 오버로드된 연산사 허용하지 않음. 내부적으로 자바는 연산자를 오버로드함
//반환 유형의 차이는 오버로딩 조건이 될 수 없음
