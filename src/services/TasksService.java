/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import models.Task;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Igor Sosua
 */
public class TasksService {
    Task task;
    private final JPanel jPanel;

    public TasksService(JPanel jPanel) {
        this.jPanel = jPanel;
    }

    public void addTask(String description) {
        JCheckBox newCheckBox = new JCheckBox(description);
        newCheckBox.setAlignmentX(Component.LEFT_ALIGNMENT); // Alinhamento à esquerda
        jPanel.add(newCheckBox); // ou tasksPanel.add(newCombo)
        jPanel.revalidate(); // Atualiza o layout
        jPanel.repaint();
    }

    public void removeTask(){}
}
