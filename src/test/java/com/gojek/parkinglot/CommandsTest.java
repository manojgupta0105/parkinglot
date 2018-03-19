package com.gojek.parkinglot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Manoj on 17/03/18.
 */
public class CommandsTest {
    Commands commands = new Commands();
    @Test
    public void checkCommandInList() throws Exception {
        assertFalse(commands.commandsMap.isEmpty());
        assertTrue(commands.commandsMap.containsKey("create_parking_lot"));
        assertFalse(commands.commandsMap.containsKey("mytestcommand"));
    }
}