Short URL service
==================

This is a rest.li application using gradle as the build system.

To build for the first time, use gradle 1.8 or greater and run:

```
gradle build
```

You can then run the server with:

`gradle JettyRunWar`

Once running, you can send a GET request to the server with:

# get short url
`curl http://localhost:8080/t8-server/tinyurls?q=add&url=www.apple.com/index.html`
  {"elements":[{"shortURL":"http://a.pl/a"}],"paging":{"count":10,"start":0,"links":[]}}

# call it twice
  {"elements":[{"message":"url is added before."}],"paging":{"count":10,"start":0,"links":[]}}

# get original url
`curl http://localhost:8080/t8-server/tinyurls?q=fetch&url=http://a.pl/a`
  {"elements":[{"origURL":"www.apple.com/index.html"}],"paging":{"count":10,"start":0,"links":[]}}

# if not found
`curl http://localhost:8080/t8-server/tinyurls?q=fetch&url=http://a.pl/cc`
  {"elements":[{"message":"Short URL is not found."}],"paging":{"count":10,"start":0,"links":[]}}
