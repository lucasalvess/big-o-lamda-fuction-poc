## Big o lambda function performance test

Compare big O complexities using incremental and lambda algorithms working with Collections.

### Stack
- Java 14
- Docker

### Running test cases
Building images and run all test cases.

*On base project folder:*
```shell script
$ docker-compose -f docker/docker-compose.yml up --build
```

Running a specific test case:

*For each test case :*
```shell script
$ docker-compose -f docker/docker-compose.yml up --build for-test
```

*Flatmap test case :*
```shell script
$ docker-compose -f docker/docker-compose.yml up --build flatmap-test
```

*General test case (run all test case and additional algorithm complexities) :*
```shell script
$ docker-compose -f docker/docker-compose.yml up --build flatmap-test
```
