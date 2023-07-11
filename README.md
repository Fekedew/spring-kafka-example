# spring-kafka-example

## support for spring 3.x

## download kafka from https://dlcdn.apache.org/kafka/3.5.0/kafka_2.13-3.5.0.tgz

## Goto your kafka download folder and run the following two command on two terminal window
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties

## visit http://localhost:8182/api/kafka/producer?message=abcd

watch your terminal.