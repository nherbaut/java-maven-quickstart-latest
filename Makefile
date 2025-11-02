site:
	mvn clean package site site:stage scm-publish:publish-scm 
docker:
	mvn clean package docker:build
push:
	mvn docker:push
run:
	mvn docker:run
