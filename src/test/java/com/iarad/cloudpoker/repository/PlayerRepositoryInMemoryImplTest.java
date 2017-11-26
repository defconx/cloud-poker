package com.iarad.cloudpoker.repository;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * PlayerRepositoryInMemoryImplTest
 *
 * @author Stuart MacKenzie
 */
public class PlayerRepositoryInMemoryImplTest {

    @Test
    public void initDB() throws Exception {
        PlayerRepositoryInMemoryImpl repo = new PlayerRepositoryInMemoryImpl();
        repo.initDB();
        assertEquals(2, repo.getPlayerCount());
    }
}
