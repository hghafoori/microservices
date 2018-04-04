CREATE KEYSPACE IF NOT EXISTS springboot WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};
DROP TABLE IF EXISTS  springboot.Feed
CREATE TABLE IF NOT EXISTS  springboot.feed (
    url varchar,
    description varchar,
    id UUID,
    title varchar,
    primary key(id)
);
INSERT INTO springboot.feed (id,title,description,url)
  VALUES(uuid(),'Xebia Blogs', 'This is the Xebia Blog Site','http://blogs.xebia.com');
