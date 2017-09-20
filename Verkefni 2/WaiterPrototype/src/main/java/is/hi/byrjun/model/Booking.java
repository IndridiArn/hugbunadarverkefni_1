package is.hi.byrjun.model;

public class Booking {

    private Restaurant res; // Veitingastaðurinn sem bókað er á
    private int number; // Númber borðs sem bókað er
    private int seats; // Hversu mörg sæti eru bókuð
    private Boolean booked; // Hvort borð sé nú þegar bókað eða ekki

    // Seinna munu koma time & date breytur

    // Getterar og setterar
    public Restaurant getRestaurant() {
        return res;
    }

    public void setRestaurant(Restaurant res) {
        this.res = res;
    }

    public String getRestaurantName() {
        return res.getNafn();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Boolean getBooked() {
        return booked;
    }

    public void setBoolean(boolean booked) {
        this.booked = booked;
    }


    // Smiður
    public Booking(Restaurant r, int n, int s, boolean b) {
        res = r;
        number = n;
        seats = s;
        booked = b;


    }
}
