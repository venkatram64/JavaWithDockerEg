#Use the OpenJDK 17 image as the base image
FROM openjdk:17

#Create a new app directory for my application files
RUN mkdir /app

#Copy the app files from host machine to image filesystem
Copy out/production/HelloWorldWithDocker/ /app


#Set the direcotry for executing future commands
WORKDIR /app

CMD java com.venkat.HelloWorld

