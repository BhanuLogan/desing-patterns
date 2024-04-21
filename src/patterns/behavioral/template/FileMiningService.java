package patterns.behavioral.template;

public class FileMiningService extends DataMiningService {
    @Override
    public byte[] extract() {
        String data = "This data is from File";
        return data.getBytes();
    }
}
