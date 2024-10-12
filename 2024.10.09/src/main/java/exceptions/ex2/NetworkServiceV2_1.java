package exceptions.ex2;



public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String adress = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(adress);

        client.ititError(data); //추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
