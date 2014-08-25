package de.cologneintelligence.schulung;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

public class AppTest 
{
	@Test
    public void testApp()
    {
        assertThat(new App().add(3, 8), is(equalTo(11)));
    }
}
