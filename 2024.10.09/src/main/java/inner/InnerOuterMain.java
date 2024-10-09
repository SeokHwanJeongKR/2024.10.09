package inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter.Inner inner = new InnerOuter(1,2).new Inner();


        InnerOuter outer = new InnerOuter();
        //outer.setInnerOuterMethod(1,3);



    }


}
