package p.motorencapsulation;
public class Motor {
    private int kecepatan = 150;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan += 5;
    }
    public void tambahKecepatan(){
        if (kontakOn == true){
            kecepatan += 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
            if (kecepatan > 100){
            System.out.println("Kecepatan maksimal 100 km");
            }
        }
    public void kurangiKecepatan(){
        if (kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println(x : "Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    
    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}