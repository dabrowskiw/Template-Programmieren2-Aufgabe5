package org.htw.prog2.aufgabe1.ui;

import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HIVDiagnosticsCLITest {
    @Test
    void parseOptions_requiredArguments() {
        assertNull(HIVDiagnosticsCLI.parseOptions(new String[] {}));
        assertNull(HIVDiagnosticsCLI.parseOptions(
                "-m HIVMutationPatterns.csv -r protease_reference.fasta".split(" ")));
        assertNull(HIVDiagnosticsCLI.parseOptions(
                "-m HIVMutationPatterns.csv -d ProteaseInhibitor".split(" ")));
        assertNull(HIVDiagnosticsCLI.parseOptions(
                "-d ProteaseInhibitor -r protease_reference.fasta".split(" ")));
        assertNull(HIVDiagnosticsCLI.parseOptions(
                "-m HIVMutationPatterns.csv -d ProteaseInhibitor -r protease_reference.fasta".
                        split(" ")));
        assertNull(HIVDiagnosticsCLI.parseOptions(
                "-m HIVMutationPatterns.csv -p protease_sequences.fasta -r protease_reference.fasta".
                        split(" ")));
        assertNull(HIVDiagnosticsCLI.parseOptions(
                "-p protease_sequences.fasta -r protease_reference.fasta -d ProteaseInhibitor ".
                        split(" ")));
        assertNotNull(HIVDiagnosticsCLI.parseOptions(
                "-m HIVMutationPatterns.csv -p protease_sequences.fasta -r protease_reference.fasta -d ProteaseInhibitor ".
                        split(" ")));
    }

    @Test
    void parseOptions_argumentValues() {
        CommandLine cli = HIVDiagnosticsCLI.parseOptions(
                "-m HIVMutationPatterns.csv -p protease_sequences.fasta -r protease_reference.fasta -d ProteaseInhibitor ".
                        split(" "));
        assertEquals("HIVMutationPatterns.csv", cli.getOptionValue('m'));
        assertEquals("protease_sequences.fasta", cli.getOptionValue('p'));
        assertEquals("protease_reference.fasta", cli.getOptionValue('r'));
        assertEquals("ProteaseInhibitor", cli.getOptionValue('d'));
    }
}