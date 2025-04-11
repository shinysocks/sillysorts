.SILENT:
all:
	mkdir -p build/cpp
	g++ -Wall ./src/cpp/*.cpp -g -o ./build/cpp/driver
	./build/cpp/driver
