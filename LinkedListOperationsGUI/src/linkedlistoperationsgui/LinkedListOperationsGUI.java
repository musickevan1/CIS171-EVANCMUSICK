/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
 * Title: Linked List Operations GUI
 * Author: Evan Musick
 * Date: 4/11/2023
 * Course: 23/SP-CIS-171-W01
 */

package linkedlistoperationsgui;

import java.awt.*;
import javax.swing.*;
import java.util.LinkedList;

public class LinkedListOperationsGUI {
    // Declare UI components
    private JFrame frame;
    private JTextField valueField;
    private JTextField indexField;
    private JTextArea outputArea;
    private JButton insertButton;
    private JButton searchButton;
    private JButton deleteButton;
    private JButton displayButton;
    // Declare a LinkedList to store integers
    private final LinkedList<Integer> linkedList;

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        EventQueue.invokeLater(() -> {
            try {
                LinkedListOperationsGUI window = new LinkedListOperationsGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public LinkedListOperationsGUI() {
        // Initialize the LinkedList and set up the UI
        linkedList = new LinkedList<>();
        initialize();
    }

    // Initialize the UI components
    private void initialize() {
        frame = new JFrame("Linked List Operations");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Set up text fields
        valueField = new JTextField();
        valueField.setBounds(94, 11, 86, 20);
        frame.getContentPane().add(valueField);
        valueField.setColumns(10);

        indexField = new JTextField();
        indexField.setBounds(94, 42, 86, 20);
        frame.getContentPane().add(indexField);
        indexField.setColumns(10);

        // Set up labels
        JLabel lblValue = new JLabel("Value:");
        lblValue.setBounds(10, 14, 46, 14);
        frame.getContentPane().add(lblValue);

        JLabel lblIndex = new JLabel("Index:");
        lblIndex.setBounds(10, 45, 46, 14);
        frame.getContentPane().add(lblIndex);

        // Set up buttons and their actions
        insertButton = new JButton("Insert");
        insertButton.addActionListener(e -> insertAction());
        insertButton.setBounds(225, 10, 89, 23);
        frame.getContentPane().add(insertButton);

        searchButton = new JButton("Search");
        searchButton.addActionListener(e -> searchAction());
        searchButton.setBounds(225, 41, 89, 23);
        frame.getContentPane().add(searchButton);

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(e -> deleteAction());
        deleteButton.setBounds(225, 72, 89, 23);
        frame.getContentPane().add(deleteButton);

        displayButton = new JButton("Display");
        displayButton.addActionListener(e -> displayAction());
        displayButton.setBounds(225, 103, 89, 23);
        frame.getContentPane().add(displayButton);

        // Set up output area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBounds(10, 137, 414, 113);
        frame.getContentPane().add(scrollPane);
    }

    // Insert action - insert a value at a specified index or append it to the end
    private void insertAction() {
         try {
            int value = Integer.parseInt(valueField.getText());
            String indexText = indexField.getText().trim();

            if (indexText.isEmpty()) {
                linkedList.add(value);
                outputArea.append("Value inserted at the end: " + value + "\n");
            } else {
                int index = Integer.parseInt(indexText);
                if (index >= 0 && index <= linkedList.size()) {
                    linkedList.add(index, value);
                    outputArea.append("Value inserted at index " + index + ": " + value + "\n");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid index. Please enter a valid index.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Search action - search for a value in the LinkedList
    private void searchAction() {
        try {
            int value = Integer.parseInt(valueField.getText());
            int index = linkedList.indexOf(value);
            if (index == -1) {
                outputArea.append("Value not found in the list.\n");
            } else {
                outputArea.append("Value found at index: " + index + "\n");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Delete action - delete a value at a specified index from the LinkedList
    private void deleteAction() {
         try {
            int index = Integer.parseInt(indexField.getText());
            if (index >= 0 && index < linkedList.size()) {
                int removedValue = linkedList.remove(index);
                outputArea.append("Value removed: " + removedValue + "\n");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid index. Please enter a valid index.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid index.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Display action - display the current state of the LinkedList
    private void displayAction() {
        outputArea.append("Current LinkedList: " + linkedList.toString() + "\n");
    }
}
