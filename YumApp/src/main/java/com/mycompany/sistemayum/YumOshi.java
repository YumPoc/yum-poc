package com.mycompany.sistemayum;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystemVersion;
import oshi.util.FormatUtil;

public class YumOshi {
    SystemInfo SI = new SystemInfo();
    OperatingSystem OS = SI.getOperatingSystem();
    HardwareAbstractionLayer HW = SI.getHardware();

    public String getSistemaOperacional() {

        String family = OS.getFamily();
        String manufacturer = OS.getManufacturer();
        OperatingSystemVersion version = OS.getVersion();

        return family + " " + manufacturer + " " + version;
    }
    public String getHdTotal(){
        
        HWDiskStore[] diskStores = HW.getDiskStores();
        long size = diskStores[0].getSize();
        String hdTotal = FormatUtil.formatBytesDecimal(size);
        
        return hdTotal;
    }
    public String getRamTotal(){
        
        GlobalMemory memory = HW.getMemory();
        long total = memory.getTotal();
        String ramTotal = FormatUtil.formatBytesDecimal(total);
        
        return ramTotal;
    }
    public String getRamDisponivel(){
        
        GlobalMemory memory = HW.getMemory();
        long available = memory.getAvailable();
        String ramDisponivel = FormatUtil.formatBytesDecimal(available);
        
        return ramDisponivel;
    }
}
