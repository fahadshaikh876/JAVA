import java.util.*;

class Seat implements Comparable<Seat> {
    String num;
    String loca;

    Seat(String num, String loca) {
        this.num = num;
        this.loca = loca;
    }

    public int compareTo(Seat l1) {
        return num.compareTo(l1.num);
    }

    public String toString() {
        return ("Seat " + num + loca);
    }

}

class Passenger {
    String name;
    String PNR;

    Passenger(String name, String PNR) {
        this.name = name;
        this.PNR = PNR;
    }

    public String toString() {
        return ("PNR: " + PNR + ", Name: " + name);
    }
}

class HW3 {

    public static void main(String[] args) {
        TreeMap<Seat, Passenger> t1 = new TreeMap<>();

        Scanner sc = new Scanner(System.in);
        String line = "";

        ArrayList<String> in = new ArrayList<String>();

        while (sc.hasNextLine()) {

            line = sc.nextLine();
            if (line.equals("") || line.equals("pl exit")) {
                // System.out.println(line);
                break;
            } else {
                in.add(line);
            }

        }
        String[] s1 = new String[100];

        for (String s : in) {
            s1 = s.split(" ");
            String n = s1[0];
            char n1 = n.charAt(0);
            char n2 = n.charAt(1);
            StringBuilder sb = new StringBuilder();
            sb.append(n1);
            sb.append(n2);

            String se = sb.toString();
            char l = n.charAt(2);
            StringBuilder sb1 = new StringBuilder();
            sb1.append(l);
            String loc = sb1.toString();
            Seat seat = new Seat(se, loc);
            Passenger pas = new Passenger(s1[1], s1[2]);
            t1.put(seat, pas);
            // System.out.println(noo);
            // System.out.println(s);
        }

        // System.out.println(t1);
        for (Map.Entry<Seat, Passenger> en : t1.entrySet()) {
            String stype = "";
            if (en.getKey().loca.equalsIgnoreCase("A") || en.getKey().loca.equalsIgnoreCase("G")) {
                stype = "Window";
            } else if ((en.getKey().loca.equalsIgnoreCase("D"))) {
                stype = "Middle";
            } else {
                stype = "lsle";
            }

            System.out.println("PNR: " + en.getValue().PNR + ", Name: " + en.getValue().name + ", " + en.getKey() + ", Location: " + stype);
        }

    }
}