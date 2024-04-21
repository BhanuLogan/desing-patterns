package patterns.behavioral.template;

public class S3MiningService extends DataMiningService {
    @Override
    public byte[] extract() {
        String data = "This data is from S3";
        return data.getBytes();
    }
}
