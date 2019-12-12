package part2_3.knights_2_example_DI;/**
 * @author Sergey Zhernovoy
 * create on 02.08.2017.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part2_3.knigths_1.Knight;
import part2_3.knigths_1.QuestException;

public class BraveKnights implements part2_3.knigths_1.Knight {
    private static final Logger logger = LoggerFactory.getLogger(BraveKnights.class);
    private Quest quest;

    /**
     * Реализует внедрение через конструктор
     *
     * @param quest
     */
    public BraveKnights(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }

    public static void main(String[] args) throws QuestException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_bean_for_knights.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }

}

    