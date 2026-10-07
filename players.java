class players {
    final static String team = "india";
    int runs;
    int matches;
    int strike_rate;
    int highest_score;

    void CalculateAverage(){
        System.out.println(this.runs/this.matches);
    }

    players(int runs, int matches, int strike_rate, int highest_score) {
        this.runs = runs;
        this.matches = matches;
        this.strike_rate = strike_rate;
        this.highest_score = highest_score;
    }

}