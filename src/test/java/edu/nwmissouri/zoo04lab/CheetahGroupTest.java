/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Cheetah Group.
 * 
 * @author Sriolekha Janagam
 */
public class CheetahGroupTest {

    public CheetahGroupTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @BeforeEach
    public void setUp() {
    }

  

    /**
     * Test of create method, of class CheetahGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = CheetahGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class CheetahGroup.
     */
    @Test
    public void testGroupRun() {
        CheetahGroup.create();
        CheetahGroup.run();
        assertTrue(true);
    }

}
