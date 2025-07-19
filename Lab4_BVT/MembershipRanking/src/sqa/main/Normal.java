package sqa.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Normal {
	
	Ranking rank = new Ranking();
	
	@ParameterizedTest
	@CsvSource({
	    "0, 15, 500, Standard",
	    "1, 15, 500, Standard",
	    "50000, 15, 500, Gold",
	    "99999, 15, 500, Gold",
	    "100000, 15, 500, Gold",
	    "50000, 0, 500, Standard",
	    "50000, 1, 500, Silver",
	    "50000, 29, 500, Gold",
	    "50000, 30, 500, Gold",
	    "50000, 15, 0, Standard",
	    "50000, 15, 1, Standard",
	    "50000, 15, 999, Gold",
	    "50000, 15, 1000, Gold"
	    /* test
	    "50000,2,500,Silver",
	    "50000,5,500,Gold",
	    "100000,6,1000,Platinum"
	    */
	})
	void Normal_Test(int purchase , int fequency , int points , String expect) {
		assertEquals(expect,rank.CalculateMembershipRank(purchase, fequency, points));
	}

}
