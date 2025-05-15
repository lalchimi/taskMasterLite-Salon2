package org.example;

import java.util.Scanner;
public class App 
{
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
