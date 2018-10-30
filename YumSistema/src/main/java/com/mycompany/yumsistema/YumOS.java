package com.mycompany.yumsistema;

import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystemVersion;

public class YumOS {

    SystemInfo SI = new SystemInfo();
    OperatingSystem OS = SI.getOperatingSystem();

    public String getSistemaOperacional() {
        String family = OS.getFamily();
        String manufacturer = OS.getManufacturer();
        OperatingSystemVersion version = OS.getVersion();
        String version1 = version.getVersion();
        
        return manufacturer + " " + family + " " + version1;
    }

}
