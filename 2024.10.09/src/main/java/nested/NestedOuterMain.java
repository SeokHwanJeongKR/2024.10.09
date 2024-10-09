package nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        // 기존 클래스 호출 (Class) 굳이 인스턴스화 필요 없음. 비교용으로 인스턴스화 시킴
        NestedOuter nestedOuter = new NestedOuter();



        //---------------------------------------------------------------------

        // 정적 중첨 클래스 호출 (static nested Class)
       NestedOuter.Nested nested = new NestedOuter.Nested();
        // Classname.staticNestedClass 변수이름 = new Classname.staticNestedClass



    }

}
