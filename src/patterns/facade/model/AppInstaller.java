package patterns.facade.model;

public class AppInstaller {
    public void downloadAppData() {
        System.out.println("Downloading app data...");
    }

    public void downloadApkFile(String app) {
        System.out.println("Successfully downloaded APK - " + app);
    }
}
