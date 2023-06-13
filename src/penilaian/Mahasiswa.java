package penilaian;
public class Mahasiswa {
    String nama,npm;
    
    Mahasiswa(String nama,String npm){
        this.nama=nama;
        this.npm=npm;
    }
    
    void setNAMA(String ubahnama){
        nama=ubahnama;
    }
    
    public void setNPM(String ubahnpm){
        npm=ubahnpm;
    }
    
    String getNAMA(){
        return nama;
    }
    
    public String  getNPM(){
        return npm;
        
    }
   
   //membuat method setPerkalian
   
}
