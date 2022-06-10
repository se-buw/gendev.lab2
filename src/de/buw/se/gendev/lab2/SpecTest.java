package de.buw.se.gendev.lab2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class SpecTest {
	static final String specFile = "Spec.spectra";

	   /**
     * Sanity check whether ecore file exists.
     */
    @Test
    void testModelExists() {
        File f = new File(specFile);
        assertTrue("Make sure that the original file " + specFile + " has not been deleted or renamed.", f.exists());
    }

}
