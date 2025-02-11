FROM sbtscala/scala-sbt:eclipse-temurin-jammy-8u402-b06_1.9.9_2.12.19

COPY . /app

WORKDIR /app

RUN apt update && apt install android-sdk -y
RUN mkdir -p $HOME/.m2/repository/javax/servlet/javax.servlet-api/3.0.1/
RUN curl -L -o $HOME/.m2/repository/javax/servlet/javax.servlet-api/3.0.1/javax.servlet-api-3.0.1.jar "https://repo1.maven.org/maven2/javax/servlet/javax.servlet-api/3.0.1/javax.servlet-api-3.0.1.jar"

RUN echo "sdk=/usr/lib/android-sdk\n\
taint-bench=/home/jclavo/Documents/unb/master/taint-bench\n" > /app/src/test/resources/taintbench.properties
RUN chmod +x runtests.sh
ENTRYPOINT [ "./runtests.sh" ] 
