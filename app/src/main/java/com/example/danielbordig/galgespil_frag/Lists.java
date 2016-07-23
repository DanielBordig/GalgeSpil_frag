package com.example.danielbordig.galgespil_frag;

import java.util.ArrayList;

/**
 * Created by Daniel Bordig on 16-02-2016.
 */
public class Lists {

    private ArrayList<String> oprindeligeOrd = new ArrayList<>();
    private ArrayList<String> pokemon = new ArrayList<>();
    private ArrayList<Integer> pokemonPictures = new ArrayList<>();


    public Lists() {
        oprindeligeOrd.add("bil");
        oprindeligeOrd.add("computer");
        oprindeligeOrd.add("programmering");
        oprindeligeOrd.add("motorvej");
        oprindeligeOrd.add("busrute");
        oprindeligeOrd.add("gangsti");
        oprindeligeOrd.add("skovsnegl");
        oprindeligeOrd.add("solsort");
        oprindeligeOrd.add("søko");
        oprindeligeOrd.add("lysekrone");
        oprindeligeOrd.add("ært");
        oprindeligeOrd.add("pålæg");
        oprindeligeOrd.add("blyant");
        oprindeligeOrd.add("playstation");
        oprindeligeOrd.add("xbox");
        oprindeligeOrd.add("nintendo");

        pokemon.add("bulbasaur");   pokemon.add("ivysaur");     pokemon.add("venusaur");
        pokemon.add("charmander");  pokemon.add("chameleon");   pokemon.add("charizard");
        pokemon.add("squirtle");    pokemon.add("wartortle");   pokemon.add("blastoise");
        pokemon.add("caterpie");    pokemon.add("metapod");     pokemon.add("butterfree");
        pokemon.add("weedle");      pokemon.add("kakuna");      pokemon.add("beedrill");
        pokemon.add("pidgey");      pokemon.add("pidgeotto");   pokemon.add("pidgeot");
        pokemon.add("rattata");     pokemon.add("raticate");    pokemon.add("spearow");
        pokemon.add("fearow");      pokemon.add("ekans");       pokemon.add("arbok");
        pokemon.add("pikachu");     pokemon.add("raichu");      pokemon.add("sandshrew");
        pokemon.add("sandslash");   pokemon.add("nidoran");     pokemon.add("nidorina");
        pokemon.add("nidoqueen");   pokemon.add("nidoran");     pokemon.add("nidorino");
        pokemon.add("nidoking");    pokemon.add("clefairy");    pokemon.add("clefable");
        pokemon.add("vulpix");      pokemon.add("ninetails");   pokemon.add("jigglypuff");
        pokemon.add("wigglytuff");  pokemon.add("zubat");       pokemon.add("golbat");
        pokemon.add("oddish");      pokemon.add("gloom");       pokemon.add("vileplume");
        pokemon.add("paras");       pokemon.add("parasect");    pokemon.add("venonat");
        pokemon.add("venomoth");    pokemon.add("diglett");     pokemon.add("dugtrio");
        pokemon.add("meowth");      pokemon.add("persian");     pokemon.add("psyduck");
        pokemon.add("golduck");     pokemon.add("mankey");      pokemon.add("primeape");
        pokemon.add("growlithe");   pokemon.add("arcanine");    pokemon.add("poliwag");
        pokemon.add("poliwhirl");   pokemon.add("poliwrath");   pokemon.add("abra");
        pokemon.add("kadabra");     pokemon.add("alakazam");    pokemon.add("machop");
        pokemon.add("machoke");     pokemon.add("machamp");     pokemon.add("bellsprout");
        pokemon.add("weepinbell");  pokemon.add("victreebel");  pokemon.add("tentacool");
        pokemon.add("tentacruel");  pokemon.add("geodude");     pokemon.add("graveler");
        pokemon.add("golem");       pokemon.add("ponyta");      pokemon.add("rapidash");
        pokemon.add("slowpoke");    pokemon.add("slowbro");     pokemon.add("magnemite");
        pokemon.add("magneton");    pokemon.add("farfetchd");   pokemon.add("doduo");
        pokemon.add("dodrio");      pokemon.add("seel");        pokemon.add("dewdong");
        pokemon.add("grimer");      pokemon.add("muk");         pokemon.add("shellder");
        pokemon.add("cloyster");    pokemon.add("gastly");      pokemon.add("haunter");
        pokemon.add("gengar");      pokemon.add("onix");        pokemon.add("drowzee");
        pokemon.add("hypno");       pokemon.add("krabby");      pokemon.add("kingler");
        pokemon.add("voltorb");     pokemon.add("electrode");   pokemon.add("exeggute");
        pokemon.add("exeggutor");   pokemon.add("cubone");      pokemon.add("marowak");
        pokemon.add("hitmonlee");   pokemon.add("hitmonchan");  pokemon.add("lickitung");
        pokemon.add("koffing");     pokemon.add("weezing");     pokemon.add("rhyhorn");
        pokemon.add("rhydon");      pokemon.add("chansey");     pokemon.add("tangela");
        pokemon.add("kangaskhan");  pokemon.add("horsea");      pokemon.add("seadra");
        pokemon.add("goldeen");     pokemon.add("seaking");     pokemon.add("staryu");
        pokemon.add("starmie");     pokemon.add("mrmime");      pokemon.add("scyther");
        pokemon.add("jynx");        pokemon.add("electabuzz");  pokemon.add("magmar");
        pokemon.add("pinsir");      pokemon.add("tauros");      pokemon.add("magikarp");
        pokemon.add("gyarados");    pokemon.add("lapras");      pokemon.add("ditto");
        pokemon.add("eevee");       pokemon.add("vaporeon");    pokemon.add("jolteon");
        pokemon.add("flareon");     pokemon.add("porygon");     pokemon.add("omanyte");
        pokemon.add("omastar");     pokemon.add("kabuto");      pokemon.add("kabutops");
        pokemon.add("areodactyl");  pokemon.add("snorlax");     pokemon.add("articuno");
        pokemon.add("zapdos");      pokemon.add("moltres");     pokemon.add("dratini");
        pokemon.add("dragonair");   pokemon.add("dragonite");   pokemon.add("mewtwo");
        pokemon.add("mew");

        pokemonPictures.add(R.mipmap.p0);   pokemonPictures.add(R.mipmap.p1);   pokemonPictures.add(R.mipmap.p2);
        pokemonPictures.add(R.mipmap.p3);   pokemonPictures.add(R.mipmap.p4);   pokemonPictures.add(R.mipmap.p5);
        pokemonPictures.add(R.mipmap.p6);   pokemonPictures.add(R.mipmap.p7);   pokemonPictures.add(R.mipmap.p8);
        pokemonPictures.add(R.mipmap.p9);   pokemonPictures.add(R.mipmap.p10);  pokemonPictures.add(R.mipmap.p11);
        pokemonPictures.add(R.mipmap.p12);  pokemonPictures.add(R.mipmap.p13);  pokemonPictures.add(R.mipmap.p14);
        pokemonPictures.add(R.mipmap.p15);  pokemonPictures.add(R.mipmap.p16);  pokemonPictures.add(R.mipmap.p17);
        pokemonPictures.add(R.mipmap.p18);  pokemonPictures.add(R.mipmap.p19);  pokemonPictures.add(R.mipmap.p20);
        pokemonPictures.add(R.mipmap.p21);  pokemonPictures.add(R.mipmap.p22);  pokemonPictures.add(R.mipmap.p23);
        pokemonPictures.add(R.mipmap.p24);  pokemonPictures.add(R.mipmap.p25);  pokemonPictures.add(R.mipmap.p26);
        pokemonPictures.add(R.mipmap.p27);  pokemonPictures.add(R.mipmap.p28);  pokemonPictures.add(R.mipmap.p29);
        pokemonPictures.add(R.mipmap.p30);  pokemonPictures.add(R.mipmap.p31);  pokemonPictures.add(R.mipmap.p32);
        pokemonPictures.add(R.mipmap.p33);  pokemonPictures.add(R.mipmap.p34);  pokemonPictures.add(R.mipmap.p35);
        pokemonPictures.add(R.mipmap.p36);  pokemonPictures.add(R.mipmap.p37);  pokemonPictures.add(R.mipmap.p38);
        pokemonPictures.add(R.mipmap.p39);  pokemonPictures.add(R.mipmap.p40);  pokemonPictures.add(R.mipmap.p41);
        pokemonPictures.add(R.mipmap.p42);  pokemonPictures.add(R.mipmap.p43);  pokemonPictures.add(R.mipmap.p44);
        pokemonPictures.add(R.mipmap.p45);  pokemonPictures.add(R.mipmap.p46);  pokemonPictures.add(R.mipmap.p47);
        pokemonPictures.add(R.mipmap.p48);  pokemonPictures.add(R.mipmap.p49);  pokemonPictures.add(R.mipmap.p50);
        pokemonPictures.add(R.mipmap.p51);  pokemonPictures.add(R.mipmap.p52);  pokemonPictures.add(R.mipmap.p53);
        pokemonPictures.add(R.mipmap.p54);  pokemonPictures.add(R.mipmap.p55);  pokemonPictures.add(R.mipmap.p56);
        pokemonPictures.add(R.mipmap.p57);  pokemonPictures.add(R.mipmap.p58);  pokemonPictures.add(R.mipmap.p59);
        pokemonPictures.add(R.mipmap.p60);  pokemonPictures.add(R.mipmap.p61);  pokemonPictures.add(R.mipmap.p62);
        pokemonPictures.add(R.mipmap.p63);  pokemonPictures.add(R.mipmap.p64);  pokemonPictures.add(R.mipmap.p65);
        pokemonPictures.add(R.mipmap.p66);  pokemonPictures.add(R.mipmap.p67);  pokemonPictures.add(R.mipmap.p68);
        pokemonPictures.add(R.mipmap.p69);  pokemonPictures.add(R.mipmap.p70);  pokemonPictures.add(R.mipmap.p71);
        pokemonPictures.add(R.mipmap.p72);  pokemonPictures.add(R.mipmap.p73);  pokemonPictures.add(R.mipmap.p74);
        pokemonPictures.add(R.mipmap.p75);  pokemonPictures.add(R.mipmap.p76);  pokemonPictures.add(R.mipmap.p77);
        pokemonPictures.add(R.mipmap.p78);  pokemonPictures.add(R.mipmap.p79);  pokemonPictures.add(R.mipmap.p80);
        pokemonPictures.add(R.mipmap.p81);  pokemonPictures.add(R.mipmap.p82);  pokemonPictures.add(R.mipmap.p83);
        pokemonPictures.add(R.mipmap.p84);  pokemonPictures.add(R.mipmap.p85);  pokemonPictures.add(R.mipmap.p86);
        pokemonPictures.add(R.mipmap.p87);  pokemonPictures.add(R.mipmap.p88);  pokemonPictures.add(R.mipmap.p89);
        pokemonPictures.add(R.mipmap.p90);  pokemonPictures.add(R.mipmap.p91);  pokemonPictures.add(R.mipmap.p92);
        pokemonPictures.add(R.mipmap.p93);  pokemonPictures.add(R.mipmap.p94);  pokemonPictures.add(R.mipmap.p95);
        pokemonPictures.add(R.mipmap.p96);  pokemonPictures.add(R.mipmap.p97);  pokemonPictures.add(R.mipmap.p98);
        pokemonPictures.add(R.mipmap.p99);  pokemonPictures.add(R.mipmap.p100); pokemonPictures.add(R.mipmap.p101);
        pokemonPictures.add(R.mipmap.p102); pokemonPictures.add(R.mipmap.p103); pokemonPictures.add(R.mipmap.p104);
        pokemonPictures.add(R.mipmap.p105); pokemonPictures.add(R.mipmap.p106); pokemonPictures.add(R.mipmap.p107);
        pokemonPictures.add(R.mipmap.p108); pokemonPictures.add(R.mipmap.p109); pokemonPictures.add(R.mipmap.p110);
        pokemonPictures.add(R.mipmap.p111); pokemonPictures.add(R.mipmap.p112); pokemonPictures.add(R.mipmap.p113);
        pokemonPictures.add(R.mipmap.p114); pokemonPictures.add(R.mipmap.p115); pokemonPictures.add(R.mipmap.p116);
        pokemonPictures.add(R.mipmap.p117); pokemonPictures.add(R.mipmap.p118); pokemonPictures.add(R.mipmap.p119);
        pokemonPictures.add(R.mipmap.p120); pokemonPictures.add(R.mipmap.p121); pokemonPictures.add(R.mipmap.p122);
        pokemonPictures.add(R.mipmap.p123); pokemonPictures.add(R.mipmap.p124); pokemonPictures.add(R.mipmap.p125);
        pokemonPictures.add(R.mipmap.p126); pokemonPictures.add(R.mipmap.p127); pokemonPictures.add(R.mipmap.p128);
        pokemonPictures.add(R.mipmap.p129); pokemonPictures.add(R.mipmap.p130); pokemonPictures.add(R.mipmap.p131);
        pokemonPictures.add(R.mipmap.p132); pokemonPictures.add(R.mipmap.p133); pokemonPictures.add(R.mipmap.p134);
        pokemonPictures.add(R.mipmap.p135); pokemonPictures.add(R.mipmap.p136); pokemonPictures.add(R.mipmap.p137);
        pokemonPictures.add(R.mipmap.p138); pokemonPictures.add(R.mipmap.p139); pokemonPictures.add(R.mipmap.p140);
        pokemonPictures.add(R.mipmap.p141); pokemonPictures.add(R.mipmap.p142); pokemonPictures.add(R.mipmap.p143);
        pokemonPictures.add(R.mipmap.p144); pokemonPictures.add(R.mipmap.p145); pokemonPictures.add(R.mipmap.p146);
        pokemonPictures.add(R.mipmap.p147); pokemonPictures.add(R.mipmap.p148); pokemonPictures.add(R.mipmap.p149);
        pokemonPictures.add(R.mipmap.p150);

    }

    public ArrayList getOprindeligeOrdList(){ Options.booleanPokemon = false; Options.booleanOriginal = true; return oprindeligeOrd; }
    public ArrayList getPokemonList(){ Options.booleanPokemon = true; Options.booleanOriginal = false; return pokemon; }
    public ArrayList getPokemonPictures(){ return pokemonPictures; };
}
