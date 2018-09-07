FROM clouthink/jre

ADD build/libs/mes/hello-world-1.0.0-SNAPSHOT.jar /hello-world-1.0.0-SNAPSHOT.jar
ADD docker/container_files/ /

RUN chmod +x /*.sh

EXPOSE 80

WORKDIR /

ENTRYPOINT /docker-entrypoint.sh
