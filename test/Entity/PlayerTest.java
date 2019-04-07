/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import TileMap.TileMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Krisztian
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    /**
     * Test of getHealth method, of class Player.
     */
    @Test
    public void testGetHealth() {
        TileMap tileMap = new TileMap(50);
        tileMap.setPosition(0, 0);

        Player player = new Player(tileMap);
        
        int actual = player.getHealth();
        int expected = 5;
        assertEquals(expected,actual);
    }

    /**
     * Test of getMaxHealth method, of class Player.
     */
    @Test
    public void testGetMaxHealth() {
        TileMap tileMap = new TileMap(50);
        tileMap.setPosition(0, 0);

        Player player = new Player(tileMap);
        
        int actual = player.getMaxHealth();
        int expected = 5;
        assertEquals(expected,actual);        
    }

    /**
     * Test of getFire method, of class Player.
     */
    @Test
    public void testGetFire() {
        TileMap tileMap = new TileMap(50);
        tileMap.setPosition(0, 0);

        Player player = new Player(tileMap);
        
        int actual = player.getFire();
        int expected = 2500;
        assertEquals(expected,actual);         
    }

    /**
     * Test of getMaxFire method, of class Player.
     */
    @Test
    public void testGetMaxFire() {
        TileMap tileMap = new TileMap(50);
        tileMap.setPosition(0, 0);

        Player player = new Player(tileMap);
        
        int actual = player.getMaxFire();
        int expected = 2500;
        assertEquals(expected,actual);          
    }

    /**
     * Test of setFiring method, of class Player.
     */
    @Test
    public void testSetFiring() {
        TileMap tileMap = new TileMap(50);
        tileMap.setPosition(0, 0);

        Player player = new Player(tileMap);
        
        player.setFiring();
        int expected = 2500;
        assertTrue(player.getFiring());         
    }

    /**
     * Test of setScratching method, of class Player.
     */
    @Test
    public void testSetScratching() {
    }

    /**
     * Test of setGliding method, of class Player.
     */
    @Test
    public void testSetGliding() {
    }

    /**
     * Test of update method, of class Player.
     */
    @Test
    public void testUpdate() {
    }

    /**
     * Test of draw method, of class Player.
     */
    @Test
    public void testDraw() {
    }
    
}
