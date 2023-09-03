class Point {
  int x;
  int y;

  String getLocation(){
    return "x : " + x + " , y : " + y; 
  }
}

class Point3D extends Point {
  int z;

  Point3D(int a, int b, int c){
    x = a;
    y = b;
    z = c;
  }

  String getLocation(){
    //return "x :" + x + "y :" + y + "z :" + z; 
    return super.getLocation() + " , z : " + z; //overriding
  }
}

public class Overriding {
  public static void main(String args[]) {
    Point3D p = new Point3D(1,2,3);
    System.out.println(p.getLocation());
  }
}

//오버라이딩 : 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것.
//부모, 자식 클래스가 동일한 메서드 사용하면서 자식 클래스는 다른 결과물을 보여주고 싶은 경우 사용.

//오버라이딩 조건
//1. 메서드 이름 동일
//2. 파라미터 형태 동일
//3. 리턴 형태 동일
//4. 접근 제어자는 조상 클래스의 매서드보다 좁은 범위로 변경 불가
//5. 예외의 범위는 조상이 더 넓어야 한다. 조상 메서드의 예외가 자식 메서드의 예외를 포함하고 있어야 한다.
