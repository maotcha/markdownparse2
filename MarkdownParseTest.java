import static org.junit.Assert.*;

import java.nio.file.Path;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.*; 

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
        System.out.println("Change");
    }
    @Test
    public void getLinksTestFile() throws IOException{
        Path fileName = Path.of("test-fileA.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksTestFile2() throws IOException{
        Path fileName = Path.of("test-file2A.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksBracketFile() throws IOException{
        Path fileName = Path.of("bracket-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksEmptyFile() throws IOException{
        Path fileName = Path.of("empty-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksTestFile3() throws IOException{
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksTestFile4() throws IOException{
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void getLinksTestFile5() throws IOException{
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksTestFile6() throws IOException{
        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void getLinksTestFile9() throws IOException{
        Path fileName = Path.of("test-file9.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("math18.com"), MarkdownParse.getLinks(contents));
    }

 /*   
    @Test
    public void getLinksTestFile10() throws IOException{
        Path fileName = Path.of("test-file10.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("https://so(meth)ing.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinksTestFile11() throws IOException{
        Path fileName = Path.of("test-file11.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("IAmALink.com"), MarkdownParse.getLinks(contents));
    }
*/

    @Test
    public void testLabReportTest1() throws IOException {
        Path fileName = Path.of("lab-report-test-1.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("`google.com", "google.com", 
            "ucsd.edu"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testLabReportTest2() throws IOException {
        Path fileName = Path.of("lab-report-test-2.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("a.com", "a.com(())", 
            "example.com"), MarkdownParse.getLinks(contents));
    }

    /*
    @Test
    public void getLinksTestFile7() throws IOException{
        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksTestFile8() throws IOException{
        Path fileName = Path.of("test-file8.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }*/
}