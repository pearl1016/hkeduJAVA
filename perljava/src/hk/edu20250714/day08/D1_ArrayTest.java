package hk.edu20250714.day08;

import java.util.Arrays;
import java.util.Iterator;

public class D1_ArrayTest {
   
   //멤버 필드에 선언
   public int [] test;//선언
   public int [][] test2;
   
   //생성자를 통해 배열 정의
   public D1_ArrayTest() {
//      test = new int[3];//정의
//      test2 = new int[3][3];//정의 
      this(3, 3);//중복된 초기화 코드가 있다면 this()사용하면 됨
   }
   //생성자 오버로딩을 통해 배열 길이 정의
   public D1_ArrayTest(int n) {
      test = new int[n];
      test2 = new int[n][n];
   }
   
   public D1_ArrayTest(int n, int m) {
      test = new int[n];
      test2 = new int[m][n];
   }
   
   public static void main(String[] args) {
      //선언 방법
      //1.리터럴 방식: 기본타입처럼 선언하는 방법
      int [] a = {1,2,3,4,5};//바로 선언과 동시에 값도 초기화해야함
      int [] b;//선언과 초기화를 따로 진행할 수 없음
//             b = {1,2,3,4,5};//(X)
            b = a;//복사
            b[0] = 10;
            System.out.println(Arrays.toString(a));
      //값을 가져오는 방법: 인덱스를 통해서 가져돈다. 
      int val = a[0];//값을 가져오기
      a[0] = 10;//값을 저장하기
      
      //2.new를 사용해서 정의
      int [] b2;
              b2 = new int[] {1,2,3,4,5};
              
      int [] b3;
            b3 = new int[5];
      //값 초기화
      for (int i = 0; i < b3.length; i++) {
         b3[i] = i+1;
      }
      //값 가져와서 출력
      for (int i = 0; i < b3.length; i++) {
         System.out.println(b[i]);
      }
      //Arrays 클래스: toString()사용해봤음
      Arrays.sort(b3);//정렬함 --> mutable하기 때문에 원본(b3)내용 바뀜
      System.out.println(Arrays.toString(b3));
      
      //imumutable함 --> 다시 대입해야 원본이 변경
      String s = "ss";
      s = s.replace("s", "p");
      System.out.println(s);
      
      //shallow copy(얕은 복사: 주소복사)
      int [] c = {1,2,3,4,5,6};
      int [] d = c;//주소 전달
      d[0] = 10;//복사 받은 쪽에서 값을 바꾸면 원본(c)도 바뀐다.
      System.out.println(Arrays.toString(c));
      
      //deep copy(깊은 복사: 값을 복사)
      int []e = new int[6];
      for (int i = 0; i < e.length; i++) {
         e[i] = c[i];
      }
      e[3] = 50;
      System.out.println(Arrays.toString(c));
      
      //값이 참조타입일 경우 주소복사 -> shallow copy가 됨
//      D1_StarView[]f = new D1_StarView[5];
      //[주소1, 주소2, 주소3..]
      
      //배열의 값이 기본타입일 경우 적용됨
      System.arraycopy(c, 0, e, 0, c.length);
      e[1] = 100;
      System.out.println(Arrays.toString(c));
      
      
      //참조타입 배열: Person 클래스 작성 --> [person, person...]
      Person[] person = {new Person("박보영"), 
                     new Person("이준영"), 
                     new Person("최우식")};
      
//      Person[] person2 = person;//얕은 복사
      
      Person[] person2 = new Person[person.length];
//      System.arraycopy(person, 0, person2, 0, person.length);//얕은 복사
      
      for (int i = 0; i < person.length; i++) {
         person2[i] = (Person) person[i].clone();//깊은 복사
      }

      person2[0].name = "김태희";
      System.out.println(person2[0].name);
      System.out.println(person[0].name);
      
      //2차원 배열 선언방법
      int [][] aa = {{1,2,3},{4,5,6}};
      int [][] bb = new int [][] {{1,2,3},{4,5,6}};
      int [][] cc = new int [2][3];
      cc[0] = new int[] {1,2,3};
      cc[1] = new int[] {4,5,6};
      
      //배열의 길이값
      System.out.println("aa의 배열의 길이:"+aa.length);
      System.out.println("aa의 배열의 내부 배열 길이:"+aa[0].length);
      
      for (int i = 0; i < aa.length; i++) {
         for (int j = 0; j < aa[0].length; j++) {
            System.out.print(aa[i][j]+"("+i+","+j+")\t");
         }
         System.out.println();
      }
      //배열 변환
      
      //2차원배열 --> 1차원배열 변환
      int[] dd = new int[bb.length*bb[0].length];
      //공식: i*col+j = 0*3+0 = 0
      //      i*col+j = 1*3+0 = 1
      for (int i = 0; i < bb.length; i++) {
         for (int j = 0; j <bb[0].length; j++) {
            dd[i*bb[0].length+j] = bb[i][j];
            System.out.printf(
                  "(%d),(%d,%d)\n",i*bb[0].length+j, i, j);
         }
      }
      
      //1차원배열 --> 2차원배열 변환
      //공식: [i/col][i%col]
      int [][] ee = new int [2][3];
      int col = ee[0].length;
      for (int i = 0; i < dd.length; i++) {
         ee[i/col][i%col]=dd[i];
         System.out.printf("(%d,%d)\n",i/col,i%col);
      }
      for (int i = 0; i < ee.length; i++) {
         System.out.println(Arrays.toString(ee[i]));
      }
   }
   
   
}
