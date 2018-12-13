# lines-written-in-early-spring

Spring based Java Backend using PostgreSQL database.

## Development

Dependencies: `Java 8`, `Postgres`

### Setup DB
Setup a postgres database [Download](https://www.postgresql.org/download/).
Configure it to use the password `root` with user `postgres`.
Run it on the default port (5432).

#### Create Schema

`CREATE DATABASE lineswritteninearlyspring;`
`USE lineswritteninearlyspring;`
```sql
CREATE TABLE BOOKING (
     id SERIAL,
     client integer  NULL,
     course character varying(250)  NULL,
     price double precision  NULL,
     is_payed boolean  NULL);
```
```sql
CREATE TABLE CLIENT(
     id SERIAL,
     first_name character varying(50)  NULL,
     last_name character varying(50)  NULL,
     email_address character varying(50)  NULL);
```

### Setup Application
Open `application.properties`
Set `spring.datasource.jdbcUrl` to `jdbc:postgresql://localhost/?user=postgres&password=root`

Run

`./mvnw spring-boot:run`

## Deployment

`git push heroku master`

## Connect to dev db

`heroku pg:psql`