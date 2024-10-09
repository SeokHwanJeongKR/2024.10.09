package exceptions.ex1;



public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String adress = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(adress);

        client.ititError(data); //추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
