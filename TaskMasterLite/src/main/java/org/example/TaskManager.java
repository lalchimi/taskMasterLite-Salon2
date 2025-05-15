package org.example;

import java.util.List;
import java.util.ArrayList;

/**
 * Classe de gestion des tâches en mémoire
 */
public class TaskManager    {
    /**
     * Liste des tâches
     */
    private List<String> tasks = new ArrayList<>();
    /**
     * Ajoute une tâche à la liste
     * @param description : La description de la tâche
     */
    public void addTask(String description) {
        tasks.add(description);
    }
    /**
     * Récupère toutes les tâches
     * @return : retourne la liste des tâches
     */
    public List<String> getAllTasks() {
        return tasks;
    }
}


