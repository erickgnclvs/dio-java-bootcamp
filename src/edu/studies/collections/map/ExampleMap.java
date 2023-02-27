package edu.studies.collections.map;

import java.util.*;


public class ExampleMap {
    public static void main(String[] args) {
        Map<String, Double> popCars = new HashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("argo", 15.6);
        }};

        System.out.println(popCars);
        System.out.println(popCars.toString());
        System.out.println(popCars.containsKey("tucson"));
        System.out.println(popCars.containsKey("argo"));
        System.out.println(popCars.get("uno"));
        System.out.println(popCars.keySet());
        System.out.println(popCars.values());

        System.out.println(Collections.min(popCars.values()));
        System.out.println(Collections.max(popCars.values()));
        Double min = Collections.min(popCars.values());

        Set<Map.Entry<String, Double>> entries = popCars.entrySet();
        String mostEfficient = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(min))
                mostEfficient = entry.getKey();
        }
        System.out.println(mostEfficient + " " + min);

        String leastEfficient = "";
        Double max = Collections.max(popCars.values());
        Set<Map.Entry<String, Double>> entries1 = popCars.entrySet();
        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(max))
                leastEfficient = entry.getKey();
        }

        System.out.println(leastEfficient + " " + max);

        Iterator<Double> iterator = popCars.values().iterator();
        double sum = 0d;
        while (iterator.hasNext())
            sum += iterator.next();

        System.out.println(sum);

        Iterator<Double> iterator1 = popCars.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(popCars);

        Map<String, Double> popCars1 = new LinkedHashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("argo", 15.6);
        }};

        System.out.println(popCars1);

        Map<String, Double> popCars3 = new TreeMap<String, Double>(popCars);
        System.out.println(popCars3.toString());

        popCars.clear();
        System.out.println(popCars.isEmpty());


    }

}
