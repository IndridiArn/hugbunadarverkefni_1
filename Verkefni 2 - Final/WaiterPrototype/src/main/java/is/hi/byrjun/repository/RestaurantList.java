package is.hi.byrjun.repository;

import is.hi.byrjun.model.Restaurant;

public class RestaurantList {
    // Hér geymum við fylki af veitingahúsum á meðan við erum ekki enn komnir með gagnagrunn:

    //                                                   nafn          týpa     verð      upplýsingar                                           borð laus
    public static Restaurant res1 = new Restaurant  ("Messinn", "Seafood", 3, "Seafood restaurant located " +
            "at Lækjargata 6b in downtown Reykjavik. Simple seafood dishes cooked to perfection. Open from 11:30-15:00 and again from 17:00-22:00",4);
    public static Restaurant res2 = new Restaurant  ("Kopar", "Seafood", 4, "Seafood restaurant located at Geirsgata 3 in downtown Reykjavík.", 0);
    public static Restaurant res3 = new Restaurant  ("Fönix", "Chinese", 2, "Chinese restaurant located at Bíldshöfði 12, Reykjavík. Take away available.",7);
    public static Restaurant res4 = new Restaurant  ("Vinyl", "Vegetarian", 2, "Reykjavík's premier vegan restaurant, located at Hverfisgata in the city center.",1);
    public static Restaurant res5 = new Restaurant  ("101 Harbor", "Seafood", 3, "Seafood restaurant located in at Aegisgardur 2 in the Reykjavík Old Harbour.", 5);
    public static Restaurant res6 = new Restaurant  ("Caruso", "Italian", 3, "Classic Italian restaurant located in a beautiful wooden building smack dab in Reykjavík City Center", 5);
    public static Restaurant res7 = new Restaurant  ("Verbud 11", "Seafood", 3, "Seafood restaurant located at Geirsgata 3 in downtown Reykjavík.", 5);
    public static Restaurant res8 = new Restaurant  ("Primo", "Italian", 3, "Italian restaurant located at Þingholtsstraeti 2 in downtown Reykjavík.", 5);
    public static Restaurant res9 = new Restaurant  ("Tapas barinn", "Tapas", 3, "Tapas restaurant located in a cellar at Vesturgata 3b, Reykjavík. Open from 17:00 - 22:30", 5);
    public static Restaurant res10 = new Restaurant  ("Burro", "Tapas", 3, "Tapas restaurant located near Ingólfstorg in Reykjavík's City Center. Transforms into a disco club during the night.", 5);
    public static Restaurant res11 = new Restaurant  ("Fiskmarkadurinn", "Seafood", 4, "Seafood restaurant located at Adalstræti 2, Reykjavík. Open from 18:00 - 22:30", 5);

    // Þetta er fylki með öllum þeim veitingahúsum sem í boði eru eins og er
    public static Restaurant[] res = {res1,res2,res3,res4,res5, res6, res7, res8, res9, res10, res11};
}
