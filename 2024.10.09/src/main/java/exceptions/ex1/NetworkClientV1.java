package exceptions.ex1;

public class NetworkClientV1 {

    //접속 할 외부 서버 주소
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    // 외부 서버에 연결한다
    public String connect() {
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        //연결 성공
        System.out.println(address + "서버 연결 성공");
        return "success";
    }
    //연결한 외부 서버에 데이터를 전송한다.
    public String send(String data) {
        if (sendError) {
            System.out.println(address + "서버에 데이터 전송 실패 " + data);
            return "sendError";
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    //외부 서버와 연결을 해제 한다.
    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
     }
     public void ititError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
     }


}
