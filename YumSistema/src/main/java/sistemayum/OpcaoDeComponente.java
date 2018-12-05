package sistemayum;

public enum OpcaoDeComponente {

    CPU("Processador", "https://www.informationq.com/wp-content/uploads/2016/06/CPU.jpg"),
    RAM("Memória Principal", "https://linustechtips.com/main/uploads/monthly_2017_08/large.s-l1000.jpg.73ad2806e37e829650a6fdf4fdd6257d.jpg"),
    HD("HDD/SDD", "http://images10.newegg.com/ProductImage/22-826-022-02.jpg"),
    BATERIA("Bateria", "https://cdn3.iconfinder.com/data/icons/electronics-volume-2-1/48/51-512.png");
    
    private String descr;
    private String urlImagem;

    public String getUrlImage() {
        return urlImagem;
    }

    public void setUrlImage(String urlImagem) {
        this.urlImagem = urlImagem;
    }   

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    private OpcaoDeComponente(String descr, String urlImagem) {
        this.descr = descr;
        this.urlImagem = urlImagem;
    }
    
}
