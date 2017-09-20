package is.hi.byrjun.model;

public class Restaurant {

        private String nafn; // Nafn veitingahúss
        private String tegund; // Tegund veitingahúss
        private String upplysingar; // Upplýsingar um veitingahús
        private int verd; // Verðflokkur veitingahúss
        private int bord; // Borðafjöldi veitingahúss - verður seinna meir fylki af borðahlutum.
       /* - rating: Double
        - tables: int[]
        - vegOptions: boolean
        - petsAllowed: boolean
        - menu: menu
        - coupons: */



    // Getterar og setterar
    public String getNafn() {
        return nafn;
    }

    public void setNafn(String nafn) {
        this.nafn = nafn;
    }

    public String getUpplysingar() {
        return upplysingar;
    }

    public void setUpplysingar(String upplysingar) {
        this.upplysingar = upplysingar;
    }

    public String getTegund() {
        return tegund;
    }

    public void setTegund(String tegund) {
        this.tegund = tegund;
    }

    public void setVerd(int verd) {
        this.verd = verd;
    }

    public int getVerd() {
        return verd;
    }

    public void setBord(int bord) {
        this.bord = bord;
    }

    public int getBord() {
        return bord;
    }

    // Smiður
    public Restaurant(String n, String t, int v, String h, int b) {
        nafn = n;
        tegund = t;
        verd = v;
        upplysingar = h;
        bord = b;

    }
    // toString aðferð sem override-ar default toString aðferðina
    @Override
    public String toString() {
        return String.format("<BR>" + "nafn: " + nafn + "<BR>" + "upplysingar: " + upplysingar
                           + "<BR>" + "tegund: " + tegund + "<BR>" + "verðflokkur: " + verd);
    }


}