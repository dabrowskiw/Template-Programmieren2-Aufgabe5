package org.htw.prog2.aufgabe1;
import org.htw.prog2.aufgabe1.ui.HIVDiagnosticsCLI;
import org.htw.prog2.aufgabe1.ui.HIVDiagnosticsGUI;

public class HIVDiagnostics {
    public static void main(String[] args) {
        if(args.length == 0) {
            HIVDiagnosticsGUI gui = new HIVDiagnosticsGUI();
            gui.setVisible(true);
        }
        else {
            HIVDiagnosticsCLI cli = new HIVDiagnosticsCLI(args);
        }
    }
}
