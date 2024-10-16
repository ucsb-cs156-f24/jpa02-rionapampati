package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("f24-14");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("f24-14"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=f24-14, members=[])", team.toString());
    }

    @Test
    public void equals_returns_same_object() {
        Team otherTeam = new Team("f24-14");
        assertTrue(otherTeam.equals(otherTeam));

        assertTrue(!otherTeam.equals(1));

        Team otherTeam2 = new Team("f24-15");
        assertTrue(!otherTeam.equals(otherTeam2));

        otherTeam2.addMember("Riona");
        otherTeam.addMember("Vala");

        assertTrue(!otherTeam.equals(otherTeam2));
    }

    @Test
    public void hashCode_returns_same_hash() {
        Team otherTeam = new Team("f24-14");
        assertEquals(otherTeam.hashCode(),-1327023895);

    }

}
