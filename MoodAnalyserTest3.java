import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest3 {


    private Assertions Assert;

    @Test
    public void testMood_WhenStringContainSad_ShouldReturnSad() {
        MoodAnalyser3 moodAnalyser = new MoodAnalyser3("I am in Sad Mood");
        String isMoodSad = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD" , isMoodSad);
    }

    @Test
    public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
        MoodAnalyser3 moodAnalyser = new MoodAnalyser3(null);
        String isMoodHappy = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY" , isMoodHappy);
    }
}

