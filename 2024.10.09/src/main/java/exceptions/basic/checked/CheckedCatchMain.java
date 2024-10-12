package exceptions.basic.checked;

public class CheckedCatchMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");

    }
}
