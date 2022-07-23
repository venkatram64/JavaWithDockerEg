to build image run the below command
docker build -t hello-world:1.0 .

to see the images
docker images

to run the image
docker run hello-world 

to see the running docker containers

docker ps
docker ps -a

running the container in detached mode
docker run -d hello-world:2.0

to remove the container

docker rm -f app