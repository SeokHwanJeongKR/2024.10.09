package exceptions.basic.unchecked;

/*
* 예외를 잡지 않으면 자동으로 밖으로 던진다
* */

public class Service {
    Client client = new Client();

    public void callCatch(){

        try {
            client.call();
        } catch (MyUncheckedException e) {
            //예외 처리 로직
            System.out.println("Unchecked 예외 처리 , Message = " + e.getMessage());
        }

        System.out.println("정상 로직");
    }
    /* 예외를 잡지 않아도 된다
    *  체크 예외와 다르게 throws를 하지 않아도 된다.
    * */

    public void callThrow() {
        client.call();
    }

}