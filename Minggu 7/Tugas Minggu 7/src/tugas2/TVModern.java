package tugas2;

public class TVModern extends TV{
    
    public TVModern(String deskripsi, int jumlahChannel) {
        super(deskripsi, jumlahChannel);
    }
    
    static String TELETEXT = "TELETEXT";
    static String TV = "TV";
    
    /*
        TELETEXT
    */
    public void setModusTampilan(String t) {
        this.TELETEXT = t;
    }
    
    public void getModusTampilan() {
        System.out.println("Modus tampilan : " + TELETEXT);
    }
    
    public void setHalamanTeletext(int h) {
        System.out.println("Berpindah ke halaman teletext " + h);
    }
    
    /*
        CD
    */
    String cd = "";
    public void setDiscTray(String e) {
        this.cd = e;
    }
    
    public void playCD() {
        if (cd.equals("")) {
            System.out.println("Tidak ada CD di dalam disc tray!");
        } else {
            System.out.println("Memutar film " + cd);
        }
    }
    
    
    public static void main(String[] args) {
        
        TVModern user = new TVModern("TV Toshiba 16 inch", 10);
 
        String[] channel = {
          "RCTI", "INDOSIAR", "TV ONE", "MNC", "TRANS 7",
          "ANTV", "NET", "METRO TV", "BAYUANGGA", "GTV"
        };
        
        
        user.getDeskripsi();
        user.getChannel();
        user.setChannels(channel);
        
        user.setChannelAktif(1);
        user.setVolume(70);
        user.setChannelAktif(3);
        user.setChannelAktif(5);
        
        // teletext con
        user.setModusTampilan(TVModern.TELETEXT);
        user.getModusTampilan();
        user.setHalamanTeletext(234);
        user.setModusTampilan(TVModern.TV);
        user.getModusTampilan();
        
        // CD
        user.playCD();
        user.setDiscTray("The Legend Of Aang");
        user.playCD();
        
    }
    
}
