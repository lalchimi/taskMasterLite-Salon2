package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class TaskManagerTest {


        @Test
        public void shouldAddTask() {
            org.example.TaskManager manager = new org.example.TaskManager();
            manager.addTask("Faire les courses");
            List<String> tasks = manager.getAllTasks();

            assertEquals(1, tasks.size());
            assertEquals("Faire les courses", tasks.get(0));
        }
    }


