.PHONY: default test docker-test docker-build
default: docker-test

test:
	mvn test

docker-build:
	docker build . -t kata-java

docker-test:
	@docker run --rm -v ${PWD}:/opt/project -v ${PWD}/../.m2:/root/.m2 -w /opt/project kata-java make test

pre_commit:
	@echo "Trying to copy pre-commit into .git/hooks folder"
	@cp ./pre-commit ./.git/hooks
	@chmod +x ./.git/hooks/pre-commit
	@ls -la  ./.git/hooks/ | grep pre-commit
