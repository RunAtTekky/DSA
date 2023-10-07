import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


// I will do this question later some day when I would have completed graph concept
public class AirlineTickets {
    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<>();
        List<String> ticket = new ArrayList<>();
        ticket.add("MUC");
        ticket.add("LHR");
        tickets.add(ticket);

        List<String> ticket2 = new ArrayList<>();

        ticket2.add("JFK");
        ticket2.add("MUC");
        tickets.add(ticket2);

        List<String> ticket3 = new ArrayList<>();
        ticket3.add("SFO");
        ticket3.add("SJC");
        tickets.add(ticket3);

        List<String> ticket4 = new ArrayList<>();
        ticket4.add("LHR");
        ticket4.add("SFO");
        tickets.add(ticket4);

        System.out.println(tickets.toString());



//        List<String> ans = findItenerary(tickets);
//
//        System.out.println(ans);
    }



    private static List<String> findItenerary(List<List<String>> tickets) {
        List<String> ans = new ArrayList<>();
        LinkedList<String> path = new LinkedList<>();
        for (int i=0; i<tickets.size(); i++) {
            String from = tickets.get(i).get(0);
            String to = tickets.get(i).get(1);
            if (inPath(from, path) != -1) {

            }
            if (inPath(to, path) != -1){

            }

        }
        return ans;
    }

    private static int inPath(String from, LinkedList<String> path) {
        for (int i=0; i<path.size(); i++) {
            String airport = path.get(i);
            if (airport.equals(from)) return i;
        }
        return -1;
    }


}
