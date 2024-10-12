package exceptions.basic.checked;

public class MyCheckedException extends Exception{

    /*
     *  Exception을 상송 받은 예외는 체크 예외가 된다.
     * */

    public MyCheckedException(String message) {
        super(message);
    }
    // 예외를 상속받은 예외 메서드


}
