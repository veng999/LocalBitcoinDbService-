import services.LocalBitcoinService;

public class Main {
    public static void main(String[] args) {
        LocalBitcoinService service = new LocalBitcoinService();
        service.takeUserDataModel();
       // service.removeUsersInformationById();
    }
}