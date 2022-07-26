import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest2 {


    private Assertions Assert;

    @Test
    public void testMood_WhenStringContainSad_ShouldReturnSad() {
        MoodAnalyser2 moodAnalyser = new MoodAnalyser2("I am in Sad Mood");
        String isMoodSad = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD" , isMoodSad);
    }

    @Test
    public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
        MoodAnalyser2 moodAnalyser = new MoodAnalyser2("I am in Any Mood");
        String isMoodHappy = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY" , isMoodHappy);
    }
}
