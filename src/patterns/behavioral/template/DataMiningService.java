package patterns.behavioral.template;

public abstract class DataMiningService {
    
    /*
     * this class will download data from different sources like DB, File, S3 etc and analyse the data
    */

    public void mine() {   
        byte[] data  = extract();
        String parsed = parseData(data);
        analyse(parsed);
    }

    public String parseData(byte[] data) {
        return new String(data);
    }

    public abstract byte[] extract();

    public void analyse(String data) {
        System.out.println("Analysing the data - " + data);
     }
}
