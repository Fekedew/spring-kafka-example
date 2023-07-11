# spring-kafka-example

## support for spring 3.x

## Step 1
download kafka from https://dlcdn.apache.org/kafka/3.5.0/kafka_2.13-3.5.0.tgz


## Step 2
Goto your kafka download folder and run the following two command on two terminal window

```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```

```bash
bin/kafka-server-start.sh config/server.properties
```

## Step 3
visit http://localhost:8182/api/kafka/producer?message=abcd

And watch your terminal.