package org.htw.prog2.aufgabe1.analysis;

import org.htw.prog2.aufgabe1.exceptions.FileFormatException;
import org.htw.prog2.aufgabe1.exceptions.NoValidReadersException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SequenceAnalysisManagerTest {

    @Test
    void performAnalysis_throwsWrongFile() {
        assertThrows(FileFormatException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                SequenceAnalysisManager.performAnalysis("protease_reference.fasta",
                        "protease_sequences.fasta",
                        "HIVMutationPatterns_wrongHeader.csv");
            }
        });
    }

    @Test
    void performAnalysis() {
        assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                SequenceAnalysis analysis = SequenceAnalysisManager.performAnalysis("protease_reference.fasta",
                        "protease_sequences.fasta",
                        "HIVMutationPatternsPI.csv");
                assertEquals("DRV", analysis.getBestDrug());
                assertEquals(1.88, analysis.getBestDrugResistance());
            }
        });
    }
}