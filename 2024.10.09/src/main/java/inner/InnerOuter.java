package inner;

public class InnerOuter {

    private  int outClassValue = 3;
    private  int outInstanceValue =2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            //자기 자신에게 접근
            System.out.println(innerInstanceValue);

            //outerClass의 instance 변수에 접근
            //private 여도 접근 할 수 있다
            System.out.println(outInstanceValue);

            //outerClass static 변수에 접근
            //private 여도 접근 할 수 있다
            System.out.println(outClassValue);


        }

    }
    InnerOuter() {

    }
    InnerOuter(int outClassValue, int outInstanceValue) {
        this.outClassValue = outClassValue;
        this.outInstanceValue = outInstanceValue;
        System.out.println("출력 테스트 " + outClassValue + "요" + outInstanceValue);
    }
    public void setInnerOuterMethod(int outClassValue, int outInstanceValue) {
        this.outClassValue = outClassValue;
        this.outInstanceValue = outInstanceValue;
        System.out.println("출력 테스트 " + outClassValue + "요" + outInstanceValue);
    }

}
