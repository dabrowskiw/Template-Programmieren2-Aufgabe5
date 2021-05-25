package org.htw.prog2.aufgabe1.ui;

import org.htw.prog2.aufgabe1.analysis.SequenceAnalysis;
import org.htw.prog2.aufgabe1.analysis.SequenceAnalysisManager;
import org.htw.prog2.aufgabe1.exceptions.FileFormatException;
import org.htw.prog2.aufgabe1.exceptions.NoValidReadersException;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class HIVDiagnosticsGUI extends JFrame {
    protected abstract class LoadListener implements ActionListener {

        public LoadListener(String extensionDescription, String... extensions) {
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
        }

        protected abstract void setData(File file);
    }

    public HIVDiagnosticsGUI() {
    }

    private void init() {
    }

    private void initMenuBar() {
    }

    private void initFileChoosers() {
    }

    private void addLoaders(JLabel label, JButton button, GridBagConstraints c, ActionListener listener) {
    }
}
