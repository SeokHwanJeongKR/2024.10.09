package exceptions.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String adress = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(adress);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
