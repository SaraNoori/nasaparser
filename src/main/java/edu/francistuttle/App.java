package edu.francistuttle;
//import com.sun.syndication.io.XmlReader;

import java.io.File;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.XmlReader;
import com.sun.syndication.feed.synd.SyndEntry;
import java.util.List;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* 
        File feedFile = new File("C:/Users/sn1044604/Desktop/Github/nasaparser/src/main/java/edu/francistuttle/Feed.xml");
        printFeedFromFile(feedFile);
        */

        String urlString = "https://www.nasa.gov/news-release/feed/";
        printFeedFromURL(urlString);
    }

    public static void printFeedFromFile(File feedFile)
    {
        try
        {
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedFile));

            // show feed stuff
            System.out.println("Title: " + feed.getTitle());
            System.out.println("Link: " + feed.getLink());
            System.out.println("Description: " + feed.getDescription());
            

            // show each item's stuff
            for (SyndEntry entry : (List<SyndEntry>) feed.getEntries())
            {
                System.out.println("\tTitle: " + entry.getTitle());
                System.out.println("\tLink: " + entry.getLink());
                System.out.println();
            }

        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void printFeedFromURL(String urlString)
    {
        try
        {
            URL feedURL = new URL(urlString);

            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedURL));

            // show feed stuff
            System.out.println("Title: " + feed.getTitle());
            System.out.println("Link: " + feed.getLink());
            System.out.println("Description: " + feed.getDescription());
            

            // show each item's stuff
            for (SyndEntry entry : (List<SyndEntry>) feed.getEntries())
            {
                System.out.println("\tTitle: " + entry.getTitle());
                System.out.println("\tLink: " + entry.getLink());
                System.out.println();
            }

        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
