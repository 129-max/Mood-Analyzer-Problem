import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest1 {

    private Assertions Assert;

    @Test
    public void testMood_WhenStringContainSad_ShouldReturnSad() {
        MoodAnalyser1 moodAnalyser = new MoodAnalyser1();
        String isMoodSad = moodAnalyser.analyseMood("This is Sad message");
        Assert.assertEquals("SAD" , isMoodSad);
    }

    @Test
    public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
        MoodAnalyser1 moodAnalyser = new MoodAnalyser1();
        String isMoodHappy = moodAnalyser.analyseMood("This is Happy message");
        Assert.assertEquals("HAPPY" , isMoodHappy);
    }
}