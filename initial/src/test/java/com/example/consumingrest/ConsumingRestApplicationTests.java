package com.example.consumingrest;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ConsumingRestApplicationTests {

    @Test
    public void whenJavaGotFromAtomFile_thenCorrect() throws IOException {
        File file = new File(getClass().getClassLoader().getResource("arxiv_feed.xml").getFile());
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        ArxivFeed feed = xmlMapper.readValue(xml, ArxivFeed.class);
        assertTrue(feed.getId().equals("http://arxiv.org/api/WyBPOs+pRgzCTXTMWhtnbcOmk6g"));
        System.out.println(feed.getArticles());
//        System.out.println(feed.getArticles().get(0).getAuthors().get(0));
//        assertTrue(feed.getArticles().get(0).getAuthors().get(0).getArxivAffiliation().equals("Department of Physics"));
    }

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
