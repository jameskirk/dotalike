package dotadodge.core;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import dotadodge.core.db.ApplicationInitializer;
import dotadodge.core.db.JPA;
import dotadodge.core.misc.GuiceFactory;
import dotadodge.core.model.Match;

public class JPATest {
    
    @Test
    public void testSaveDelete() {
	GuiceFactory.getInjector().getInstance(ApplicationInitializer.class).start();

	JPA.save(new Match());
	JPA.save(new Match());
	List<Match> matches = JPA.findAll(Match.class);
	Assert.assertEquals(2, matches.size());
	for (Match m: matches) {
	    System.out.println(m);
	}
	
	Match match0 = new Match();
	System.out.println("after delete");
	match0 = JPA.findById(Match.class, 2);
	JPA.delete(match0);
	matches = JPA.findAll(Match.class);
	Assert.assertEquals(1, matches.size());
	for (Match m: matches) {
	    System.out.println(m);
	}
	
    }

}
