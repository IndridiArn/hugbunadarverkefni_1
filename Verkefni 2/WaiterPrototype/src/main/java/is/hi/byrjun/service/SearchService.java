package is.hi.byrjun.service;

import is.hi.byrjun.model.Restaurant;

public class SearchService {


    // Aðferð sem sigtar út veitingastaði í "gagnagrunni" eftir tegund.
    public static String[] searchByType (String s, Restaurant[] res){

        String[] match = new String[res.length];

        for(int i = 0; i < res.length; i++){
            if(s.equals(res[i].getTegund()))
                match[i] = res[i].getNafn();
        }
        String[] results = new String[match.length];
        int count = 0;
        // ljót lúppa til að eyða null úr listanum
        for(int i = 0; i < match.length; i++){
            if(match[i] != null) {
                results[count] = match[i];
                count++;
            }
        }

        //Skilar fylki með nöfnum veitingahúsa - verður seinna meir fylki af veitingahúsum
        return results;
    }

    // Aðferð sem skilar upplýsingum um veitingastað með því að nota nafnið sem
    public static Restaurant searchByName (String s, Restaurant[] res){

        Restaurant r = new Restaurant("", "",1,"",0);

        for(int i = 0; i < res.length; i++){
            if(s.equals(res[i].getNafn()))
                r = res[i];
        }

        return r;
    }
}
