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
