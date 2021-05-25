package org.htw.prog2.aufgabe1.files;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mutation {
    String variant;
    HashMap<String, Double> resistances;

    public Mutation(String variant, HashMap<String, Double> resistances) {
        this.variant = variant;
        this.resistances = resistances;
    }

    public String getVariant() {
        return variant;
    }

    public HashMap<String, Double> getResistances() {
        return resistances;
    }

    public String getSequence(String reference) {
        Pattern pattern = Pattern.compile("(\\d+)([A-Z])");
        char[] res = reference.toCharArray();
        Matcher matcher = pattern.matcher(variant);
        while(matcher.find()) {
            int position = Integer.parseInt(variant.substring(matcher.start(1), matcher.end(1)))-1;
            String replacement = variant.substring(matcher.start(2), matcher.end(2));
            res[position] = replacement.charAt(0);
        }
        return new String(res);
    }
}
