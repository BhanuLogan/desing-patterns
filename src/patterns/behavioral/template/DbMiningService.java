package patterns.behavioral.template;

public class DbMiningService extends DataMiningService {

    @Override
    public byte[] extract() {
        String data = "This data is from DB";
        return data.getBytes();
    }

}
