# Microservices Practices

This repository is used to practices microservices architecture and programming.

The project using docker, vert.x, mariadb.

To start the project, simply run:
docker-compose up --build

You will need to install docker, docker-compose, jdk installed on your machine.
Btw, there are some commons problem you will be facing, such as.
- installing docker
    Solutions: 
        https://docs.docker.com/engine/install/ubuntu/
        https://stackoverflow.com/questions/48957195/how-to-fix-docker-got-permission-denied-issue
- installing docker-compose
    Solutions: 
        https://docs.docker.com/compose/install/
- running docker and docker-compose without sudo
    Solutions:
        https://stackoverflow.com/questions/48957195/how-to-fix-docker-got-permission-denied-issue

To run the vert.x project individually:
- navigate to the project folder and run ```mvn exec:java```

