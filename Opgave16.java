package Kap11Exercise16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Opgave16
{
    /*
    Write a method called is1to1 that accepts a map whose keys and values are
    strings as its parameter and returns true if no two keys map to the same value.
    For example:
    {Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567} should return false, but
    {Marty=206–9024, Hawking=555–1234, Smith=949–0504, Newton=123–4567} should return true.
    The empty map is considered 1-to-1 and returns true.
    */

    public static void main(String[] args)
    {
        Map<String, String> theFirstMap = new HashMap<>();
        theFirstMap.put("Marty", "206-9024");
        theFirstMap.put("Hawking", "123-4567");
        theFirstMap.put("Smith", "949-0504");
        theFirstMap.put("Newton", "123-4567");

        Map<String, String> theSecondMap = new HashMap<>();
        theSecondMap.put("Marty", "206-9024");
        theSecondMap.put("Hawking", "555-1234");
        theSecondMap.put("Smith", "949-0504");
        theSecondMap.put("Newton", "123-4567");

        System.out.println(is1to1(theFirstMap));
        System.out.println(is1to1(theSecondMap));
    }

    public static boolean is1to1(Map<String, String> stringMap)
    {
        boolean temp = true;
        Set<String> compare = new HashSet<>();

        for (Map.Entry<String, String> check : stringMap.entrySet())
        {
            if (compare.contains(check.getValue()))
            {
                temp = false;
                break;
            }
            else
            {
                compare.add(check.getValue());
            }
        }
        return temp;
    }
}

/*

 */
