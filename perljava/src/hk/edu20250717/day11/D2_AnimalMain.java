package hk.edu20250717.day11;

public class D2_AnimalMain {

   public static void main(String[] args) {
      D2_Animal human = new D2_Human();
      human.move();
//      human.eat();//설계도에 공개된 메서드만 사용가능함.(부모에 없는 메서드)
      D2_Human humanEat = (D2_Human)human;//자식타입으로 형변환
      humanEat.eat();//이제 사용할 수 있음
      
      System.out.println("==================");
      //다형성 발생원리 3가지
      //1.부모의 타입으로 자식을 생성한다. 
      D2_Animal AnimalH = new D2_Human();
      D2_Animal AnimalT = new D2_Tiger();
      D2_Animal AnimalE = new D2_Eagle();
      
      //2.부모의 타입으로 자식을 참조한다.
      D2_Tiger tiger = new D2_Tiger();
      D2_Animal animalTT = tiger;
      
      moveAnimal1(human);
      
   }
   
   //자식타입의 서로 다른 여러 객체들을 참조할 수 있다.
   //(파라미터에 선언된 부모타입으로 가능해짐)
   public static void moveAnimal1(D2_Animal animal) {
      //메서드 오버라이딩: 부모의 메서드를 재정의한다.
      animal.move();//하나의 부모타입으로 여러 형태를 나타낼 수 있다.(다형성
   }
   
}
      