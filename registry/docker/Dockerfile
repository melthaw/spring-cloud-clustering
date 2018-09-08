FROM clouthinkin/jre

ADD build/libs/scc-registry-1.0.0-SNAPSHOT.jar /scc-registry-1.0.0-SNAPSHOT.jar
ADD docker/container_files/ /

RUN chmod +x /*.sh

EXPOSE 80

WORKDIR /

ENTRYPOINT /docker-entrypoint.sh
