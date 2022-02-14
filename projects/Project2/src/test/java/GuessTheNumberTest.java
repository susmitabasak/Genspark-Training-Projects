import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GuessTheNumberTest {

    @Test
    void testGetLowMsg() {
        String lowMessage = "Your guess is too low.";
        assertEquals(lowMessage, GuessTheNumber.getLowOrHighMsg(4, 13));
        assertEquals(lowMessage, GuessTheNumber.getLowOrHighMsg(10, 15));
    }

    @Test
    void testGetHighMsg() {
        String lowMessage = "Your guess is too high.";
        assertEquals(lowMessage, GuessTheNumber.getLowOrHighMsg(13, 10));
        assertEquals(lowMessage, GuessTheNumber.getLowOrHighMsg(9, 2));
    }

    @Test
    void testGetGoodJobMsg() {
        String simonMessage = "Good job, Simon! You guessed my number in 4 guesses!";
        String johnMessage = "Good job, John! You guessed my number in 3 guesses!";
        assertEquals(simonMessage, GuessTheNumber.getGoodJobMsg("Simon", 3));
        assertEquals(johnMessage,  GuessTheNumber.getGoodJobMsg("John", 2));
    }
}