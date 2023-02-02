# Demo App

This is an application to demonstrate the interaction between a database 
and an user interface through a restful api using Angular, Java and MySQL.

## Quickstart

For the operation of the application specific services a docker compose 
stack is provided. Make sure you have `docker-compose` installed on your
workstation. Execute the following command from the repository root to
start the application:

```bash
docker compose up
```

When starting the stack for the first time it take some time to build all 
necessary docker images. Three containers will be created:

* mysql
    * database with inital demo data 
    * accessible on your host system on port `3306`
* restful api
    * application programming interface written in Java using spring boot
    * accessible through [http://localhost:8080]
* user interface
    * web frontend written with Angular
    * accessible through [http://localhost:8081]

Currently there is only one rest endpoint which returns a list of people: [http://localhost:8081/v1/people]