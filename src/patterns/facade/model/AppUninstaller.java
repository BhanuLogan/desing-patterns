package patterns.facade.model;

public class AppUninstaller {

    public void clearAppCache() {
        System.out.println("cleared app cache...");
    }

    public void clearAppData() {
        System.out.println("cleared app data...");
    }

    public void removeApkFle(String app) {
        System.out.println("Successfully removed APK - " + app);
    }

}
