package be.switchfully.gameoflife.backend;

import be.switchfully.gameoflife.GameOfLifeApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(
        classes = GameOfLifeApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public abstract class IntegrationTest extends AbstractJUnit4SpringContextTests {

    @LocalServerPort
    protected int port;

}
