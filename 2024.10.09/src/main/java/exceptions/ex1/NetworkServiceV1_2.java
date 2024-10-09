package exceptions.ex1;



public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String adress = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(adress);

        client.ititError(data); //추가
        
        //결과가 성공이 아니다 -> 오류다
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult) ;
            return;
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
