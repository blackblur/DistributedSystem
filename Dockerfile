FROM java:8
WORKDIR /
ADD disy-0.0.1-SNAPSHOT.jar run.jar
EXPOSE 80
CMD java -jar run.jar

