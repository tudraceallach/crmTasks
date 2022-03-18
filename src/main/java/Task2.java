import java.util.*;

public class Task2
{
    private static Map<String, List<String>> borders = new HashMap<String, List<String>>() {{
        put("rus", Arrays.asList("AZE", "BLR", "CHN", "EST", "FIN", "GEO", "KAZ", "PRK", "LVA", "LTU", "MNG", "NOR", "POL", "UKR"));
        put("fin", Arrays.asList("NOR", "SWE", "RUS"));
        put("ukr", Arrays.asList("BLR", "HUN", "MDA", "POL", "ROU", "RUS", "SVK"));
        put("chn", Arrays.asList("AFG","BTN","MMR","HKG","IND","KAZ","PRK","KGZ","LAO","MAC","MNG","PAK","RUS","TJK","VNM"));
        put("vnm", Arrays.asList("KHM","CHN","LAO"));
    }};

    public static void main(String[] args) {
        System.out.println(findPathAround("rus", "chn")); // KAZ PRK MNG
        System.out.println(findPathAround("rus", "ukr")); // BLR POL
        System.out.println(findPathAround("rus", "fin")); // NOR
        System.out.println(findPathAround("fin", "vnm")); // nothing found
    }


    /**
     * Найти список промежуточной страны между двумя заданными.
     * @param from страна отправления
     * @param to страна назначения
     */
    private static Set<String> findPathAround(final String from, final String to) {
        Set<String> countryBordersFrom = new HashSet<>(borders.getOrDefault(from, Collections.emptyList()));
        Set<String> countryBordersTo = new HashSet<>(borders.getOrDefault(to, Collections.emptyList()));

        countryBordersFrom.retainAll(countryBordersTo);

        return countryBordersFrom;
    }
}