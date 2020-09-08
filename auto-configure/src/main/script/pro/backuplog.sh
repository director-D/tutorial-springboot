#!/bin/bash
HOST=`fm|grep Host|awk '{print $2}'`
APP=AppAutoConfigure
DIR=/workspace/director/${APP}/latest/logs
#rsync -azv ${DIR}/soa.log*.gz 10.46.64.227::backup/${APP}/${HOST}/