package praktikum3.soal2;

import java.util.HashMap;

public class Negara {
    private String nama_negara;
    private String jenis_kepemimpinan;
    private String nama_pemimpin;
    private int tgl_kemerdekaan;
    private Integer bln_kemerdekaan;
    private int thn_kemerdekaan;
    /**
     * @return the nama_negara
     */
    public String getNama_negara() {
        return nama_negara;
    }

    /**
     * @param nama_negara the nama_negara to set
     */
    public void setNama_negara(String nama_negara) {
        this.nama_negara = nama_negara;
    }

    /**
     * @return the jenis_kepemimpinan
     */
    public String getJenis_kepemimpinan() {
        return jenis_kepemimpinan;
    }

    /**
     * @param jenis_kepemimpinan the jenis_kepemimpinan to set
     */
    public void setJenis_kepemimpinan(String jenis_kepemimpinan) {
        this.jenis_kepemimpinan = jenis_kepemimpinan;
    }

    /**
     * @return the nama_pemimpin
     */
    public String getNama_pemimpin() {
        return nama_pemimpin;
    }

    /**
     * @param nama_pemimpin the nama_pemimpin to set
     */
    public void setNama_pemimpin(String nama_pemimpin) {
        this.nama_pemimpin = nama_pemimpin;
    }

    /**
     * @return the tgl_kemerdekaan
     */
    public int getTgl_kemerdekaan() {
        return tgl_kemerdekaan;
    }

    /**
     * @param tgl_kemerdekaan the tgl_kemerdekaan to set
     */
    public void setTgl_kemerdekaan(int tgl_kemerdekaan) {
        this.tgl_kemerdekaan = tgl_kemerdekaan;
    }

    /**
     * @return the bln_kemerdekaan
     */
    public int getIntBln_kemerdekaan() {
        return this.bln_kemerdekaan.intValue();
    }
    
    public String getStringBln_kemerdekaan() {
        return this.bulan.get(this.bln_kemerdekaan);
    }
    
    public static boolean Monarch(String jenis_kepemimpinan){
        return jenis_kepemimpinan.equalsIgnoreCase("monarki");
    }
    
    /**
     * @param bln_kemerdekaan the bln_kemerdekaan to set
     */
    public void setBln_kemerdekaan(int bln_kemerdekaan) {
        this.bln_kemerdekaan = bln_kemerdekaan;
    }

    /**
     * @return the thn_kemerdekaan
     */
    public int getThn_kemerdekaan() {
        return thn_kemerdekaan;
    }

    /**
     * @param thn_kemerdekaan the thn_kemerdekaan to set
     */
    public void setThn_kemerdekaan(int thn_kemerdekaan) {
        this.thn_kemerdekaan = thn_kemerdekaan;
    }
    
    HashMap<Integer, String> bulan = new HashMap<Integer, String>();
    public Negara(String nama_negara, String jenis_kepemimpinan, String nama_pemimpin, int tgl_kemerdekaan, int bln_kemerdekaan, int thn_kemerdekaan){
        this.nama_negara = nama_negara;
        this.jenis_kepemimpinan = jenis_kepemimpinan;
        this.nama_pemimpin = nama_pemimpin;
        this.tgl_kemerdekaan = tgl_kemerdekaan;
        this.bln_kemerdekaan = bln_kemerdekaan;
        this.thn_kemerdekaan = thn_kemerdekaan;
        monthBulan();
    }
    
    public Negara(String nama_negara, String jenis_kepemimpinan, String nama_pemimpin){
        this.nama_negara = nama_negara;
        this.jenis_kepemimpinan = jenis_kepemimpinan;
        this.nama_pemimpin = nama_pemimpin;
        monthBulan();
    }
    
    void monthBulan(){
        this.bulan.put(1, "Januari");
        this.bulan.put(2, "Februari");
        this.bulan.put(3, "Maret");
        this.bulan.put(4, "April");
        this.bulan.put(5, "Mei");
        this.bulan.put(6, "Juni");
        this.bulan.put(7, "Juli");
        this.bulan.put(8, "Agustus");
        this.bulan.put(9, "September");
        this.bulan.put(10, "Oktober");
        this.bulan.put(11, "November");
        this.bulan.put(12, "Desember");
    }
    
    public void printDetail(){
        System.out.print("\n");
        System.out.print("Negara ");
        System.out.print(this.nama_negara);
        System.out.print(" mempunyai ");
        if(Monarch(this.jenis_kepemimpinan)){
            System.out.print("Raja");
        }else{
            System.out.print(this.jenis_kepemimpinan);
        }
        System.out.print(" bernama ");
        System.out.print(nama_pemimpin+"\n");
        if (Monarch(this.jenis_kepemimpinan)){
            return;
        }
        System.out.print("Deklarasi Kemerdekaan pada Tanggal ");
        System.out.print(this.tgl_kemerdekaan+" ");
        System.out.print(this.getStringBln_kemerdekaan() + " ");
        System.out.print(this.thn_kemerdekaan + "\n");
    }
}
