package sistemayum;

import java.net.InetAddress;
import java.net.UnknownHostException;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.*;
import oshi.util.FormatUtil;

/**
 * @author YumPoc
**/
public class ComputadorInfoGerais {

    private SystemInfo SI = new SystemInfo();
    private HardwareAbstractionLayer Hardware = SI.getHardware();
    private OperatingSystem OS = SI.getOperatingSystem();

    private int IDComputador;
    private int CodCliente;
    private String NumeroIP;
    private String NomeComputador;
    private String EnderecoMAC;
    private String SetorHospital;
    private String ProprietarioComputador;
    private String TipoProcessador;
    private String TipoSistemaOperacional;
    private String TamanhoHD;
    private String TamanhoRAM;

    public void AtualizaInfos() {
        //this.IDComputador = ;
        //this.CodCliente = CodCliente;
        StringBuilder numerosIP = new StringBuilder();
        StringBuilder enderecoMAC = new StringBuilder();

        NetworkIF[] cabosDeRede = Hardware.getNetworkIFs();
        for (NetworkIF caboDeRede : cabosDeRede) {
            String[] iPv4s = caboDeRede.getIPv4addr();
            String[] iPv6s = caboDeRede.getIPv6addr();
            numerosIP.append("IPv4:");
            for (String iPv4 : iPv4s) {
                numerosIP.append(iPv4);
                numerosIP.append("|");
            }
            numerosIP.append("IPv6:");
            numerosIP.append("|");
            for (String iPv6 : iPv6s) {
                numerosIP.append(iPv6);
                numerosIP.append("|");
            }
            enderecoMAC.append(caboDeRede.getMacaddr());
            if (cabosDeRede.length > 1) {
                enderecoMAC.append(" | ");
            }
        }
        numerosIP.append("IPv4: ");
//        numerosIP.append(OS.getNetworkParams().getIpv4DefaultGateway());
        numerosIP.append("/IPv6: ");
//        numerosIP.append(OS.getNetworkParams().getIpv6DefaultGateway());
        this.NumeroIP = numerosIP.toString();
        String computername = null;
        try {
            computername = InetAddress.getLocalHost().getHostName();
            System.out.println(computername);
        } catch (UnknownHostException e) {
            System.out.println("Exception caught =" + e.getMessage());
        }
        this.NomeComputador = computername;
        this.EnderecoMAC = enderecoMAC.toString();
        //this.SetorHospital = "<Realizar Inser>";
        //não é propietario é usuário
//        this.ProprietarioComputador = OS.getProcess(OS.getProcessId()).getUser();
               
        this.TipoProcessador = Hardware.getProcessor().getName();
        this.TipoSistemaOperacional = OS.getManufacturer() + OS.getFamily() + OS.getVersion().getVersion();
        HWDiskStore[] discos = Hardware.getDiskStores();
        long tamanhoTotalHDD = 0;
        for (HWDiskStore disco : discos) {
            tamanhoTotalHDD = disco.getSize();
        }

        this.TamanhoHD = FormatUtil.formatBytesDecimal(tamanhoTotalHDD);
        this.TamanhoRAM = FormatUtil.formatBytes(Hardware.getMemory().getTotal());
    }

    public void setIDComputador(int IDComputador) {
        this.IDComputador = IDComputador;
    }

    public void setCodCliente(int CodCliente) {
        this.CodCliente = CodCliente;
    }

    public int getIDComputador() {
        return IDComputador;
    }

    public int getCodCliente() {
        return CodCliente;
    }

    public String getNumeroIP() {
        return NumeroIP;
    }

    public String getNomeComputador() {
        return NomeComputador;
    }

    public String getEnderecoMAC() {
        return EnderecoMAC;
    }

    public String getSetorHospital() {
        return SetorHospital;
    }

    public String getProprietarioComputador() {
        return ProprietarioComputador;
    }

    public String getTipoProcessador() {
        return TipoProcessador;
    }

    public String getTipoSistemaOperacional() {
        return TipoSistemaOperacional;
    }

    public String getTamanhoHD() {
        return TamanhoHD;
    }

    public String getTamanhoRAM() {
        return TamanhoRAM;
    }

    
    
}
