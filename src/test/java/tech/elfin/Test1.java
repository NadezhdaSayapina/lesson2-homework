package tech.elfin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class Test1 {
    private static final Logger logger = LogManager.getLogger(Test1.class);

    @Test
    public void test() {
        logger.info("Успех");

        //какая-то херовина для сравнения результата
        Assert.assertTrue("lol",1 == 1);
    }

}
