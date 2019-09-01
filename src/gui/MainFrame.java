package gui;

import controller.Controller;
import gui.calendarTab.CalendarPanel;
import gui.notesTab.NotesPanel;
import gui.todosTab.TodosPanel;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;
import java.io.File;

public class MainFrame extends JFrame {

    // constructor of gui.MainFrame
    public MainFrame() {



        // configuration of main frame
        setTitle("Pineco");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(600, 600));
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);

        // create menubar on top of frame
        setJMenuBar(createMenuBar());

        // create tabbed panel
        JTabbedPane tabs = new JTabbedPane();

        // set user interface for tabbed panel
        tabs.setUI(new BasicTabbedPaneUI());

        // add panels to each tab
        tabs.add("Notes", new NotesPanel());
        tabs.add("Calendar", new CalendarPanel());
        tabs.add("To-Do", new TodosPanel());

        // add tabs to frame
        getContentPane().add(tabs);

        // show the main frame
        setVisible(true);
    }


    public JMenuBar createMenuBar() {

        // create menuBar
        JMenuBar menuBar = new JMenuBar();

        // create each menus in menuBar
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // add menus to menuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // add menuItems to other menus

        // set up actionListener for each item

        return menuBar;
    }
}