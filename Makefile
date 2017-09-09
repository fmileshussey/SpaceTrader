all:
	mkdir -p classes
	javac \
		-sourcepath src \
		-classpath lib/jgrapht-core-1.0.1.jar:. \
		src/*.java \
		-d classes
