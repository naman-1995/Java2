import java.util.*;

public class Java4_athlete {
    public static void main(String[] args) {
        ArrayList<Athlete> ath=new ArrayList<>();
        ath.add(new Athlete("abc", "hockey", "india", 3, Arrays.asList("two", "five", "three")));
        ath.add(new Athlete("def","hockey","india",2,Arrays.asList("three","four","five")));
        Collections.sort(ath);
        String res=ath.toString();
        System.out.println(ath);
    }

}

class Athlete implements Comparable<Athlete> {
    String name;
    String sport;
    String country;
    int world_rank;
    List<String> medals;
    public Athlete(String name,String sport,String country,int world_rank, List<String> medals)
    {
        this.name=name;
        this.sport=sport;
        this.country=country;
        this.world_rank=world_rank;
        this.medals=medals;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", country='" + country + '\'' +
                ", world_rank=" + world_rank +
                ", medals=" + medals +
                '}';
    }

    public int getWorld_rank() {
        return world_rank;
    }

        public int compareTo(Athlete ath){

            return this.world_rank - ath.world_rank;
        }
}

//  abstract class SortbyMedals implements Comparator <Athlete>
//{
//
//public int compare(name a, name b)
//        {
//        return a.medals - b.medals;
//        }
//}

