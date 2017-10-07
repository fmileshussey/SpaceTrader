all:
	mkdir -p bin
	javac \
		-sourcepath src \
		-classpath lib/jgrapht-core-1.0.1.jar \
		src/SpaceTrader.java \
		-d bin
