package analysisproject;

import java.util.*;

enum Format {
    TEST, ODI, T20I
}

class Stats {
    int matches;
    int runs;
    int wickets;
    double oversBowled;
    int runsConceded;

    public Stats(int matches, int runs, int wickets, double oversBowled, int runsConceded) {
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
        this.oversBowled = oversBowled;
        this.runsConceded = runsConceded;
    }

    public Stats(int matches, int runs) {
        this(matches, runs, 0, 0.0, 0);
    }

    public Stats() {
        this(0, 0, 0, 0.0, 0);
    }

    public double getBattingAverage() {
        if (matches == 0) return 0.0;
        return (double) runs / matches;
    }
 
    public double getEconomy() {
        if (oversBowled == 0) return 0.0;
        return runsConceded / oversBowled;
    }

    @Override
    public String toString() {
        return String.format("Matches: %d, Runs: %d, Avg: %.2f, Wickets: %d, Econ: %.2f",
                matches, runs, getBattingAverage(), wickets, getEconomy());
    }
}

@FunctionalInterface
interface dashboard {
    void print(Player p);
}
abstract class Player {
    String name;
    String role;
    Map<Format, Stats> formatStats;

    public Player(String name, String role) {
        this.name = name;
        this.role = role;
        this.formatStats = new EnumMap<>(Format.class);
    }

    public Player addStats(Format format, Stats stats) {
        this.formatStats.put(format, stats);
        return this;
    }

    public Stats getStats(Format format) {
        return formatStats.getOrDefault(format, new Stats());
    }

    public int getRuns(Format format) {
        return getStats(format).runs;
    }

    public int getWickets(Format format) {
        return getStats(format).wickets;
    }

    public int getMatches(Format format) {
        return getStats(format).matches;
    }

    public double getBattingAverage(Format format) {
        return getStats(format).getBattingAverage();
    }

    public double getEconomy(Format format) {
        return getStats(format).getEconomy();
    }

    public int getTotalMatches() {
        return formatStats.values().stream().mapToInt(s -> s.matches).sum();
    }

    public int getTotalRuns() {
        return formatStats.values().stream().mapToInt(s -> s.runs).sum();
    }

    public int getTotalWickets() {
        return formatStats.values().stream().mapToInt(s -> s.wickets).sum();
    }

    public double getTotalOvers() {
        return formatStats.values().stream().mapToDouble(s -> s.oversBowled).sum();
    }

    public int getTotalRunsConceded() {
        return formatStats.values().stream().mapToInt(s -> s.runsConceded).sum();
    }

    public double getOverallBattingAverage() {
        int totalMatches = getTotalMatches();
        return totalMatches == 0 ? 0.0 : (double) getTotalRuns() / totalMatches;
    }

    public double getOverallEconomy() {
        double totalOvers = getTotalOvers();
        return totalOvers == 0.0 ? 0.0 : (double) getTotalRunsConceded() / totalOvers;
    }

    public abstract String getFormatSummary(Format format);

    public String getMultiFormatSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-18s (%-12s) -> Overall: [Matches: %d | Runs: %d | Wkts: %d]\n",
                name, role, getTotalMatches(), getTotalRuns(), getTotalWickets()));
        for (Format f : Format.values()) {
            sb.append(String.format("   [%-4s] %s\n", f.name(), getFormatSummary(f)));
        }
        return sb.toString();
    }

    @Override
    public abstract String toString();
}

class Batsman extends Player {
    public Batsman(String name) {
        super(name, "Batsman");
    }

    protected Batsman(String name, String specificRole) {
        super(name, specificRole);
    }

    @Override
    public String getFormatSummary(Format format) {

        Stats s = getStats(format);
        return String.format("Matches: %-3d | Runs: %-5d | Avg: %-5.2f",
                s.matches, s.runs, s.getBattingAverage());
    }

    @Override
    public String toString() {
        return String.format("%s (%s) [Total Matches: %d] - Total Runs: %d | Overall Avg: %.2f",
                name, role, getTotalMatches(), getTotalRuns(), getOverallBattingAverage());
    }
}

class WicketKeeper extends Batsman {
    public WicketKeeper(String name) {
        super(name, "Wicketkeeper");
    }
}

class Bowler extends Player {
    public Bowler(String name) {
        super(name, "Bowler");
    }

    @Override
    public String getFormatSummary(Format format) {
        Stats s = getStats(format);
        return String.format("Matches: %-3d | Runs: %-5d | Avg: %-5.2f | Wkts: %-3d | Econ: %-4.2f",
                s.matches, s.runs, s.getBattingAverage(), s.wickets, s.getEconomy());
    }

    @Override
    public String toString() {
        return String.format("%s (%s) [Total Matches: %d] - Total Wickets: %d | Overall Economy: %.2f",
                name, role, getTotalMatches(), getTotalWickets(), getOverallEconomy());
    }
}

class AllRounder extends Player {
    public AllRounder(String name) {
        super(name, "All-rounder");
    }

    @Override
    public String getFormatSummary(Format format) {
        Stats s = getStats(format);
        return String.format("Matches: %-3d | Runs: %-5d | Avg: %-5.2f | Wkts: %-3d | Econ: %-4.2f",
                s.matches, s.runs, s.getBattingAverage(), s.wickets, s.getEconomy());
    }

    @Override
    public String toString() {
        return String.format("%s (%s) [Total Matches: %d] - Total Runs: %d | Overall Avg: %.2f | Total Wickets: %d | Overall Economy: %.2f",
                name, role, getTotalMatches(), getTotalRuns(), getOverallBattingAverage(), getTotalWickets(), getOverallEconomy());
    }
}