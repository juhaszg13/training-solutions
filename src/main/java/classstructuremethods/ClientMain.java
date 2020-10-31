package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John Doe");
        client.setYear(1975);
        client.setAddress("Budapest,Vág ut 5");
        System.out.println("Name: " + client.getName());
        System.out.println("Year: " + client.getYear());
        System.out.println("Address: " + client.getAddress());
        client.migrate("Vác, Kiss ut 2.");
        System.out.println("New Address: " + client.getAddress());
    }
}
