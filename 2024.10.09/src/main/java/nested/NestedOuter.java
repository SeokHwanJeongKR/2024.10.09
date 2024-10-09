package nested;

public class NestedOuter {

    private int outClassValue = 3;
    private int outInstanceValue = 2; //인스턴스 멤버 변수


    static class Nested {

        private int nestedInstanceValue = 1;

        public void print() {
            //자신의 멤버에 접근
            System.out.println(nestedInstanceValue);


            //바깥 클래스의 스태틱 변수에는 접근 할 수 있다.
            //private 여도 접근 할 수 있다
            //System.out.println(outClassValue);


            //바깥 클래스의 인스턴스 멤버에 접근에는 접근 할 수 없다.
            //System.out.println(outInstanceValue);
        }
    }
}
