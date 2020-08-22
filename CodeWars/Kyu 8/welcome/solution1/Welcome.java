package com.code_wars.kyu8.welcome.solution1;

/**
  * Think of a way to store the languages as a database (eg an object). The languages are listed below so you can copy and paste!<br>
 * Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.<br>
 * The Database<br>
 * english: "Welcome",<br>
 * czech: "Vitejte",<br>
 * danish: "Velkomst",<br>
 * dutch: "Welkom",<br>
 * estonian: "Tere tulemast",<br>
 * finnish: "Tervetuloa",<br>
 * flemish: "Welgekomen",<br>
 * french: "Bienvenue",<br>
 * german: "Willkommen",<br>
 * irish: "Failte",<br>
 * italian: "Benvenuto",<br>
 * latvian: "Gaidits",<br>
 * lithuanian: "Laukiamas",<br>
 * polish: "Witamy",<br>
 * spanish: "Bienvenido",<br>
 * swedish: "Valkommen",<br>
 * welsh: "Croeso"<br><br>
 * Possible invalid inputs include:<br><br>
 * IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address<br>
 * IP_ADDRESS_NOT_FOUND - ip address not in the database<br>
 * IP_ADDRESS_REQUIRED - no ip address was supplied

**/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



import java.util.HashMap;
public class Welcome {
  private static HashMap<String, String> map = new HashMap<String, String>();
  private static Welcome instance;
  
  private Welcome() {
    instance = this;
    map.put("english", "Welcome");
    map.put("czech", "Vitejte");
    map.put("danish", "Velkomst");
    map.put("dutch", "Welkom");
    map.put("estonian", "Tere tulemast");
    map.put("finnish", "Tervetuloa");
    map.put("flemish", "Welgekomen");
    map.put("french", "Bienvenue");
    map.put("german", "Willkommen");
    map.put("irish", "Failte");
    map.put("italian", "Benvenuto");
    map.put("latvian", "Gaidits");
    map.put("lithuanian", "Laukiamas");
    map.put("polish", "Witamy");
    map.put("spanish", "Bienvenido");
    map.put("swedish", "Valkommen");
    map.put("welsh", "Croeso");
  }
  
  public static String greet(String language){    
    if(language.equals("IP_ADDRESS_INVALID") || language.equals("IP_ADDRESS_NOT_FOUND") || language.equals("IP_ADDRESS_REQUIRED"))
      return "Welcome";
    if(instance == null)
      new Welcome();
    return map.get(language);
  }
}