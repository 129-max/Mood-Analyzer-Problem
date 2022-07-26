public class MoodAnalyser2 {


    private String moodMessage;

    public MoodAnalyser2(){
    }

    public MoodAnalyser2(String moodMessage) {
        this.moodMessage = moodMessage;
    }

    public String analyseMood() {
        if(moodMessage.contains("Sad")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
