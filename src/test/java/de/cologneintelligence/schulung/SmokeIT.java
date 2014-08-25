package de.cologneintelligence.schulung;

import java.io.IOException;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Assert;
import org.junit.Test;

public class SmokeIT {
    @Test
    public void smokeTest() throws IOException {
        final WebClient webClient = new WebClient();
        final HtmlPage page = webClient.getPage("http://localhost:8080/uebung1/index.html");
        Assert.assertEquals("Hello, World!", page.getTitleText());

        final String pageAsXml = page.asXml();
        Assert.assertTrue(pageAsXml.contains("<h1>"));

        webClient.closeAllWindows();
    }
}
