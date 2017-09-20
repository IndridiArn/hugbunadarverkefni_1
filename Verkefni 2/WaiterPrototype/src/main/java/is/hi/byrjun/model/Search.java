package is.hi.byrjun.model;

public class Search {

    private String type; // Tegund veitingahúss sem leitað er að
    /* private String time;
     private String date;
    - name: String
    - rating: int
    - price: String
    - seats: int
    - vegOptions: boolean
    - petsAllowed: boolean */

    // Getterar og setterar
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // Smiður
    public Search(String t) {
        type = t;
        //seats = s;
        //booked = b;

    }

}
