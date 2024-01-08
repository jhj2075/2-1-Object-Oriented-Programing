package java_7;

import java.util.*;

public class CitySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Location> city = new HashMap<>();

        System.out.println("도시,경도,위도를 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String s = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(s, ",");
            String c = st.nextToken();
            int lo = Integer.parseInt(st.nextToken().trim());
            int la = Integer.parseInt(st.nextToken().trim());
            city.put(c, new Location(c, lo, la));
        }
        System.out.println("------------------------");

        Set<String> keys = city.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String tmp = it.next();
            Location print = city.get(tmp);
            print.find_location(tmp);
        }
        System.out.println("------------------------");

        while (true) {
            System.out.print("도시 이름 >> ");
            String input = scanner.next();

            if (input.equals("그만")) break;

            Location s = city.get(input);
            if (s == null)
                System.out.println(input + "는 없습니다.");
            else
                s.find_location(input);
        }
    }
}
class Location {
    private String locationcity;
    private int longitude;
    private int latitude;

    public Location(String locationcity, int longitude, int latitude) {
        this.locationcity = locationcity;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    public void find_location(String c){System.out.println(c + " " + longitude + " " + latitude); }
}
