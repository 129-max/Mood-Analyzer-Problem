import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MoodAnalyserTest {




    @Test
    public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        }
        catch ( AnalyseMoodNullExceptions e) {
            assertEquals(AnalyseMoodNullExceptions.ExceptionType.ENTERD_NULL, e.type);
        }
    }
}
