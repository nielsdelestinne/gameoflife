package be.switchfully.gameoflife.backend.gol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = GameOfLifeController.WORLD_BASE_URL)
public class GameOfLifeController {

    static final String WORLD_BASE_URL = "/api/gol";
    private static Logger logger = LoggerFactory.getLogger(GameOfLifeController.class);

    @PostMapping(value = "/phase")
    public List<List<Boolean>> nextGeneration(@RequestBody List<List<Boolean>> currentWorld){
        logger.info("current world: {}", currentWorld);
        Collections.shuffle(currentWorld);
        return currentWorld;
    }

}
