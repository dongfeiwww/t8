package org.apache.t8.impl;

import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.PagingContext;
import com.linkedin.restli.server.annotations.Context;
import com.linkedin.restli.server.annotations.Finder;
import com.linkedin.restli.server.annotations.QueryParam;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import org.apache.t8.Tinyurl;
import java.util.*;

@RestLiCollection(name = "tinyurls", namespace = "org.apache.t8")
public class TinyurlsResource extends CollectionResourceTemplate<Long, Tinyurl>
{
  // from short url to orig url
  private static Map<String, String> urlMap = new HashMap<String, String>();
  private static String DOMAIN = "http://a.pl/";
  private static String CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHUJKLMNOPQRSTUVWXYZ0123456789";
  private static int start = 0;

  private String getShort(int n) {
    if (n > 62)
      return getShort(n/62) + String.valueOf(CHARS.charAt(n));
    else
      return String.valueOf(CHARS.charAt(n));
  }

  @Finder("add")
  public List<Tinyurl> addURL(@Context PagingContext context,
                              @QueryParam("url") String url)
  {
    List<Tinyurl> list = new ArrayList<Tinyurl>();
    Tinyurl t = new Tinyurl();
    if (url != null && !url.isEmpty()) {
      if (url.startsWith("http://"))
        url = url.substring(7);
      if (!urlMap.containsValue(url)) {
        String shortUrl = getShort(start);
        t.setShortURL(DOMAIN + shortUrl);
        urlMap.put(shortUrl, url);
        start++;
      } else {
        t.setMessage("url is added before.");
      }
    }
      
    list.add(t);
    return list;
  }

  @Finder("fetch")
  public List<Tinyurl> fetchURL(@Context PagingContext context,
                                @QueryParam("url") String url)
  {
    List<Tinyurl> list = new ArrayList<Tinyurl>();
    Tinyurl t = new Tinyurl();
    if (url != null && !url.isEmpty()) {
      url = url.trim();
      if (url.startsWith(DOMAIN)) {
        url = url.substring(DOMAIN.length());
      }
        
      if (urlMap.containsKey(url)) {
        t.setOrigURL(urlMap.get(url));
      } else {
        t.setMessage("Short URL is not found.");
      }
    }
      
    list.add(t);
    return list;
  }
}
