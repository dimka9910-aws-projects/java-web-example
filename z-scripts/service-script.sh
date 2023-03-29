#!/bin/sh

CMD="java -Dservice.name=$SERVICE_NAME -Dservice.title=$SERVICE_TITLE -Dservice.port=$SERVICE_PORT -jar $TARGET_PATH/app.jar"
exec $CMD