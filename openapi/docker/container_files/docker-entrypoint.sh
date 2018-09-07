#!/bin/bash -e

JAR_VERSION=1.0.0

echo "Using JAVA_OPTS=$JAVA_OPTS"
echo "CMD Args: $@"

java $JAVA_OPTS -jar "/hello-world-${JAR_VERSION}-SNAPSHOT.jar" "$@"