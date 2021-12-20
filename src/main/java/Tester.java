//TODO: THIS WILL BE REMOVED, IT IS ONLY A TEMPORARY SOLUTION FOR ME FOR ME TO CHECK THE SQL QUERIES

import com.example.demo.BusinessLogic.EmotionCategoryBusinessLogicService;
import com.example.demo.BusinessLogic.EmotionLogBusinessLogicService;
import com.example.demo.Controllers.EmotionCategoryController;
import com.example.demo.Controllers.EmotionLogController;
import com.example.demo.DataAccess.EmotionCategoryDataAccessService;
import com.example.demo.DataAccess.EmotionLogDataAccessService;
import org.springframework.jdbc.core.JdbcTemplate;

public class Tester {
    public EmotionLogDataAccessService emotionLogDataAccessService;
    public EmotionLogBusinessLogicService emotionLogBusinessLogicService;
    public EmotionLogController emotionLogController;

    public EmotionCategoryDataAccessService emotionCategoryDataAccessService;
    public EmotionCategoryBusinessLogicService emotionCategoryBusinessLogicService;
    public EmotionCategoryController emotionCategoryController;

    public Tester(){
        JdbcTemplate jdbcTemplate =  new JdbcTemplate();
        emotionLogDataAccessService = new EmotionLogDataAccessService(jdbcTemplate);
        emotionLogBusinessLogicService = new EmotionLogBusinessLogicService(emotionLogDataAccessService);
        emotionLogController = new EmotionLogController(emotionLogBusinessLogicService);

        emotionCategoryDataAccessService = new EmotionCategoryDataAccessService(jdbcTemplate);
        emotionCategoryBusinessLogicService = new EmotionCategoryBusinessLogicService(emotionCategoryDataAccessService);
        emotionCategoryController = new EmotionCategoryController(emotionCategoryBusinessLogicService);
    }

    public void test(){
        //emotionLogController.RetrieveEmotionsLogs(1, "2020-10-10", "2021-11-11", 1, 1);
        emotionCategoryController.RetrieveEmotionCategoriesForValence(2);
    }

    public static void main(String[] args){
        Tester tester = new Tester();
        tester.test();
    }

}
