FROM clouthinkin/jre

ADD build/libs/scc-openapi-1.0.0-SNAPSHOT.jar /scc-openapi-1.0.0-SNAPSHOT.jar
ADD docker/container_files/ /

RUN chmod +x /*.sh

EXPOSE 80

WORKDIR /

ENTRYPOINT /docker-entrypoint.sh
