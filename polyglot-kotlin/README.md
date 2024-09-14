# Kotlin API

[WIP]

## Requirements

- Docker Desktop or docker-compose CLI

## Database

### Set Up
To get the local database running, do to the directory and run the started commands.

$ `cd ops/docker-compose; docker compose up`

You should see something like:

```
database-1  | PostgreSQL init process complete; ready for start up.
```

### Local Connection

- Type: Postgres
- User: `postgres`
- Password: `postgres`
- Database: `postgres`
- Port: `5432`
- URL: `jdbc:postgresql://localhost:5432/postgres`

### Terminating

And to stop and clean all up:

$ `docker compose down`

$ `docker system prune -a`