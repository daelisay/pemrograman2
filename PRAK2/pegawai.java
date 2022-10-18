package praktikum2.soal3;

public class pegawai {
    public String nama;
    //pada baris dibawah ini terjadi error karena adanya kesalahan variabel
    //public char asal;
    public String asal;
    public String jabatan;
    private int umur;
    

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
    this.nama = nama;
    } 

    public String getAsal() {
        return asal;
    }
    
    public void setAsal(String asal) {
        this.asal = asal;
    } 
   
    public String getJabatan(){
        return jabatan;
    }
    
    public void setJabatan(String jabatan){
       //pada baris dibawah ini terjadi error karena tidak ada variabel j pada field
       //this.jabatan = j;
        this.jabatan = jabatan;
    } 

    /**
     * @return the umur
     */
    public int getUmur() {
        umur = 17;
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
