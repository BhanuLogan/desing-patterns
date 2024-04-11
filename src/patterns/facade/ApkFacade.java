package patterns.facade;

import patterns.facade.model.AppInstaller;
import patterns.facade.model.AppUninstaller;

public class ApkFacade {
    private AppInstaller installer;
    private AppUninstaller uninstaller;

    public ApkFacade() {
        installer = new AppInstaller();
        uninstaller = new AppUninstaller();
    }

    public void install(String apk) {
        System.out.println("Installing APK - " + apk);
        installer.downloadAppData();
        installer.downloadApkFile(apk);
        System.out.println();
    }

    public void uninstall(String apk) {
        System.out.println("Uninstalling APK - " + apk);
        uninstaller.clearAppCache();
        uninstaller.clearAppData();
        uninstaller.removeApkFle(apk);
        System.out.println();
    }
}
