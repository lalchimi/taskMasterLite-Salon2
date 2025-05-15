package org.example;

import java.util.Scanner;
/**
 * Classe principale de l'application
 * Permet à l'utilisateur d'ajouter et de lister des tâches via la console
 */
public class App
{
    /**
     * Méthode principale de l'application
     * @param args : Arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        System.out.println("Bienvenue dans TaskMaster Lite !");
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("A bientôt !");
                break;
            } else if (input.startsWith("add ")) {
                String taskDescription = input.substring(4);
                manager.addTask(taskDescription);
                System.out.println("Tâche ajoutée : " + taskDescription);
            } else if (input.equals("list")) {
                System.out.println("Liste des tâches :");
                int i = 1;
                for (String task : manager.getAllTasks()) {
                    System.out.println(i + ". " + task);
                    i++;
                }
            } else {
                System.out.println("Commande inconnue. Essayez : add [tâche], list, exit");
            }
        }
        scanner.close();
    }
}
