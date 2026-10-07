package analysisproject;

import java.util.*;
import java.util.stream.*;

public class dashboardmain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        List<Player> squad = new ArrayList<>();
        
        squad.add(new Batsman("Rohit Sharma")
            .addStats(Format.TEST, new Stats(59, 4137))
            .addStats(Format.ODI,  new Stats(265, 10866))
            .addStats(Format.T20I, new Stats(159, 4231)));

        squad.add(new Batsman("Shubman Gill")
            .addStats(Format.TEST, new Stats(25, 1492))
            .addStats(Format.ODI,  new Stats(47, 2328))
            .addStats(Format.T20I, new Stats(21, 578)));

        squad.add(new Batsman("Virat Kohli")
            .addStats(Format.TEST, new Stats(113, 8848))
            .addStats(Format.ODI,  new Stats(295, 13906))
            .addStats(Format.T20I, new Stats(125, 4188)));

        squad.add(new Batsman("Shreyas Iyer")
            .addStats(Format.TEST, new Stats(14, 811))
            .addStats(Format.ODI,  new Stats(62, 2421))
            .addStats(Format.T20I, new Stats(51, 1104)));

        squad.add(new Batsman("Suryakumar Yadav")
            .addStats(Format.TEST, new Stats(1, 8))
            .addStats(Format.ODI,  new Stats(37, 772))
            .addStats(Format.T20I, new Stats(71, 2432)));

        squad.add(new WicketKeeper("KL Rahul")
            .addStats(Format.TEST, new Stats(50, 2863))
            .addStats(Format.ODI,  new Stats(77, 2851))
            .addStats(Format.T20I, new Stats(72, 2265)));

        squad.add(new WicketKeeper("Rishabh Pant")
            .addStats(Format.TEST, new Stats(34, 2419))
            .addStats(Format.ODI,  new Stats(31, 871))
            .addStats(Format.T20I, new Stats(74, 1158)));

        squad.add(new AllRounder("Hardik Pandya")
            .addStats(Format.TEST, new Stats(11, 532, 17, 160.0, 528))
            .addStats(Format.ODI,  new Stats(86, 1769, 84, 410.0, 2300))
            .addStats(Format.T20I, new Stats(102, 1523, 86, 290.0, 2350)));

        squad.add(new AllRounder("Ravindra Jadeja")
            .addStats(Format.TEST, new Stats(72, 3036, 294, 2600.0, 7100))
            .addStats(Format.ODI,  new Stats(197, 2756, 220, 1600.0, 7800))
            .addStats(Format.T20I, new Stats(74, 515, 54, 215.0, 1520)));

        squad.add(new AllRounder("Axar Patel")
            .addStats(Format.TEST, new Stats(14, 646, 55, 440.0, 1020))
            .addStats(Format.ODI,  new Stats(57, 495, 60, 430.0, 1950))
            .addStats(Format.T20I, new Stats(60, 453, 58, 180.0, 1310)));

        squad.add(new Bowler("Kuldeep Yadav")
            .addStats(Format.TEST, new Stats(12, 110, 53, 350.0, 1180))
            .addStats(Format.ODI,  new Stats(106, 180, 168, 910.0, 4600))
            .addStats(Format.T20I, new Stats(40, 46, 69, 140.0, 940)));

        squad.add(new Bowler("Mohammed Shami")
            .addStats(Format.TEST, new Stats(64, 750, 229, 1820.0, 6300))
            .addStats(Format.ODI,  new Stats(101, 210, 195, 825.0, 4600))
            .addStats(Format.T20I, new Stats(23, 12, 24, 82.0, 730)));

        squad.add(new Bowler("Jasprit Bumrah")
            .addStats(Format.TEST, new Stats(36, 250, 159, 1100.0, 3280))
            .addStats(Format.ODI,  new Stats(89, 250, 149, 720.0, 3312))
            .addStats(Format.T20I, new Stats(70, 26, 89, 245.0, 1540)));

        squad.add(new Bowler("Mohammed Siraj")
            .addStats(Format.TEST, new Stats(29, 110, 78, 790.0, 2580))
            .addStats(Format.ODI,  new Stats(44, 45, 68, 340.0, 1750))
            .addStats(Format.T20I, new Stats(16, 10, 14, 58.0, 470)));

        squad.add(new Bowler("Yuzvendra Chahal")
            .addStats(Format.TEST, new Stats(0, 0, 0, 0.0, 0))
            .addStats(Format.ODI,  new Stats(72, 50, 121, 640.0, 3400))
            .addStats(Format.T20I, new Stats(80, 6, 96, 300.0, 2450)));

    
        System.out.println("================================================================================");
        System.out.println("                       INDIA SQUAD");
        System.out.println("================================================================================");
        for (int i = 0; i < squad.size(); i++) {
            System.out.printf("[%2d] %-18s (%-12s)%n", (i + 1), squad.get(i).name, squad.get(i).role);
        }

    
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("Select 11 players for the Playing XI by entering 11 numbers in ONE line (1 to 15):");
        System.out.println("Example: 1 2 3 4 5 6 7 8 9 10 11");
        System.out.println("--------------------------------------------------------------------------------");
        
        List<Player> players = new ArrayList<>();
        Set<Integer> selectedIndices = new LinkedHashSet<>();

        while (true) {
            System.out.print("\nEnter 11 player numbers (separated by spaces): ");
            String inputLine = scanner.nextLine().trim();
            if (inputLine.isEmpty()) {
                continue;
            }

            String[] tokens = inputLine.split("[,\\s]+");

            if (tokens.length != 11) {
                System.out.println(">> Error: You must enter exactly 11 player numbers. You provided " + tokens.length + ".");
                continue;
            }

        
            int[] selectedArray = new int[11];
            boolean isValid = true;
            Set<Integer> tempSet = new LinkedHashSet<>();

            for (int i = 0; i < tokens.length; i++) {
                try {
                    int choice = Integer.parseInt(tokens[i]);
                    if (choice < 1 || choice > squad.size()) {
                        System.out.println(">> Error: Player number " + choice + " is out of range (1-" + squad.size() + ").");
                        isValid = false;
                        break;
                    }
                    if (tempSet.contains(choice)) {
                        System.out.println(">> Error: Duplicate player number " + choice + " found. All 11 players must be unique.");
                        isValid = false;
                        break;
                    }
                    tempSet.add(choice);
                    selectedArray[i] = choice;
                } catch (NumberFormatException e) {
                    System.out.println(">> Error: '" + tokens[i] + "' is not a valid number.");
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                selectedIndices.addAll(tempSet);
            
                for (int i = 0; i < selectedArray.length; i++) {
                    Player selectedPlayer = squad.get(selectedArray[i] - 1);
                    players.add(selectedPlayer);
                    System.out.printf("   [%2d] Added: %-18s (%-12s)%n", (i + 1), selectedPlayer.name, selectedPlayer.role);
                }
                break;
            }
        }

        
        List<Player> benchPlayers = new ArrayList<>();
        for (int i = 0; i < squad.size(); i++) {
            if (!selectedIndices.contains(i + 1)) {
                benchPlayers.add(squad.get(i));
            }
        }

        System.out.println("\n================================================================================");
        System.out.println("                   SELECTED PLAYING XI SQUAD (11 PLAYERS)");
        System.out.println("================================================================================");
        players.forEach(System.out::println);

        System.out.println("\n================================================================================");
        System.out.println("               DETAILED 3-FORMAT ANALYSIS (TEST / ODI / T20I)");
        System.out.println("================================================================================");
        players.forEach(p -> System.out.print(p.getMultiFormatSummary()));

        Set<String> roles = new HashSet<>();
        for (Player p : players) {
            roles.add(p.role);
        }
        System.out.println("Unique Roles in Selected XI ");
        roles.forEach(role -> System.out.println("- " + role));

        System.out.println("\n=== Runs Scored by Selected XI across 3 Formats ===");
        for (Format f : Format.values()) {
            Map<String, Integer> formatRunsMap = new LinkedHashMap<>();
            for (Player p : players) {
                formatRunsMap.put(p.name, p.getRuns(f));
            }
            System.out.println("\n-- " + f.name() + " Runs --");
            formatRunsMap.forEach((name, runs) -> System.out.printf("%-18s : %d runs%n", name, runs));
        }

        Queue<Player> battingOrder = new LinkedList<>(players);
        System.out.println("\n=== Selected Playing XI Batting Order (Queue) ===");
        int order = 1;
        while (!battingOrder.isEmpty()) {
            System.out.println(order++ + ". Next to bat: " + battingOrder.poll().name);
        }

    
        Deque<Player> impactPlayers = new ArrayDeque<>(benchPlayers);
        System.out.println("\n=== Bench / Impact Player Reserves (Deque: " + impactPlayers.size() + " Players) ===");
        if (!impactPlayers.isEmpty()) {
            System.out.println("Front Impact Option:\n" + impactPlayers.peekFirst().getMultiFormatSummary());
            System.out.println("Back Impact Option:\n" + impactPlayers.peekLast().getMultiFormatSummary());
        }

        System.out.println("=== Player Overall Info via Dashboard Interface ===");
        dashboard printer = p -> System.out.println("Player Info: " + p);
        players.forEach(printer::print);

        System.out.println("\n================================================================================");
        System.out.println("                   FORMAT-WISE STREAMS & ANALYTICS");
        System.out.println("================================================================================");

        List<String> topTestBatsmen = players.stream()
                .filter(p -> p.getRuns(Format.TEST) >= 2000)
                .map(p -> String.format("%s (%d runs, Avg: %.2f)", p.name, p.getRuns(Format.TEST), p.getBattingAverage(Format.TEST)))
                .collect(Collectors.toList());
        System.out.println("\nTop Test Batsmen in XI (Runs >= 2000): " + topTestBatsmen);

        List<String> topOdiBatsmen = players.stream()
                .filter(p -> p.getRuns(Format.ODI) >= 2500)
                .map(p -> String.format("%s (%d runs, Avg: %.2f)", p.name, p.getRuns(Format.ODI), p.getBattingAverage(Format.ODI)))
                .collect(Collectors.toList());
        System.out.println("Top ODI Batsmen in XI (Runs >= 2500): " + topOdiBatsmen);

        List<String> topT20Batsmen = players.stream()
                .filter(p -> p.getRuns(Format.T20I) >= 1500)
                .map(p -> String.format("%s (%d runs, Avg: %.2f)", p.name, p.getRuns(Format.T20I), p.getBattingAverage(Format.T20I)))
                .collect(Collectors.toList());
        System.out.println("Top T20I Batsmen in XI (Runs >= 1500): " + topT20Batsmen);

        List<String> topTestBowlers = players.stream()
                .filter(p -> p.getWickets(Format.TEST) >= 100)
                .map(p -> String.format("%s (%d wkts, Econ: %.2f)", p.name, p.getWickets(Format.TEST), p.getEconomy(Format.TEST)))
                .collect(Collectors.toList());
        System.out.println("\nLeading Test Wicket-Takers in XI (Wickets >= 100): " + topTestBowlers);

        List<String> topOdiBowlers = players.stream()
                .filter(p -> p.getWickets(Format.ODI) >= 100)
                .map(p -> String.format("%s (%d wkts, Econ: %.2f)", p.name, p.getWickets(Format.ODI), p.getEconomy(Format.ODI)))
                .collect(Collectors.toList());
        System.out.println("Leading ODI Wicket-Takers in XI (Wickets >= 100): " + topOdiBowlers);

        List<String> topT20Bowlers = players.stream()
                .filter(p -> p.getWickets(Format.T20I) >= 50)
                .map(p -> String.format("%s (%d wkts, Econ: %.2f)", p.name, p.getWickets(Format.T20I), p.getEconomy(Format.T20I)))
                .collect(Collectors.toList());
        System.out.println("Leading T20I Wicket-Takers in XI (Wickets >= 50): " + topT20Bowlers);

        List<String> legends = players.stream()
                .filter(p -> p.getTotalRuns() >= 10000)
                .map(p -> String.format("%s [Total: %d runs | %d matches]", p.name.toUpperCase(), p.getTotalRuns(), p.getTotalMatches()))
                .collect(Collectors.toList());
        System.out.println("\nAll-Format 10,000+ Runs Club in XI: " + legends);
        
        scanner.close();
    }
}