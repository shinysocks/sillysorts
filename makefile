.SILENT:

all: clean java cpp

clean:
	rm -rf ./build

java:
	echo "running java sorts"
	gradle clean
	gradle run

cpp:
	echo "running cpp sorts"
	mkdir -p ./build/cpp
	g++ -Wall ./src/cpp/*.cpp -g -o ./build/cpp/driver
	./build/cpp/driver

