all:
	mvn clean package site site:stage scm-publish:publish-scm deploy
