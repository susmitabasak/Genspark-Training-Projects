import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    @Test
    void testUserChooses1() {
        String choice1Str = "You approach the cave... It is dark and spooky.. " +
                "\nA large dragon jumps in front of you! He opens his jaw and..." +
                "\nGobbles you down in one bite!";
        assertEquals(choice1Str, DragonCave.userChooses1());
    }

    @Test
    void testUserChooses2() {
        String choice2Str = "You approach the cave... It is quite in there... " +
                "\nA cute friendly dragon approaches you! " +
                "\nHe shares HIS treasure with YOU :)!";
        assertEquals(choice2Str, DragonCave.userChooses2());
    }
}