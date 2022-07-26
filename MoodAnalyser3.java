public class MoodAnalyser3 {


    private String moodMessage;

    public MoodAnalyser3(){
    }

    public MoodAnalyser3(String moodMessage) {
        this.moodMessage = moodMessage;
    }

    public String analyseMood() {
        try {
            if (moodMessage.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
