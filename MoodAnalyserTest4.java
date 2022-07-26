import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest4 {


    private Assertions Assert;

    @Test
    public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        }
        catch ( AnalyseMoodNullExceptions e) {
            Assert.assertEquals(AnalyseMoodNullExceptions.ExceptionType.ENTERD_NULL, e.type);
        }
    }
}
