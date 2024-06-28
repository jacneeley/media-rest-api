DROP TABLE IF EXISTS music_categories;
CREATE TABLE music_categories (
  id INT,
  name VARCHAR
);

DROP TABLE IF EXISTS music_recordings;
CREATE TABLE music_recordings (
  recording_id INT,
  artist_name VARCHAR,
  title VARCHAR,
  category VARCHAR,
  image_name VARCHAR,
  num_tracks INT,
  price FLOAT,
  stock_count INT
);

CREATE SEQUENCE music_recordings_seq START WITH 101 INCREMENT BY 1;


DROP TABLE IF EXISTS music_recordings_tx;
CREATE TABLE music_recordings_tx (
  recording_id INT,
  artist_name VARCHAR,
  title VARCHAR,
  category VARCHAR,
  image_name VARCHAR,
  num_tracks INT,
  price FLOAT,
  new_price FLOAT DEFAULT '0',
  stock_count INT
);

DROP TABLE IF EXISTS music_tracks;
CREATE TABLE music_tracks (
  id INT,
  recording_id INT,
  title VARCHAR,
  duration INT
);

DROP TABLE IF EXISTS user_roles;
CREATE TABLE user_roles (
  id INT NOT NULL AUTO_INCREMENT,
  user_name VARCHAR,
  role_name VARCHAR,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS users;
CREATE TABLE users (
  user_name VARCHAR NOT NULL DEFAULT '',
  user_pass VARCHAR,
  PRIMARY KEY (user_name)
);

DROP TABLE IF EXISTS video_actors;
CREATE TABLE video_actors (
  id INT,
  name VARCHAR,
  recording_id INT
);

DROP TABLE IF EXISTS video_categories;
CREATE TABLE video_categories (
  id INT,
  name VARCHAR
);

CREATE SEQUENCE video_categories_seq START WITH 101 INCREMENT BY 1;


DROP TABLE IF EXISTS video_recordings;
CREATE TABLE video_recordings (
  recording_id INT,
  director VARCHAR,
  title VARCHAR,
  category VARCHAR,
  image_name VARCHAR,
  duration INT,
  rating VARCHAR,
  year_released INT,
  price FLOAT,
  stock_count INT
);

DROP TABLE IF EXISTS video_recordings_tx;
CREATE TABLE video_recordings_tx (
  recording_id INT,
  director VARCHAR,
  title VARCHAR,
  category VARCHAR,
  image_name VARCHAR,
  duration INT,
  rating VARCHAR,
  year_released INT,
  price FLOAT,
  new_price FLOAT DEFAULT '0',
  stock_count INT
);
