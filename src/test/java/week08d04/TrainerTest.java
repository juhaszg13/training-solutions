package week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {
    @Test
    void giveMarkTest() {
        Trainer goodTrainer = new Trainer(new GoodMood());
        Trainer badTrainer = new Trainer(new BadMood());
        assertEquals(5,goodTrainer.giveMark());
        assertEquals(3,badTrainer.giveMark());
    }
}
